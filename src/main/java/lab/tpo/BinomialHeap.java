package lab.tpo;

public class BinomialHeap {
    BinomialNode root;

    public BinomialHeap() {
        root = null;
    }

    public void insert(int key) {
        BinomialHeap newHeap = new BinomialHeap();
        newHeap.root = new BinomialNode(key);
        this.root = merge(this.root, newHeap.root);
    }

    private BinomialNode merge(BinomialNode h1, BinomialNode h2) {
        if (h1 == null) return h2;
        if (h2 == null) return h1;

        BinomialNode head;
        BinomialNode tail;

        if (h1.key <= h2.key) {
            head = h1;
            h1 = h1.sibling;
        } else {
            head = h2;
            h2 = h2.sibling;
        }
        tail = head;

        while (h1 != null && h2 != null) {
            if (h1.key <= h2.key) {
                tail.sibling = h1;
                h1 = h1.sibling;
            } else {
                tail.sibling = h2;
                h2 = h2.sibling;
            }
            tail = tail.sibling;
        }

        if (h1 != null) {
            tail.sibling = h1;
        } else {
            tail.sibling = h2;
        }

        return head;
    }

    public int extractMin() {
        if (root == null) throw new RuntimeException("Heap is empty");

        BinomialNode minNode = root;
        BinomialNode prevMin = null;
        BinomialNode current = root;
        BinomialNode prev = null;

        while (current.sibling != null) {
            if (current.sibling.key < minNode.key) {
                minNode = current.sibling;
                prevMin = prev;
            }
            prev = current;
            current = current.sibling;
        }

        if (prevMin != null) {
            prevMin.sibling = minNode.sibling;
        } else {
            root = minNode.sibling;
        }

        BinomialNode child = minNode.child;
        BinomialNode reversed = null;
        while (child != null) {
            BinomialNode next = child.sibling;
            child.sibling = reversed;
            reversed = child;
            child = next;
        }

        root = merge(root, reversed);
        return minNode.key;
    }

    static class BinomialNode {
        int key;
        BinomialNode sibling, child;

        public BinomialNode(int key) {
            this.key = key;
            this.sibling = this.child = null;
        }
    }
}