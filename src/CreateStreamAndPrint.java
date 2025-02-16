import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class CreateStreamAndPrint {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Stream<Integer> listerStream = list.stream();
        List<Integer> evenNums = listerStream.filter(n->n%2==0).collect(Collectors.toList());
        evenNums.stream().forEach(n -> System.out.println(n));
    }
}
