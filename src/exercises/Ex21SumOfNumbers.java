package exercises;

public class Ex21SumOfNumbers {

  public static void main(String[] args) {

    int[] nums = {1,2,3,4,5,6,7,8,9};
    System.out.println(sumOfNumbers(nums));

  }

  static int sumOfNumbers(int[] nums) {
    int sum = 0;
    for (int num: nums) {
      if (num%2 == 0) sum += num;
    }
    return sum;
  }

}
