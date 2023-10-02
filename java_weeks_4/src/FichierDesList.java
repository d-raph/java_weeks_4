import java.util.ArrayList;

public class FichierDesList {
    

    

    public int Ajouter(String input){
        ArrayList<Integer> liste = new ArrayList<>();

        
        String[] number =input.split(" ");
        int somme=0;
        
        for (int i=0;number.length<i;i++){
                
                liste.add(Integer.parseInt(number[i]));
        }
        for (int nombre : liste){
            somme+=nombre;
        }
       return somme;
                
    }


    
}
