package Calculator;

/**
 *
 * 
 */
public class MainCalculator {

    public static void main(String[] args) {
        Formula cal = new Formula();
       
        
        switch (cal.option) {
            case "A":
                cal.result = cal.adds();
                System.out.println("Answer:" + cal.result);
                break;
            case "B":
                cal.result = cal.subs();
                System.out.println("Answer:" + cal.result);
                break;
            case "C":
                cal.result = cal.muls();
                System.out.println("Answer:" + cal.result);
                break;
            case "D":
                cal.result = cal.divs();
                System.out.println("Answer:" + cal.result);
                break;
            case "E":
                cal.result = cal.mods();
                System.out.println("Answer:" + cal.result);
                break;
            default:
                System.out.println("Invalid operation code!");
        }
    }
}
