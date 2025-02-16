import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CreateAListFromArrayAndPrint {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6,7,8});
        List<Integer> lister = intStream.boxed().collect(Collectors.toList());
        System.out.println(lister);
    }
}
