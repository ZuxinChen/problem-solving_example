/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soblab
 */
/*  Write a program that uses a SinglyLinkedList that gets populated by prime numbers from 0 to n. 
    Then move the prime numbers that has the digit '3' into another linked list. 
    After that find the sum of numbers in the second list.  (n should be less than 1,000,000).
    For example, the sum of the prime numbers (with 3 digit) between 0 and n=100 is (3+ 13+  23+ 31+ 37+ 43+  53+73+83 )= 359.
*/  
public class SinglyLinkedList {
    public static void main(String[] args) {
        int n = 100;
        LinkedList list1 = new LinkedList(); // hold the prime number
        LinkedList list2 = new LinkedList(); // hold the numbers has digit 3
        
        // find the prime number andadd into link lists
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                Node node = new Node(i);
                list1.append(node);
            }
        }
        System.out.print("These are prime numbers : " );
        list1.print();
        
        // find the prime number has digit 3 and add into link lists
        for(int i=0;i<list1.size();i++){
            int num =list1.get(i);
            if(hasDigit3(num)){
                Node node = new Node(num);
                list2.append(node);
            }
        }
        System.out.print("These are prime numbers has digit 3 : " );
        list2.print();
        
        // sum all numbers
        System.out.print("Sum : " + sum(list2));
       
    }
    
    public static boolean isPrime(int n){
        for(int i=2; i< n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean hasDigit3(int n){
        while(n>0){
            if(n%10==3){
                return true;
            }
            n/=10;
        }
        return false;
    }
    public static int sum(LinkedList list){
        int sum =0;
        for(int i=0; i<list.size();i++){
            sum += list.get(i);
        }
        return sum;
    }
}
