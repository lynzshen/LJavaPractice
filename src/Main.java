import java.lang.reflect.Array;

public class Main {

    public static void main(String args[]) {


        int[] blam = {2, 34, 56, 67, 89, 111, 222, 364, 890, 999, 1000,9999};
        int bla[] = new int[10];
        bla[2] = 14;


        System.out.println("length blam = " +blam.length);
        System.out.println("4th element blam = " +blam[3]);

        System.out.println("length bla = " +bla.length);
        System.out.println("3th element bla = " +bla[2]);

        // int[] intArray = IntStream.range(1, 11).toArray();

    }

    public static int binaryList(int search, int[] arrayParameterFormat) {
        int low = 0;
        int high = arrayParameterFormat.length - 1;
        int guess = low + high / 2;

        while (arrayParameterFormat[guess] != search) {
            guess = low + high / 2;
            if (arrayParameterFormat[guess] == search) {
                return guess;
            }else if (arrayParameterFormat[guess] > search) {
                high = guess;
            } else if (arrayParameterFormat[guess] < search) {
                low = guess;
            }else {return -1;}
            }
        return -1;
    }


    }

