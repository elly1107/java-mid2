package collection.link;


public class MyLinkedListV2 {
    private Node first;
    private int size=0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode=getLastNode();
            lastNode.next=newNode;
        }
        size++;
    }

    private Node getLastNode() {
       Node x = first;
        while (x.next != null) {
            x=x.next;
        }
        return x;

    }

    //추가
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            //First에는 첫번째 노드 주소가 들어있기 때문에, newNode.next에 원래 첫번째 노드를 넣어주고, first에 newNode를 넣어줌
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next=prev.next;
            prev.next=newNode;
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item=element;
        return oldValue;
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next=removeNode.next;
        }
        removeNode.item=null;
        removeNode.next=null;
        size--;
        return removeItem;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x=x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index=0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedLIstV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
