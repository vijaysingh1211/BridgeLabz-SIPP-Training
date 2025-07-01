// The Coffee Counter Chronicles 
// 
// Ravi runs a cafe, Each customer orders different coffee types with quantities. Write a program
// that:
// ● Asks for coffee type (switch)
// ● Calculates total bill (price * quantity)
// ● Adds GST using arithmetic operators
// Use while to continue for the next customer and break when "exit" is typed.
package workshop;

import java.util.*;
public class Coffee_Counter_Chronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int quantity = sc.nextInt();
        int price = 0;
        int a=0;
        int b=1;
        while(a<b){
switch (s) {
    case "americano":
         price = 100;
         System.out.println(price*quantity + (price*quantity)/2);
        break;
    case "cappuccino":
        price = 200;
        System.out.println(price*quantity + (price*quantity)/2);
        break;
    case "caffe macchiato":
        price = 300;
        System.out.println(price*quantity + (price*quantity)/2);
        break;    
    case "ortado" :
        price = 400;
        System.out.println(price*quantity + (price*quantity)/2);
        break;
    
    default:
       price = 10;
       System.out.println(price*quantity + (price*quantity)/2);
}
String str = sc.next();
if(str.equals("exit")){
      break;
}
else{
    a++;
    b++;
}

        }
    }
}
