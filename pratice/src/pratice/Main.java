package pratice;

import java.util.Arrays;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
            String str = "my name is deepak";
           /* 
             String [] str1 = str.split(" ");
            System.out.println(str1.length);
            System.out.println(Arrays.toString(str1));
           System.out.println(str1.length);
           
           String combined = String.join ("",str1);
           char [] ch = combined.toCharArray();
            int len = ch.length;
            for (int i = 0; i< ch.length/2;i++) {
             char temp = ch[i];
            ch[i]= ch[len - 1 - i] ;
             ch[len - 1 - i] = temp ;
            
            	
            }
            
           StringBuilder sb = new StringBuilder();
           for (int i =0 ; i< ch.length;i++) {
        	   sb.append(ch[i]);
           }
          
            System.out.println(sb.toString());
            */
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            System.out.println(sb.toString());
          
          
	}

}
