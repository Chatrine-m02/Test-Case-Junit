package JUnitTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITD
 */
public class Palindrome_1 {
    public String methodPalindrome_1(int n1){
        String hasil;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r, n2;
        int rev=0;
        n2=n1;
        while(n1>0){
            r = n1%10;
            rev = rev*10+r;
            n1 = n1/10;
        }
        if(rev==n2){
            hasil = "palindrome number!";
        } else{
            hasil = "NOT palindrome number!";
        }
        return hasil;
    }
    
}
