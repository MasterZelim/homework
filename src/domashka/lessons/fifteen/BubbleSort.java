package domashka.lessons.fifteen;

public class BubbleSort {

    public static void main(String[] args) {

        int[] ints = {1,-6,8,7,-4,3};

        for (int i = 1; i < ints.length; i++) {

            for (int j = 0; j < ints.length-i; j++) {
                if (ints[j]>ints[j+1]){
                    int temp = ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=temp;
                }
            }
        }
        for (int a:ints ) {
            System.out.print(a);
        }
    }
}
