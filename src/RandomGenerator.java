public class RandomGenerator {

    public static char randomFunction() {
        //9 digits +26 uppercase +26 lowercase +15 specialCharacters =76
        int random = (int) (Math.random() * 77); //0-76
        if(random<=14){
            //specialCharacters from 0-15 which is from 33-47 in Ascii
            int ascii=random+33;
            return (char)(ascii);
        }
        else if(random<=24){//digits
            //15-24 if from 48-57 in Ascii 48-15=33
            int ascii = random+ 33;
            return (char) (ascii);//casting our ascii into characters
        }
        else if(random<=50){ //A-Z from 24-50 randomly is from 65-90 in ascii
            int ascii = random + 40;
            return (char) (ascii);
        }
        else {
            //a-z from 50-76 is from 97 to 122 in ascii
            int ascii = random + 47;
            return (char) (ascii);
        }


    }

    public void printPasswords(String[] passwords){
      for(int i=0;i< passwords.length;i++){
          System.out.println(passwords[i]);
      }
    }


}