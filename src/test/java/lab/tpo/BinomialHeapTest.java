package lab.tpo;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinomialHeapTest {

    @Test
    void testInsertSingleElement() {
        BinomialHeap heap = new BinomialHeap();
        heap.insert(10);
        assertEquals(10, heap.extractMin(), "Минимальный элемент должен быть 10");
    }

    @Test
    void testInsertMultipleElements() {
        BinomialHeap heap = new BinomialHeap();
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        assertEquals(5, heap.extractMin(), "Минимальный элемент должен быть 5");
    }

    @Test
    void testExtractMinFromEmptyHeap() {
        BinomialHeap heap = new BinomialHeap();
        assertThrows(RuntimeException.class, heap::extractMin, "Извлечение из пустой кучи должно выбрасывать исключение");
    }

    @Test
    void testExtractMinAfterMultipleInsertions() {
        BinomialHeap heap = new BinomialHeap();
        heap.insert(100);
        heap.insert(50);
        heap.insert(25);
        heap.insert(10);
        assertEquals(10, heap.extractMin(), "Минимальный элемент должен быть 10");
        assertEquals(25, heap.extractMin(), "Следующий минимальный элемент должен быть 25");
    }

    @Test
    void testHeapStructure() {
        BinomialHeap heap = new BinomialHeap();

        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(40);

        assertTrue(isValidBinomialHeap(heap.root), "Структура кучи после нескольких вставок должна быть корректной");
    }


    @Test
    void testHeapBalance() {
        final Random random = new Random();

        BinomialHeap heap = new BinomialHeap();

        for (int i = 10_000; i > 0; --i) {
            heap.insert(random.nextInt(100_000));
        }

        assertTrue(isValidBinomialHeap(heap.root), "Куча должна быть сбалансирована");
    }


    private boolean isValidBinomialHeap(BinomialHeap.BinomialNode node) {
        if (node == null) return true;

        BinomialHeap.BinomialNode child = node.child;
        while (child != null) {
            if (child.key < node.key) return false;
            child = child.sibling;
        }

        return isValidBinomialHeap(node.child) && isValidBinomialHeap(node.sibling);
    }
}
