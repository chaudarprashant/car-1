import java.util.*;


class my{
   public static void main(String [] args){
    int a=9;
    int sum=1;
   
    while(a>0){
         sum = sum*a;
         a=--a;
    }
    System.out.println(sum);
   }
}