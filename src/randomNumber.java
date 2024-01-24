import java.util.Random;

public class randomNumber {
    public int generateNumber(){
        Random rand=new Random();
        int Randon_num= rand.nextInt(0,101);


       return Randon_num;

    }

}
