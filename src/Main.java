import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/6/27 4:49
 * @e-mail: thinfog@126.com
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> dictionary = new ArrayList<>();
        ArrayList<ArrayList<Integer>> total = new ArrayList<>();
        while (true) {
            ArrayList<Integer> test = createNewInstance();
            if (ArraysContains(dictionary,test)){
                continue;
            }else{
                dictionary.add(test);
            }
            if (!ArraysContains(total,test)){
                total.add(test);
            }
            System.out.println("现在一共例举例了"+total.size()+"种走法！");
            System.out.println("现在一共有"+dictionary.size()+"种走法！");
            if (dictionary.size() == 42)
                break;
        }
        System.out.println(Arrays.deepToString(dictionary.toArray()));

    }

    public static boolean ArraysContains(ArrayList<ArrayList<Integer>> lists,ArrayList<Integer> value){
        for (ArrayList<Integer> a:lists){
            if (IsSameInstance(a,value)){
                return true;
            }
        }
        return false;
    }

    public static int getStepCount() {
        int num = new Random().nextInt(3);
        return num != 0 ? num : getStepCount();
    }

    public static ArrayList nextStep(ArrayList<Integer> arr, int num) {
        if (arr.size() > 6) {
            return arr;
        }
        return arr.add(num) == true ? arr : null;
    }

    public static ArrayList<Integer> createNewInstance() {
        ArrayList<Integer> res = new ArrayList<>();
        do {
            if (res.size() >= 6) {
                break;
            }
            res = nextStep(res, getStepCount());
        } while (!CheckInstance(res));
        return res;
    }

    public static boolean IsSameInstance(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr1.size() != arr2.size()) {
            return false;
        }
        for (int i = 0, len = arr1.size(); i < len; i++) {
            if (arr1.get(i) != arr2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckInstance(ArrayList<Integer> arr) {
        int total = 0;
        for (int i = 0, len = arr.size(); i < len; i++) {
            total += arr.get(i);
        }
        return total == 7;
    }


}
