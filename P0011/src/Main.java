
public class Main {
    public static void main(String[] args) {
        Validate v = new Validate();
        Convert c = new Convert();
        while(true){
            int choice = v.menu();
            switch(choice){
                case 1:
                    String binary = v.checkInputBinary();
                    c.convertFromBinary(binary);
                    System.out.println("");
                    break;
                case 2:
                    String decimal = v.checkInputDecimal();
                    c.convertFromDecimal(decimal);
                    System.out.println("");
                    break;
                case 3:
                    String hexaDecimal = v.checkInputHexaDecimal();
                    c.convertFromHexaDecimal(hexaDecimal);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
