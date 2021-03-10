/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTask;

import JunitTask.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Chatrine
 */
public class Reverse_1 {
    public String methodReverse_1(int n){
        String hasil;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r;
        int rev = 0;
        int number = n;
        
        while(n>0){
            r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        
        hasil = "The reverse of "+number+ " is "+rev;
        return hasil;
    }
}
