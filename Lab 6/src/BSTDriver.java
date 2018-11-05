public class BSTDriver {

    public static void main(String[] args) {
        BinarySearchTree<String> driverTree = new BinarySearchTree<>();

        driverTree.insert("Joseph");
        driverTree.insert("Dave");
        driverTree.insert("Jack");
        driverTree.insert("Darren");
        driverTree.insert("Mark");
        driverTree.insert("Mai");
        driverTree.insert("Mike");

        System.out.println("\nPRE ORDER ITERATIVE");
        driverTree.printPreOrderIterative();

        System.out.println("\nBREADTH FIRST ITERATIVE");
        driverTree.printBreadthFirstIterative();

    }
}
