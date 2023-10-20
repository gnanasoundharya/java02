package soundharya;

public class numbers {
    public static void printnumber(int num) {
        if (num <= 100) {
            System.out.println(num+ " ");
            printnumber(num+1);
        }
    }

    public static void main(String[] args) {
        int n = 1;
        printnumber(n);
    }
}

