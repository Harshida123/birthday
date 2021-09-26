package ShrikantsirHomework0742019;
//Demonstrate using switch statements with number, character and string expression
public class SwitchCaseCharacter {
    public static void main(String[] args){
        char gender = 'M';
        switch(gender){
            case'A':
                System.out.println("The apple first word is :" +"+A");
                break;
            case'B':
                System.out.println("The bubble first word is :"+"+B");
                break;
            case'F':
                System.out.println("The female word start with:"+"F");
                break;
            case'M':
                System.out.println("The male word start with:"+"M");
                break;
            default:
                System.out.println("any character will print");
                break;

        }
    }
}
