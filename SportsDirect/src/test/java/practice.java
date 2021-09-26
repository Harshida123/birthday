import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice
{
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");


        System.out.println("this is code"+ listOfStrings);

        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        int s = Integer.parseInt(String.valueOf(listOfIntegers));

        System.out.println(listOfIntegers);
    }
}