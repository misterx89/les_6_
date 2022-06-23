import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestArray {
    @Test
    public void test1ArrAfter4() {
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] out = new int[]{5, 6, 7, 8};
        Assertions.assertArrayEquals(out, Main.arrAfter4(in));
    }

    @Test
    public void test2ArrAfter4() {
        int[] in = new int[]{1, 3, 5, 6, 7, 8};
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.arrAfter4(in);
        });
    }

    @Test
    public void test1arrayContainsOnly1and4() {
        int[] in = new int[]{1, 3, 4, 5};
        Assertions.assertFalse(Main.arrayContainsOnly1and4(in));
    }

    @Test
    public  void test2arrayContainsOnly1and4 () {
        int[] in = new int[]{1, 4, 1};
        Assertions.assertTrue(Main.arrayContainsOnly1and4(in));
    }
}


