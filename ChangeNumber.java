public class ChangeNumber {

    public int toBinary(int decimal) {
        int counter = 0;
        int remainder = 0;
        int result = 0;
      if(decimal<0){

      }
        while (decimal != 0) {
            remainder = decimal % 2;
            result += remainder * (int) Math.pow(10, counter);
            decimal = decimal / 2;
            counter++;
        }
    

        return result;
    }

    public int toOctal(int decimal) {
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
    public String toHex(int decimal) {
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
    public int fromBinary(String binaryString){
        char[] array=binaryString.toCharArray();
        int result=0;
        int tempResult=0;
        for(int i=array.length-1;i>=0;i++){
             tempResult=Integer.parseInt(array[i]+"")*(int)Math.pow(2, i);
             result+=tempResult;
        }
        return result;
    }
}
