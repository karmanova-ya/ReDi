//3. Questions Marks (from https://www.coderbyte.com/editor/Questions%20Marks:Java)
//
//Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
//
//For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.

import java.util.ArrayList;

public class QuestionsMarks {

    public static void main(String[] args) {
        System.out.println("true - " + questionMarks("??6???4gt765??h6"));
//        System.out.println("false - " + questionMarks("1???9asd5???6"));
//        System.out.println("false - " + questionMarks("false" + "adsf?3???5e3?3d6???9f?3s"));
//        System.out.println("false - " + questionMarks("????3??7jdndb"));
//        System.out.println("true - " + questionMarks("acc?7???3sss?3rr1???9"));
//        System.out.println("false - " + questionMarks("acc?7???3sss?3rr2???9"));

    }

    public static boolean questionMarks(String str) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean result = false;

        char[] strChar = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if (Character.isDigit(strChar[i])) {
                numbers.add(Integer.parseInt(String.valueOf(strChar[i])));
            }else if ( strChar[i] == '?' && !numbers.isEmpty()){
                int total = numbers.get(0) + numbers.get(1);
                result = total == 10;
            }
        }
        return result;
    }
}
