public class SumDigit {
    public static void main(String[] args) {


        System.out.println(sum(1236));
    }

    static int sum(int n) {

        if(n<=1){
            return 1;
        }

        int lastdigit = n%10;
        return lastdigit + sum(n/10);






    }
}
