/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


*/
/**
 * The type Sand box.
 *//*

public class SandBox {

    */
/**
     * The entry point of application.
     *
     * @param args the input arguments
     *//*

    public static void main(String[] args) {

        // isBlank(), isEmpty()
//        String nonBlank = "hello";
        Scanner scanner = new Scanner(System.in);
//        String blankInput = scanner.nextLine();
//        System.out.println("If non-blank: " + nonBlank.isBlank());
//        System.out.println("If blank: " + blankInput.isEmpty());
//
//
//        String isBlankCheck = scanner.nextLine();
//        if(isBlankCheck.length() == 0){
//            System.out.println("Is empty");
//        }
//        if(isBlankCheck.isEmpty()){
//            System.out.println("Is empty");
//        }
//        System.out.println(isBlankCheck.codePointAt(0));
//

            //isBlank()
//        if(isBlankCheck.isBlank()){
//            System.out.println("Is empty");



        // lines
        String str = "JD\nJD\nJD";
        System.out.println(str.lines().collect(Collectors.toList()));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

//stream of arrayList
        Integer[] integers = numbers.toArray(Integer[]::new);
        Arrays.stream(integers).forEach(System.out::println);

        //local-variable syntax for lambda expression
        var list = new ArrayList<String>();
        //type inference introduced in java 10

        (num1, num2) -> num1 + num2;
    }
}
*/
