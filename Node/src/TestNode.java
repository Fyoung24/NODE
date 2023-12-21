public class TestNode {
    public static void main(String[] args) {
        // Test constructors
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3, node2, node1);

        // Test accessors and mutators
        node1.setChildNode(node3);
        node2.setParentNode(node3);

        // Test toString
        System.out.println(node1);  // Output: Node: 1
        System.out.println(node3);  // Output: Node: 3

        // Test equals
        System.out.println(node1.equals(node2));  // Output: false
        System.out.println(node1.equals(new Node<>(1)));  // Output: true
    }
}
