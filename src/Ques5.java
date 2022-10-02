import java.util.stream.IntStream;

public class Ques5 {
    public static void main(String[] args) {
        IntStream
                .rangeClosed(1,10)
                .filter(e->e>10)
                .findFirst()
                .ifPresentOrElse(
                        (e)-> System.out.println("The value is::"+e),
                        ()-> System.out.println("Value does not exists")
                );
        IntStream
                .rangeClosed(1,10)
                .filter(e->e>50)
                .findFirst().orElseThrow();
    }
}


