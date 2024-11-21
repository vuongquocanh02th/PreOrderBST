public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Phương thức thêm phần tử vào cây
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Phương thức duyệt theo thứ tự Pre-order (Đệ quy)
    public void preOrder() {
        preOrderRec(root);
    }

    // Phương thức đệ quy thực hiện duyệt Pre-order
    private void preOrderRec(Node root) {
        if (root != null) {
            // Bước 1: Truy cập và xử lý nút gốc
            System.out.print(root.data + " ");

            // Bước 2: Duyệt cây con bên trái
            preOrderRec(root.left);

            // Bước 3: Duyệt cây con bên phải
            preOrderRec(root.right);
        }
    }

    // Phương thức duyệt cây theo thứ tự In-order để hiển thị cây
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
}
