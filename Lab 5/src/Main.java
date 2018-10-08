public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 8;

        int answer = MyMath.myPowIterative(a,b);

        System.out.println(answer);

        int answerRecursion = MyMath.myPowRecursion(a,b);

        System.out.println(answerRecursion);

        int[] myArray = {5,1,8,5,6,4,3,7,9,32,12};

        int smallestInArray = MyMath.findSmallest(myArray);

        System.out.println(smallestInArray);
    }
}
