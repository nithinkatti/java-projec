package NEW;

	import java.util.*;

	class Node {
	    String name;
	    Node left, right;

	    Node(String name) {
	        this.name = name;
	        left = right = null;
	    }
	}

	public class BinaryTree {

	    // Count total nodes
	    static int countNodes(Node node) {
	        if (node == null) return 0;
	        return 1 + countNodes(node.left) + countNodes(node.right);
	    }

	    // Count leaf nodes
	    static int countLeafNodes(Node node) {
	        if (node == null) return 0;
	        if (node.left == null && node.right == null) return 1;
	        return countLeafNodes(node.left) + countLeafNodes(node.right);
	    }

	    // Top to bottom (pre-order traversal)
	    static void printTopToBottom(Node node) {
	        if (node == null) return;
	        System.out.println(node.name);
	        printTopToBottom(node.left);
	        printTopToBottom(node.right);
	    }

	    // In-order (left to right)
	    static void printInOrder(Node node) {
	        if (node == null) return;
	        printInOrder(node.left);
	        System.out.println(node.name);
	        printInOrder(node.right);
	    }

	    // Flip the tree (swap left and right)
	    static void flipTree(Node node) {
	        if (node == null) return;
	        Node temp = node.left;
	        node.left = node.right;
	        node.right = temp;
	        flipTree(node.left);
	        flipTree(node.right);
	    }

	    // Print all paths from root to leaf
	    static void printAllPaths(Node node, List<String> path) {
	        if (node == null) return;

	        path.add(node.name);

	        if (node.left == null && node.right == null) {
	            System.out.println(String.join(" -> ", path));
	        } else {
	            printAllPaths(node.left, path);
	            printAllPaths(node.right, path);
	        }

	        path.remove(path.size() - 1); // backtrack
	    }

	    public static void main(String[] args) {
	        // Create the tree
	        Node root = new Node("mom");
	        root.left = new Node("dad");
	        root.right = new Node("you");

	        // 1. Print the root of the root
	        System.out.println("Root of the tree: " + root.name);

	        // 2. Print left and right children of the root
	        System.out.println("Left child: " + root.left.name);
	        System.out.println("Right child: " + root.right.name);

	        // 3. Top to bottom traversal
	        System.out.println("\nTop to bottom (pre-order):");
	        printTopToBottom(root);

	        // 4. Count total nodes
	        System.out.println("\nTotal nodes: " + countNodes(root));

	        // 5. Count leaf nodes
	        System.out.println("Leaf nodes (no children): " + countLeafNodes(root));

	        // 6. Print names left to right (in-order)
	        System.out.println("\nLeft to right (in-order):");
	        printInOrder(root);

	        // 7. Flip the tree
	        flipTree(root);
	        System.out.println("\nTree flipped! (left and right children swapped)");

	        // Print names again after flip
	        System.out.println("\nLeft to right after flip:");
	        printInOrder(root);

	        // 8. Print all paths from root to leaf
	        System.out.println("\nAll paths from root to leaf:");
	        printAllPaths(root, new ArrayList<>());
	    }
	}



