package soundharya;
class mobile
{
    String regex="^(?:9|8|)7)d{9}+$";
    public void set(String str)
    {
        if(str.matches(regex)) {
            System.out.println("Mobile no correct");
        }
        else
        {
            System.out.println("Mobile no is wrong");
        }

    }
    }
public class mobileno {
    public static void main(String[] args) {


    }
}

