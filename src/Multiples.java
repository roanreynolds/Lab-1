public class Multiples {
    static void main() {
        System.out.println( amountOfMultiples(3,5, 1000) );

    }

    public static int amountOfMultiples(int i1, int i2, int max) {
        return max/i1 + max/i2 - max/(i1*i2); //assumesg i1 and i2 are coprime
        //this has a good time complexity
    }
}


