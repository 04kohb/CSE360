import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class toStringTest {

    @Test
    void test() {
        SimpleList list = new SimpleList();
        list.add(1);
        list.add(2);
        String output = list.toString();
        assertEquals("2 1",output);
    }

}
