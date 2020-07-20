public class CodingBat {

    public static void main(String[] args){
        System.out.println(sleepIn(false, false));
        System.out.println(monkeyTrouble(true, true));

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
}
