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
}
