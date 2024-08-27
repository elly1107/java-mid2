package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first );

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        int index = 2;
        Node indexNode = getNode(first, index);
        System.out.println("indexNode = " + indexNode);

        add(first, "D");
        add(first, "E");
        add(first, "F");
        System.out.println("first = " + first);
    }

    private static void add(Node node, String s) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(s);
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x=x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x=x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x=x.next;
        }
        return x;
    }
}
