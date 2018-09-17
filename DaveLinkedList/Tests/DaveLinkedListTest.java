import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DaveLinkedListTest {

    private DaveLinkedList<String> list = new DaveLinkedList<>();

    @Test
    void addFirst() {
        list.addFirst("Mike");

        assertEquals();
    }

    @Test
    void getFirst() {
    }

    @Test
    void removeFirst() {

    }

    @Test
    void isEmpty() {

        assertTrue(list.isEmpty());

        list.addFirst("Dave");

        assertFalse(list.isEmpty());
    }
}