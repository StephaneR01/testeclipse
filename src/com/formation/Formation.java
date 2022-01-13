package com.formation;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Map;

public class Formation {
	    
        public interface OperationSimple {

        int calculer(int i);

        }

	    public static void main(String[] args) {
	        int thisYear = 2019;
	        String birthdayMonth = "June";
	        int firstDay = 3;       
	        
	        //TODO Etape 1 : créez une variable daysInWeek avec une valeur de 7
	        int daysInWeek = 7;
	        //TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci
	        firstDay += daysInWeek;
	        //TODO Etape 3 : créez une constante numérique nommé startingDay avec la nouvelle valeur de la variable firstDay    
	        int startingDay = firstDay;

	        // Affiche le résultat 
	        System.out.println(Coucou.message);
	        Coucou.printmessage();

	        Map<String, Integer> toto = new HashMap<String, Integer>();
	        
	        toto.put("Jean", 34);
	        toto.put("tata", 34);
	        toto.put("mama", 3);
	        toto.put("quota", 30);
	        toto.remove("tata");

	        for (Map.Entry<String, Integer> entry : toto.entrySet()){
	            System.out.println(entry.getKey() + "->" +entry.getValue());
	        }

	        System.out.println(toto.size());
	        
	        OperationSimple os = i -> 2 * i;

	        int resultat = os.calculer(10);
	        
	        System.out.println(resultat); // Affiche 20

	    }
	}
	class Coucou{   
	        static String message ="coucou ma poule"; 
	        static void printmessage(){
	            for (int i=0; i<5;i++) {
	                System.out.println(message + " coco " + (i+1));
	            }
	        }
	}

