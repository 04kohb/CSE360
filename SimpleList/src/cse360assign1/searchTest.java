import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class searchTest {

    @Test
    void test() {
        SimpleList list = new SimpleList();
        list.add(2);
        list.add(0);
        list.add(1);
        int output = list.search(2);
        assertEquals(2, output);
    }

}
