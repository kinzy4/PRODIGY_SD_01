
package task1;
 import java.util.Scanner;
 
public class Task1 {

   
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       char choice; String unit;
       double fh,cls,k;
       do{
    
        System.out.println("Please choose which temperature unit you would enter");
         unit = input.next();
         
        if(unit.equalsIgnoreCase("celsius")){
                System.out.println("thank you, now enter the degree");
                       cls=input.nextDouble();
                       fh=(cls*9/5)+32;
                       k=cls+273.15;
                       System.out.println("Your Temperature in fahrenhait : "+fh);
                       System.out.println("Your Temperature in kelvin : "+k);
        }
        else if(unit.equalsIgnoreCase("kelvin")){
                System.out.println("thank you, now enter the degree");
                       k=input.nextDouble();
                       fh=(k-273.15)*9/5+32;
                       cls=k-273.15;
                       System.out.println("Your Temperature in fahrenheit : "+fh);
                       System.out.println("Your Temperature in celsius : "+cls);
        }
                else if(unit.equalsIgnoreCase("fahrenheit")){
                System.out.println("thank you, now enter the degree");
                       fh=input.nextDouble();
                       k=(fh-32)*5/9+273.15;
                       cls=(fh-32)*5/9;
                       System.out.println("Your Temperature in kelvin : "+k);
                       System.out.println("Your Temperature in celsius : "+cls);
        }
                else{
                System.out.println("There is no such unit");
                }
            System.out.println("If you want to continue enter y if not enter n");
         choice = input.next().charAt(0);
       }while(choice=='y');}
    
}
