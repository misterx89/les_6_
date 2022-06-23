import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestAfterArr4 {
    public static Stream<Arguments>dataForAfter4() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[] {2, 5, 4, 7, 8}, new int[] {7, 8}));
        list.add(Arguments.arguments(new int[] {2, 5, 4,}, new int[] {}));
        list.add(Arguments.arguments(new int[] {2, 5, 4, 7, 8, 4}, new int[] {}));
        list.add(Arguments.arguments(new int[] {2, 5, 4, 7, 4, 8}, new int[] {8}));
        return list.stream();
    }
    @ParameterizedTest
    @MethodSource("dataForAfter4")
    public void massTestArrAfter4(int[] in, int[] out) {
        Assertions.assertArrayEquals(out, Main.arrAfter4(in));
    }
}
