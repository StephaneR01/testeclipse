package com.formation;
import java.io.*;
public class Lecture {
    public static void main(String [] args) {
        lecture();
    
    }
    private static void lecture(){
        try { 
            // Création d’un fileReader pour lire le fichier
            FileReader fileReader = new FileReader("C:/steph/0 - Plan de DEV/JAVA/test.txt");
            
            // Création d’un bufferedReader qui utilise le fileReader 
            BufferedReader reader = new BufferedReader (fileReader);    
            // une fonction à essayer pouvant générer une erreur
            String line = reader.readLine();
        
            while((line) != null) {
        
                    // affichage de la ligne
                    System.out.println(line);
                    // lecture de la prochaine ligne
                    line = reader.readLine();
            } 
                reader.close();
        }
        
        catch (IOException e) {
        
            e.printStackTrace();
        
        }
    }

}    