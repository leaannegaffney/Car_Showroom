
/**
 * Write a description of class CarShowroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarShowroom
{
   private Car cars [];//creating an array called cars of type Car
   private int total;
   
   public CarShowroom(int sizeIn)//constructor sets the size of the array
   {
       cars = new Car [sizeIn];//setting the size of the array
       total = 0;
   }
   
   public boolean isEmpty()
   {
      if(total == 0)
      {
         return true; 
      }
      else
      {
          return false;
      }
   }
   
   public boolean isFull()
   {
      if(total == cars.length)//total increases by 1 every time an object is added to the array so will always equal the length of the array
      {
         return true; 
      }
      else
      {
          return false;
      }
   }
   
   public boolean addCar(Car carIn)//sending an object of type car into the method as a parameter
   {
       if(isFull() == false)//check to see if the array is full before adding the car object to the array
       {
           carIn = cars[total]; //new car object = the available location in the array
           total++; //increase the total by 1 because the array has now increased by one
           return true;//return true to let the user know the car has been added successfully
           
       }
        else
       {
            return false;//return false if the car cannot be added
       }
   }
}
