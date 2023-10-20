import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        Integer[] shuffledArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(shuffledArray));
    }
}
