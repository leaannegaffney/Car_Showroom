
/**
 * Write a description of class carMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class carMenu
{
    public static void main(String args [])
    {
        char choice;
       
        System.out.print("Maximum number of cars allowed in the showroom: ");
        CarShowroom showRoom = new CarShowroom(EasyScanner.nextInt()); //creating object called showRoom of type CarShowroom
        
        do//looping the menu
        {
            System.out.println();
            System.out.println("1. Create new car");
            System.out.println("2. Check if showroom is empty");
            System.out.println("3. Check if showroom is full");
            System.out.println("4. Quit");
            
            System.out.print("Enter choice [1-4]: ");
            choice = EasyScanner.nextChar();
            
            switch(choice)
            {
                case '1':
                createCar(showRoom);
                break;
                
                case '2':
                checkEmpty(showRoom);
                break;
                
                case '3':
                checkFull(showRoom);
                break;
                
                case '4':
                System.out.println("Thank you for using the system");
                break; 
                
                default:
                System.out.println("Invalid entry!");
            }
            
            
        }
        while(choice !='4');
        
        
    }
    
    private static void createCar(CarShowroom showroom)//must send in the showroom object to have access to CarShowroom methods inside this method
    {
        System.out.print("Enter make: ");
        String make = EasyScanner.nextString();
        System.out.print("Enter model: ");
        String model = EasyScanner.nextString();
        System.out.print("Enter engine size: ");
        String engineSize = EasyScanner.nextString();
        
        
        Car car = new Car(make, model, engineSize);//creating the new car object of type Car 
        boolean ok = showroom.addCar(car);//calling the addCar method from ShowRoom class to add the car object to the array
        
        if(ok == false)//dealing with the boolean response from the addCar method
        {
            System.out.println("The showroom is full ... cannot add your car");
        }
        else
        {
            System.out.println("Car added to the showroom");
        }
        
    }
    
    private static void checkEmpty(CarShowroom showRoom)
    {
        boolean answer = showRoom.isEmpty(); //calling the isEmpty method from the ShowRoom class using showRoom object
        
        if(answer == true)
        {
            System.out.println("The showroom is empty");
        }
        else
        {
            System.out.println("The showroom is not empty");
        }
    }
    
    private static void checkFull(CarShowroom showRoom)
    {
        boolean answer = showRoom.isFull();
        
        if(answer == true)
        {
            System.out.println("The showroom is full");
        }
        else
        {
            System.out.println("The showroom is not full");
        }
    }
}
