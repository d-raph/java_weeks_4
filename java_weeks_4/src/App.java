import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("write the number with 1 space in beetween :");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(Ajouter(input));
        
        
        

    }
    public static int Ajouter(String input){
        ArrayList<Integer> liste = new ArrayList<>();

        
        String[] number =input.split(" ");
        int somme=0;
        
        for (String test : number){
            liste.add(Integer.parseInt(test));
        }
        
        /*for (int i=0;number.length<i;i++){
                
                liste.add(Integer.parseInt(number[i]));
        }*/
        for (int nombre : liste){
            somme+=nombre;
        }
       return somme;
                
    }

}
