public class Ques1 {
    public static void main(String[] args) {
        System.out.println(StringManipulation.toUpperReverse("Vikash"));
        System.out.println(StringManipulation.toLowerReverse("Rai"));
    }
}
interface StringManipulation{
    private static String reverse(String string){
        return new StringBuilder(string).reverse().toString();
    }
    static String toLowerReverse(String string){
        return reverse(string).toLowerCase();
    }
    static String toUpperReverse(String string){
        return reverse(string).toUpperCase();
    }
}
