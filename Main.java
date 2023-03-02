public class Main {
   public static void main(String[] args) {
    double examNote = Math.random()*101;
    String letterNote= "F";


    if (examNote>92){
        letterNote="A";
    }else if (examNote>90){
        letterNote="A-";
    }else if (examNote>88){
        letterNote="B+";
    }else if (examNote>82){
        letterNote="B";
    }else if (examNote>80){
        letterNote="B-";
    }else if (examNote>78){
        letterNote="C+";
    }else if (examNote>72){
        letterNote="C";
    }else if (examNote>70){
        letterNote="C-";
    }else if (examNote>65){
        letterNote="D";
    }
    
    System.out.println("Letter Note for  " +  examNote + " is : " + letterNote);


   }
}
