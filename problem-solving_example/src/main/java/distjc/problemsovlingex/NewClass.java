/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distjc.problemsovlingex;

/**
 *
 * @author soblab
 */
public class NewClass {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 40;
        System.out.println("The sum of even number fromm "+n1+" to "+n2 +": "
                + getSum1(n1,n2));
        System.out.println("The sum of odd number fromm "+n1+" to "+n2 +": "
                + getSum2(n1,n2));
        System.out.println("The sum of prime number fromm "+n1+" to "+n2 +": "
                + getSum3(n1,n2));
        System.out.println("The sum of prime number with digit 7 fromm "+n1+" to "+n2 +": "
                + getSum4(n1,n2));
    }
    
    private static int getSum1(int n1, int n2){
        int sum = 0;
        for(int i = n1; i<=n2;i++){
            if(i%2==0)
                sum+=i;
        }
        return sum;
    }
    
    private static int getSum2(int n1, int n2){
        int sum = 0;
        for(int i = n1; i<=n2;i++){
            if(i%2==1)
                sum+=i;
        }
        return sum;
    }
    
    private static int getSum3(int n1, int n2){
        int sum = 0;
        for(int i = n1; i<=n2;i++){
            if(isPrime(i))
                sum+=i;
        }
        return sum;
    }
    private static boolean isPrime(int n){
        if(n==1) return false;
        for(int i = 2; i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    private static int getSum4(int n1, int n2){
        int sum = 0;
        for(int i = n1; i<=n2;i++){
            if(isPrime(i) && hasDigit7(i)){
                sum+=i;
            }
        }
        return sum;
    }
    private static boolean hasDigit7(int n){
        while(n>0){
            if(n%10==7)
                return true;
            n/=10;
        }
        return false;
    }
}
