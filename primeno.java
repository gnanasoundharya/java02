package soundharya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class primeno {
    public static void main(String[] args) throws IOException {
        int count=0;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int num= Integer.parseInt(br.readLine());
        for (int i=2;i<=num/2;i++){
            if((num%i==0)) {
                count=count+1;}
            }
        if (count==0) {
                System.out.println("prime no");
            }
            else {
                System.out.println("not prime no");
            }

        }


    }

