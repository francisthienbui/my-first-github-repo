public class CodingBat {

    public static void main(String[] args){
        System.out.println(sleepIn(false, false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(2,3));
        System.out.println(parrotTrouble(true,6));
        System.out.println(makes10(9, 10));
        System.out.println(diff21(2100000));

        int[] arr = new int[]{1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(arr));

        System.out.println("GitHub is kinda hard to use LOL");
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

    public static boolean parrotTrouble(boolean talking, int hour){
        boolean result = false;

        if( hour < 7 || hour > 20) {
            if(talking == true){
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static boolean makes10(int a, int b){
        boolean result  = false;

        int sum = a + b;

        if( (a == 10) || (b == 10) ) {
            result = true;
        } else if ( sum == 10) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static int sum67(int[] nums){
        int sum = 0;
        int annul7=0;
        for (int i =0 ; i <nums.length;i++)
        {
            if(nums[i] == 6)
            {
                for( int j = i; nums[j] != 7;j++)
                {
                    nums[j] = 0;
                    annul7 = j;
                }
                nums[annul7+1] =0;
            }
            else
                sum += nums[i];
        }
        return sum;
    }


}
