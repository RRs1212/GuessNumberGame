public class checkingGuessingNumber {


//    public String check(int value,int target,int rotate){
//        String str=null;
//        if(value==target){
//            rotate=1;
//            return "wow!! you guessed it right";
//        } else if (value<target) {
//            return "My number is greater than your number";
//
//        }else return "My number is lesser than your number";
//
//
//    }
    public int ckeck(int value,int target){
        if(value==target) return 0;
        else if (value<target) return 1;
        else return 2;


    }
}
