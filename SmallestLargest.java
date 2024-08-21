//put your name heremichael zhang
public class SmallestLargest{
    public static void main(String[] args){
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Smallest value: " + smallestValue(numbers));
        System.out.println("Largest value: " + largestValue(numbers));
    }

    public static int smallestValue(){
 int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int largestValue(){
         int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}