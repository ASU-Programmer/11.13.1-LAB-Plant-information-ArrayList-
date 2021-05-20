import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
   public static void printArrayList(ArrayList<Plant>myGarden) {
      for (int i = 0; i < myGarden.size(); ++i) {
         myGarden.get(i).printInfo();
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<>();
      // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String colorOfFlowers;
      boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         plantName = scnr.next();
         plantCost = scnr.next();
         
         if (input.equals("plant")) {
            Plant myPlant = new Plant();
            myPlant.setPlantName(plantName);
            myPlant.setPlantCost(plantCost);
            myGarden.add(myPlant);
         }
         else if (input.equals("flower")) {
            Flower myFlower = new Flower();
            myFlower.setPlantName(plantName);
            myFlower.setPlantCost(plantCost);
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            myFlower.setPlantType(isAnnual);
            myFlower.setColorOfFlowers(colorOfFlowers);
            myGarden.add(myFlower);
         }
         input = scnr.next();
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
