package ShrikantsirHomework31032019;

public class Switchclass {
    public static void main(String[] args){
        Switchclass obj =new Switchclass();
        obj.Marks(95);
        obj.Marks(72);
        obj.Marks(38);
        obj.Marks(36);
        obj.Marks(26);

    }
    public void Marks(int finalmark){
        switch (finalmark){
            case 95:
                System.out.println("The grade will be A");
              break;
            case 72:
                System.out.println("The grade will be B");
                break;
            case 38:
                System.out.println("The grade will be C");
                break;
                case 36:
                    System.out.println("The grade will be  just pass");
                    break;
            case 26:
                System.out.println("The grade will be ");
                default:
                    System.out.println("any grade");
        }
    }
}
