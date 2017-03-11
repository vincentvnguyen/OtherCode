import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>(n);
        // loop through every number
        for (int number = 1; number <= n; number++){
            if (number % 3 == 0){
                if (number % 5 == 0){
                    answer.add("FizzBuzz");
                }
                else{
                    answer.add("Fizz");
                }
            }
            else if (number % 5 == 0){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(number));
            }
        }
        return answer;
    }
}
