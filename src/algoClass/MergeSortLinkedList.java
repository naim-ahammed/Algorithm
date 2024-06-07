package algoClass;


class NodeMS {
    int data;
    NodeMS next;


    public NodeMS(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortLinkedList {
    NodeMS head;

    public void mergeSort() {
        head = mergeSort(head);
    }

    private NodeMS mergeSort(NodeMS h) {
        if (h == null || h.next == null) {
            return h;
        }

        NodeMS middle = getMiddle(h);
        NodeMS nextOfMiddle = middle.next;

        middle.next = null;

        NodeMS left = mergeSort(h);
        NodeMS right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    private NodeMS merge(NodeMS left, NodeMS right) {
        NodeMS result = null;

        // Base cases
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    private NodeMS getMiddle(NodeMS h) {
        if (h == null) {
            return h;
        }

        NodeMS slow = h, fast = h;

        // Move 'fast' by two steps and 'slow' by one step
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void push(int newData) {
        NodeMS newNode = new NodeMS(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        NodeMS temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();
        list.push(90);
        list.push(23);
        list.push(101);
        list.push(45);
        list.push(65);
        list.push(23);
        list.push(67);
        list.push(89);
        list.push(34);
        list.push(23);

        System.out.println("Original Linked List:");
        list.printList();

        list.mergeSort();

        System.out.println("Sorted Linked List:");
        list.printList();
    }
}
