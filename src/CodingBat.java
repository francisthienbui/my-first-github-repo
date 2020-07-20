public class CodingBat {

    public static void main(String[] args){
        System.out.println(sleepIn(false, false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(2,3));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || !vacation){
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        boolean result = false;

        if((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)){
            result = true;
        }

        return result;
    }

    public static  int sumDouble(int a, int b){
        int result = 0;

        if(a == b) {
            result = 2 * (a + b);
        } else {
            result = a + b;
        }

        return result;
    }

    public static int diff21(int n){
        int result = 0;

        if(n < 21){
            result = 21 - n;
        } else if ( n > 21) {
            result = 2 * (n - 21);
        }

        return result;

    }
}
