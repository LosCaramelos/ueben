/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ueben;

/**
 *
 * @author oldi
 */
public class Ueben {
    
//Attribute        
private String flugzeugModell;   
private int maxSpeed;          
private int Position;

//Konstruktor mit Parametern          
public Ueben (String Modell, int maxSpeed){          
flugzeugModell = Modell;  
this.maxSpeed = maxSpeed;          
Position = 0;          
  }          
  
//Konstruktor ohne Parametera          
public Ueben (){          
flugzeugModell = "default";  
maxSpeed = 100;          
Position = 0;          
  }

//Methode          
// Jedes Flugzeug hat ja unterschiedliche max. Geschwindigkeit (maxSpeed), deswegen wird bei der Berechnung der Position die Anzahl der Schritte mit maxSpeed multipliziert.           
public void vorwärtsFliegen(int iSchritt){          
Position = Position + (iSchritt * maxSpeed);          
  }          
  
  
//Setter Methode          
public void setmaxSpeed (int mSpeed){          
maxSpeed = mSpeed;          
  }          
  
//Getter Methode          
public int getmaxSpeed (){          
return maxSpeed;          
  }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Erstellen des Objekts mit dem Konstruktor ohne Parameter           
    Ueben Flugzeug1 = new Ueben();  
    System.out.println("Modell = " + Flugzeug1.flugzeugModell);          
    System.out.println("maxSpeed = " + Flugzeug1.maxSpeed + " km/h");          
    System.out.println("Position = " + Flugzeug1.Position + " km");          
    
    
    // Ergebnis in der Konsole:          
    // Modell = default           
    // maxSpeed = 100 km/h           
    // Position = 0 km           
    
        
    //Wir fliegen mit dem Flugzeug1 5 Schritte.           
    Flugzeug1.vorwärtsFliegen(5);          
    System.out.println("Position = " + Flugzeug1.Position + " km");          
    
    // Ergebnis in der Konsole:          
    // Position = 500 km        
    // Erklärung: Also 5 Schritte x maxSpeed (100 km/h) = 500 km          
    
        
    //Erstellen des Objekts mit dem Konstruktor mit Parametern           
    Ueben Flugzeug2 = new Ueben("stealth", 1000);          
    System.out.println("Modell = " + Flugzeug2.flugzeugModell);          
    System.out.println("maxSpeed = " + Flugzeug2.maxSpeed + "km/h");          
    System.out.println("Position = " + Flugzeug2.Position + " km");          
    
    // Ergebnis in der Konsole:          
    // Modell = stealth           
    // maxSpeed = 1000km/h           
    // Position = 0 km           
        
      
    //Wir fliegen mit dem Flugzeug2 5 Schritte.           
    Flugzeug2.vorwärtsFliegen(5);          
    System.out.println("Position = " + Flugzeug2.Position + " km");          
    
    // Ergebnis in der Konsole:          
    // Position = 5000 km  
    //Erklärung: 5 Schrtte x maxSpeed (1000 km/h) = 5000 km  
     
     
//Wir können die maximale Geschwindigkeit vom Flugzeug1 nachträglich auf 10000 km/h ändern:  
Flugzeug1.setmaxSpeed(10000);  
     
//Aktuelle maximale Geschwindigkeit anzeigen  
System.out.println("maxSpeed = " + Flugzeug1.getmaxSpeed() + "km/h");  
     
// Ergebnis in der Konsole:  
//maxSpeed = 10000km/h           
          
  }          
}
