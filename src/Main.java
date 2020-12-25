import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        RandomGenerator randomGenerator=new RandomGenerator();
        Scanner in =new Scanner(System.in);
        System.out.println("how many Random Password you want to generate?");
        int total=in.nextInt();
        int length=7;

        //creating an array to store Random passwords
        String[] Passwords=new String[total];

        for(int i=0;i<total;i++){
            //generating one random password
            String randomPassword ="";//to append each character to that String
            for(int j=0;j<length;j++){
                //generating one random character
                randomPassword+=randomGenerator.randomFunction();
            }
            Passwords[i]=randomPassword;
        }
        randomGenerator.printPasswords(Passwords);
    }
}

