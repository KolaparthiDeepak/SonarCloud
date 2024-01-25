package com.zeta.conditions;

public class Q5 {
	
	static String[] below20 = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] below100 = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    public static String f(int n) {
        if (n >= 1000) {
            return f(n / 1000) + " Thousand" + f(n - 1000 * (n / 1000));
        } else if (n >= 100) {
            return f(n / 100) + " Hundred" + f(n - 100 * (n / 100));
        } else if (n >= 20) {
            return " " + below100[(n / 10) - 2] + f(n - 10 * (n / 10));
        } else if (n >= 1) {
            return " " + below20[n - 1];
        } else {
            return "";
        }
    }
    
    public static String numberToWords(int n) {
        if (n > 100000)
        {
            return "Greater than One Lakh";
        }
        if (n == 100000)
        {
            return "One Lakh";
        }
        if (n == 0) {
            return "Zero";
        }
        return f(n).substring(1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000;
		String ans=numberToWords(n);
		System.out.println(ans);
	}

}
