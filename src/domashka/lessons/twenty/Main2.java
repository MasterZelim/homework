package domashka.lessons.twenty;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        System.out.println(metod());
        System.out.println(Arrays.toString(metod2()));
        System.out.println(Arrays.toString(metod3()));
    }

    public static boolean metod() {

        int[] nums = {1, 4, 3, 1, 2, 8};
        Set<Integer> hashSet = new HashSet<>();
        for (int d : nums) {
            hashSet.add(d);
        }

        if (nums.length > hashSet.size()) {
            return true;
        } else {
            return false;
        }
    }
    public static int[] metod2() {

        int[] nums = {1, 4, 3, 1, 2, 8};
        int[] nums2 = {4, 6, 4, 1, 7, 1};
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int d : nums) {
            hashSet.add(d);
        }
        for (int d : nums2) {
            hashSet2.add(d);
        }
        for (int d:hashSet) {
            for (int c: hashSet2) {
                if (d==c){
                    arrayList.add(d);
                }
            }
        }
        int[] ints = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            ints[i] = arrayList.get(i);
        }
        return ints;
    }

    public static int[] metod3() {

        int[] nums = {1, 3, 7, 1, 4, 7};
        int[] nums2 = {4, 6, 4, 7, 7, 1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int a:nums) {
            arrayList1.add(a);
        }
        for (int a:nums2) {
            arrayList2.add(a);
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            for (int j = 0; j < arrayList2.size(); j++) {
                if (arrayList1.get(i)==arrayList2.get(j)){
                    arrayList.add(nums[i]);
                    arrayList2.remove(j);
                    break;
                }
            }
        }
        int[] ints = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            ints[i] = arrayList.get(i);
        }
        return ints;
    }

}
