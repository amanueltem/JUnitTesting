
public class ChangeNumber {

    public int toBinary(int decimal) {
        if(decimal<0){
            int result=positiveDecimalTobinary(decimal)*-1;
            String resultDecimal=result+"";
            char[] array=resultDecimal.toCharArray();
            String resulString="";
            for(int i=0;i<array.length;i++){
                if(array[i]=='0') array[i]='1';
                else array[i]='0';
                resulString+=array[i];
            }
            result=fromBinary(resulString);
            result++;
            return positiveDecimalTobinary(result);
        }
      return positiveDecimalTobinary(decimal);
    }

    public int toOctal(int decimal) {
        if(decimal<0){
            int result=toBinary(decimal);
            result=fromBinary(result+"");
            return positiveDecimalToOctal(result);
        }
        return positiveDecimalToOctal(decimal);
    }
    public String toHex(int decimal) {
       return positiveDecimalToHex(decimal);
    }

  
    public int fromBinary(String binaryString){
        char[] array=binaryString.toCharArray();
        int result=0;
        int tempResult=0;
        for(int i=0;i<array.length;i++){
             tempResult=getNumFromChar(array[i])*(int)Math.pow(2, array.length-i-1);
             result+=tempResult;
        }
        return result;
    }
    public int fromOctal(String octalString){
        char[] array=octalString.toCharArray();
        int result=0;
        int tempResult=0;
        for(int i=0;i<array.length;i++){
             tempResult=Integer.parseInt(array[i]+"")*(int)Math.pow(8, array.length-i-1);
             result+=tempResult;
        }
        return result;
    }
    public int fromHex(String hexString){
        char[] array=hexString.toCharArray();
        int result=0;
        int tempResult=0;
        for(int i=0;i<array.length;i++){
             tempResult=getNumFromChar(array[i])*(int)Math.pow(16, array.length-i-1);
             result+=tempResult;
        }
        return result;
    }
    private int positiveDecimalTobinary(int decimal){
        int counter = 0;
        int remainder = 0;
        int result = 0;
        while (decimal != 0) {
            remainder = decimal % 2;
            result += (int) Math.pow(10, counter) * remainder;
            decimal = decimal / 2;
            counter++;
        }
        return result;
    }

    private int positiveDecimalToOctal(int decimal){
        int counter = 0;
        int remainder = 0;
        int result = 0;
        while (decimal != 0) {
            remainder = decimal % 8;
            result += (int) Math.pow(10, counter) * remainder;
            decimal = decimal / 8;
            counter++;
        }
        return result;
    }
    private String positiveDecimalToHex(int decimal){
        int remainder = 0;
        String hexString = "";
        String hexCopy = "";
        while (decimal != 0) {
            remainder = decimal % 16;
            hexCopy = getCharNum(remainder);
            hexCopy += hexString;
            hexString = hexCopy;
            decimal = decimal / 16;
        }
        return hexString;
    }
    private String getCharNum(int num) {
        if (num == 10)
            return "A";
        else if (num == 11)
            return "B";
        else if (num == 12)
            return "C";
        else if (num == 13)
            return "D";
        else if (num == 14)
            return "E";
        else if (num == 15)
            return "F";
        else
            return num + "";
    }
    private int getNumFromChar(char c){
    if (c=='A') return 10;
    else if(c=='B') return 11;
    else if(c=='C') return 12;
    else if(c=='D') return 13;
    else if(c=='E') return 14;
    else if(c=='F') return 15;
    else  return Integer.parseInt(c+"");
    }
}
