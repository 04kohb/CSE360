import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

    @Test
    void test() {
        SimpleList list = new SimpleList();
        list.add(3);
        list.add(0);
        list.add(1);
        int output = list.count();
        assertEquals(3, output);
 
    }

}
