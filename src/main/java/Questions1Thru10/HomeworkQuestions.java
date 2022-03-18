package Questions1Thru10;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeworkQuestions {
    // Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    // Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length-1];
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length-2];
    }

    // Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i:ints){
            sum = sum + i;
        }
        return sum;
    }

    // Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int i:ints){
            sum = sum + i;
        }
        int avg = sum / ints.length;
        return avg;
    }
    // Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNum = "";
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i] % 2 != 0){
                oddNum += numbers[i] + " ";
            }
        }
        return oddNum;
    }


    // Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNums = "";
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i] % 2 == 0){
                evenNums += numbers[i] + " ";
            }
        }

        return evenNums;
    }

    // Question 10
    public static boolean contains(String[] names, String element) {
        for (String name:names){
            if (name.equals(element)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"first", "second","third","fourth","fifth"};
        int numbers[] = {1,2,3,4,5};

        System.out.println(getLastIndex(arr));
        System.out.println(getSecondToLastIndex(arr));
        System.out.println(getFirstElement(arr));
        System.out.println(getLastElement(arr));
        System.out.println(getSecondToLastElement(arr));
        System.out.println("=============================================");
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
        System.out.println("=============================================");
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println(extractAllEvenNumbers(numbers));
        System.out.println("=============================================");
        System.out.println(contains(arr,"first"));
        System.out.println(contains(arr,"b"));



    }
}
