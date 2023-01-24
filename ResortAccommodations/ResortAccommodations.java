import java.util.Scanner;
/**
  * Programming Project 3
  * This program completes a resort accommodations program.
  * @author Sophie Nguyen
  * @version 03/28/2022
  */

public class ResortAccommodations
{
   public static void main(String[] args)
   {
      int numberOfFloors;
      int numberOfRooms;
      int numberOfOccupiedRooms; 
      int totalRooms = 0;
      int totalOccupiedRooms = 0;

      Scanner in = new Scanner(System.in);
      
      System.out.print("How many floors does the resort have? "); 
      numberOfFloors = in.nextInt(); // Enter number of floors
      
      /**
        * Validates that the number of floors is greater than or equal to 1.
        * If it is not, output an "invalid" message and prompt the user to enter again.
        */
      boolean valid = true;     
      while(valid)
      {
         if (numberOfFloors >= 1)
         { 
            valid = false;
         }
         else
         {
            System.out.print("Invalid. Enter 1 or more: ");
            numberOfFloors = in.nextInt();
            valid = false;
         }
      }   
      
      for(int i = 1; i <= numberOfFloors; i++) // Counts from 1 to the number of floors
      {
         System.out.printf("How many rooms does floor %d have? ", i);
         numberOfRooms = in.nextInt();
         
         /**
           * Validates that the number of rooms is greater than or equal to 10.
           * If it is not, output an "invalid" message and prompt the user to enter again.
           */
         boolean valid1 = true;     
         while(valid1)
         {
            if (numberOfRooms >= 10)
            {
               totalRooms += numberOfRooms;
               valid1 = false;
            }
            else
            {
               System.out.print("Invalid. Enter 10 or more: ");
               numberOfRooms = in.nextInt();
               totalRooms += numberOfRooms;
               valid1 = false;
            }
         }

         System.out.printf("How many occupied rooms does floor %d have? ", i);
         numberOfOccupiedRooms = in.nextInt();
         
         /**
           * Validates that the number of occupied rooms do not exceed the number of rooms.
           * If they do, output an "invalid" message and prompt the user to enter again.
           */
         boolean valid2 = true;     
         while(valid2)
         {
            if (numberOfOccupiedRooms <= numberOfRooms)
            {
               totalOccupiedRooms += numberOfOccupiedRooms;
               valid2 = false;
            }
            else
            {
               System.out.print("Invalid. Enter less than or equal to the number of rooms: ");
               numberOfOccupiedRooms = in.nextInt();
               totalOccupiedRooms += numberOfOccupiedRooms;
               valid2 = false;   
            }
         }
      }                
      
      System.out.println("");                                                // Insert a newline
      System.out.println("Number of rooms: " + totalRooms);                  // Output total number of rooms
      System.out.println("Occupied rooms: " + totalOccupiedRooms);           // Output total number of occupied rooms
      
      int vacantRooms = totalRooms - totalOccupiedRooms;                     // Find the number of vacant rooms
      System.out.println("Vacant rooms: " + vacantRooms);                    // Output number of vacant rooms
      
      double occupancyRate = (double) totalOccupiedRooms / totalRooms * 100; // Find the percent rate of occupancy of the resort
      System.out.printf("Occupancy rate: %.2f", occupancyRate);              // Display 2 decimal places
      System.out.print("%");
   }
}