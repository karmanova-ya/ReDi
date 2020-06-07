public class FizzBuzz {

    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        System.out.println("Printing FizzBuzz starting at " + start + " ending at " + end);
        for (int index = start; index <= end; index++) {
            if (!isFizzOrBuzz(index)) {
                System.out.println(index);
            }
        }
    }

    private static boolean isFizzOrBuzz(int index) {
        boolean result = false;
        if (index % 3 == 0) {
            System.out.print("Fizz");
            result = true;
        }
        if (index % 5 == 0) {
            System.out.print("Buzz");
            result = true;
        }
        if (result)
            System.out.println("");
        return result;
    }
}
