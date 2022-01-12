/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

public class Visa 
{
   private long visa_num ;
   
   public Visa(){}

    public long getVisa_num() {
        return visa_num;
    }

    public void setVisa_num(int visa_num) {
        this.visa_num = visa_num;
    }
   
   public boolean checkVisaNumber()
   {
       
       return (getSize(visa_num) >= 13 && getSize(visa_num) <= 16) &&
               (prefixMatched(visa_num, 4) || prefixMatched(visa_num, 5) || 
                prefixMatched(visa_num, 37) || prefixMatched(visa_num, 6)) &&
              ((sumOfDoubleEvenPlace(visa_num) + sumOfOddPlace(visa_num)) % 10 == 0);
   }
   
   ///////////////////
   
   public int sumOfDoubleEvenPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2)
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
         
        return sum;
    }
 
    // Return this number if it is a single digit, otherwise,
    // return the sum of the two digits
    public int getDigit(int number)
    {
        if (number < 9)
            return number;
        return number / 10 + number % 10;
    }
 
    // Return sum of odd-place digits in number
    public int sumOfOddPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");       
        return sum;
    }
 
    // Return true if the digit d is a prefix for number
    public boolean prefixMatched(long number, int d)
    {
        return getPrefix(number, getSize(d)) == d;
    }
 
    // Return the number of digits in d
    public int getSize(long d)
    {
        String num = d + "";
        return num.length();
    }
 
    // Return the first k number of digits from
    // number. If the number of digits in number
    // is less than k, return number.
    public long getPrefix(long number, int k)
    {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }
}
