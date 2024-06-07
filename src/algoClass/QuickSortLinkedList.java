package algoClass;

class NodeQS {
    int data;
    NodeQS next;

    public NodeQS(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QuickSortLinkedList {
    NodeQS head;

    public void quickSort() {
        head = quickSort(head);
    }

    private NodeQS quickSort(NodeQS head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Partition the list and obtain the pivot node
        NodeQS[] result = partition(head);
        NodeQS pivot = result[0];
        head = result[1];

        // Recursively sort the partitions
        NodeQS left = quickSort(head);
        NodeQS right = quickSort(pivot.next);

        // Concatenate the sorted partitions and pivot
        pivot.next = right;

        if (left == null) {
            return pivot;
        }

        NodeQS temp = left;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = pivot;
        return left;
    }

    private NodeQS[] partition(NodeQS head) {
        NodeQS pivot = head;
        head = head.next;
        pivot.next = null;

        NodeQS lessThanPivot = null;
        NodeQS greaterThanOrEqualPivot = null;

        while (head != null) {
            NodeQS nextNode = head.next;
            if (head.data < pivot.data) {
                head.next = lessThanPivot;
                lessThanPivot = head;
            } else {
                head.next = greaterThanOrEqualPivot;
                greaterThanOrEqualPivot = head;
            }
            head = nextNode;
        }

        if (lessThanPivot == null) {
            return new NodeQS[]{pivot, greaterThanOrEqualPivot};
        }

        NodeQS[] result = new NodeQS[]{lessThanPivot, greaterThanOrEqualPivot};
        return result;
    }

    public void push(int newData) {
        NodeQS newNode = new NodeQS(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        NodeQS temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSortLinkedList list = new QuickSortLinkedList();
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

        list.quickSort();

        System.out.println("Sorted Linked List:");
        list.printList();
    }
}
