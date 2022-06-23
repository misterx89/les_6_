import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestArr1and4 {
    public static Stream<Arguments> dataForAfter4() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{2, 5, 4, 7, 8}, false));
        list.add(Arguments.arguments(new int[]{1, 1, 4}, true));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4}, false));
        list.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1}, false));
        return list.stream();
    }
    @ParameterizedTest
    @MethodSource("dataForContainsOnly1and4")
    public void massTestContainsOnly1and4(int[] in, boolean flag) {
        Assertions.assertArrayEquals(flag, Main.arrayContainsOnly1and4(in));
    }
}
