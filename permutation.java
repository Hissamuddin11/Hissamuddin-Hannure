/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;   
public class Main {  
    
    
   static int fact(int number) {  
      int f = 1;  
      int j = 1;  
      while(j <= number) {  
         f = f * j;  
         j++;  
      }  
      return f;  
   }  
   
   
   public static void main(String args[]) {  
         
      List<Integer> numbers = new ArrayList<Integer>();  
      Scanner get = new Scanner(System.in);
      
      System.out.println("Enter Two Numbers:");
      int n1 = get.nextInt();
 int n2 = get.nextInt();
    
      numbers.add(n1);  
      numbers.add(n2);  
      
        
      int n = numbers.size();  
      int r = 3;  
      int result;  
        
      result = fact(n) / fact(n-r);  
      System.out.println("The permutation value for the numbers list is: " + result);  
   }  
}

