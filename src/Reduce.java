public class Reduce {
    static void main() {
        int steps = 0;
        System.out.println(stepsAmount(114514));
    }

    public static int stepsAmount(int n){
        int i = 0;
        while(n>0){
            if(n%2 == 0){
                n = n/2;
            }
            else{
                n = n-1;
            }
            i+=1;
        }
        return i;
    }
}
