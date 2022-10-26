package samostoiatelnayrabota;

public class Selection {

    public static void main(String[] args) {

        int[] array  = new int[]{-5,1,7,3,9,1,4,-2};

        int maxMultiply = array[0]*array[1];

        for (int i = 1; i <array.length-1; i++) {

            if (array[i]*array[i+1]>maxMultiply){

                maxMultiply = array[i]*array[i+1];
            }

        }

        System.out.print(maxMultiply);
    }


}
