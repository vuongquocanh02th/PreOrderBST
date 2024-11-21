public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Thêm các phần tử vào cây
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Hiển thị cây theo thứ tự Pre-order
        System.out.println("Pre-order traversal of the BST:");
        bst.preOrder();  // Kết quả sẽ in theo thứ tự Pre-order
        System.out.println();

        // Hiển thị cây theo thứ tự In-order (để so sánh)
        System.out.println("In-order traversal of the BST:");
        bst.inOrder();  // Kết quả sẽ in theo thứ tự In-order
        System.out.println();
    }
}