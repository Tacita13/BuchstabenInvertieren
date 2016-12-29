
//This program means to take a string and convert each character from lower case to upper case, and vice-versa.

package buchstabeninvertieren;

import java.util.Scanner;
        
public class BuchstabenInvertieren {
    public static void main(String[] args) {
        
Scanner in= new Scanner(System.in); 
System.out.println("Ingrese una palabra para mi isa amada\n");
if (in.hasNextInt() ){
  System.out.println("Error: necesita ingresar una palabra\n");
}
else {
   String myString=in.nextLine();
   String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String lowercase = "abcdefghijklmnopqrstuvwxyz";

   for (int i=0;i<myString.length();i++){
    char letter=myString.charAt(i);
    char t = letter;
        //loop para convertir una letra a minuscula si es mayuscula
    for (int j=0; j<uppercase.length() ;j++){
             char bla= uppercase.charAt(j);
         if (letter==bla ){ //meaning la letra es en mayuscula
                  t =lowercase.charAt(j);
        break; //exit loop pq no hay necesidad de seguir 
              }
         }
         //loop para detectar si es minuscula y convertirla a mayuscula 
         for (int j=0; j<lowercase.length();j++){
             char bla= lowercase.charAt(j);
         if (letter==bla ){ //meaning la letra es en minuscula
                  t =uppercase.charAt(j);         
        break; //exit loop pq no hay necesidad de seguir 
              }
         }
    System.out.print(t);
   }

}
System.out.println();
}
} 
