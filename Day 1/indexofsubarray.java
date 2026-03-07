  import java.util.*;
public class indexofsubarray {
   

     static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int sum = 0;

        for(int j = 0; j < arr.length; j++) {

            sum += arr[j];

            while(sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }

            if(sum == target) {
                list.add(i + 1);
                list.add(j + 1);
                return list;
            }
        }

        list.add(-1);
        return list;
    }
}

