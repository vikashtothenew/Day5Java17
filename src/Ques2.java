import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques2 {

    public static void main(String[] args) {

        System.out.println(IntStream
                .rangeClosed(1,20)
                .takeWhile(x->x<=11)
                .boxed()
                .collect(Collectors.toList()));


        System.out.println(IntStream
                .rangeClosed(1,10)
                .dropWhile(x->x<=7)
                .boxed()
                .collect(Collectors.toList()));


    }
}