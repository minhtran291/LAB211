
public class Convert {
    Validate v = new Validate();
    public void convertFromBinary(String binary){
        int choice = v.displayConvert("Binary", "Decimal", "Hexadecimal");
        if(choice == 1){
            System.out.println("Decimal: " + convertBinaryToDecimal(binary));
        }else{
            System.out.println("Hexadecimal: " + convertBinaryToHexaDecimal(binary));
        }
    }
    
    public void convertFromDecimal(String decimal){
        int choice = v.displayConvert("Decimal", "Binary", "Hexadecimal");
        if(choice == 1){
            System.out.println("Binary: " + convertDecimalToBinary(decimal));
        }else{
            System.out.println("Hexadecimal: " + convertDecimalToHexaDecimal(decimal));
        }
    }

    public void convertFromHexaDecimal(String hexaDecimal){
        int choice = v.displayConvert("Hexadecimal", "Binary", "Decimal");
        if(choice == 1){
            System.out.println("Binary: " + convertHexaDecimalToBinary(hexaDecimal));
        }else{
            System.out.println("Decimal: " + convertHexaDecimalToDecimal(hexaDecimal));
        }
    }
        
    
    public String convertDecimalToBinary(String decimal){
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }
    
    public String convertDecimalToHexaDecimal(String decimal){
        String hexa = "";
        int base10 = Integer.parseInt(decimal);
        while(base10 != 0){
            hexa += hexDigits[base10 % 16];
            base10 /= 16;
        }
        return hexa;
    }
    
    public final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
    
    public String convertBinaryToDecimal(String binary){
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }
    
    public String convertBinaryToHexaDecimal(String binary){
        String decimal = convertBinaryToDecimal(binary);
        String hexaDecimal = convertDecimalToHexaDecimal(decimal);
        return hexaDecimal;
    }
    
    public String convertHexaDecimalToDecimal(String hexaDecimal){
        int decimal = Integer.parseInt(hexaDecimal, 16);
        return Integer.toString(decimal);
    }
    
    public String convertHexaDecimalToBinary(String hexaDecimal){
        String decimal = convertHexaDecimalToDecimal(hexaDecimal);
        String binary = convertDecimalToBinary(decimal);
        return binary;
    }
}
