public class MyMath {

    public static int myPowIterative(int a, int b) {

        int result = a;

        for(int i = 0; i < (b-1); i ++){
            result *= a;
        }

        return result;
    }

    public static int myPowRecursion(int a, int b){

        int result;
        int result2 = a;
        if(b > 1) {
            result = myPowRecursion(a, b - 1);
            result2 *= result;
        }
        return result2;
    }

    public static int findSmallest(int[] myArray){
        int searchPosition = 0;
        int smallest = -1;

        if(myArray.length > searchPosition ){
            smallest = findSmallest(myArray);
            searchPosition++;
        }
        return  smallest;
    }
}
