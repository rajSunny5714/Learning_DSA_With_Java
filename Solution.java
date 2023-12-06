import java.util.*;
public class Solution{
    public static void main(String args[])  {
    public long countB(int n,int k){
        long c=0;
       if(n==1)
           c=k; 
       else 
          c= (long)n*(k-2)+2;
    
       return c;  
      }     
   }
}