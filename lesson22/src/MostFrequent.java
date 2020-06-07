import java.util.HashMap;
//2. Most frequent element in an array (from https://www.geeksforgeeks.org/frequent-element-array/)
//
//Given an array, find the most frequent element in it.
// If there are multiple elements that appear maximum number of times, print any one of them.

public class MostFrequent {

    public static void main(String[] args) {

        int[] numbers = {2, 1, 4, 3, 1, 3, 1};
        HashMap<Integer, Integer> frequent = new HashMap<>();

        for (int i : numbers) {
            frequent.put(i, 0);
        }

        for(int i : numbers){
            frequent.put(i, frequent.get(i)+1);
        }

        int key = numbers[0];
        int highestOccurence = frequent.get(key);
        for (int k :  frequent.keySet()){
            if(frequent.get(k) > highestOccurence){
                highestOccurence = frequent.get(k);
                key = k;
            }
        }
        System.out.println(key);
    }
}

