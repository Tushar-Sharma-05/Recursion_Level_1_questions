public class Print_n_numbers {
    public static void main(String[] args) {


//        print(5);
        printRev(5);
        print(5);
    }

    static void print(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        print(n - 1);

    }

    static void printRev(int n){

        if(n==0){
            return;
        }

        printRev(n - 1);
        System.out.println(n);

    }
}