
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String manufacturer;
    private String model;
    private String engineSize;
    
    public Car(String manufacturerIn, String modelIn, String engineSizeIn)
    {
        manufacturerIn = manufacturer;
        modelIn = model;
        engineSizeIn = engineSize;
    }
    
    public String getManufacturer()
    {
       return manufacturer; 
    }
    
    public void setManufacturer(String manufacturerIn)
    {
        manufacturerIn = manufacturer;
    }
    
    public String getModel()
    {
       return model; 
    }
    
    public void setModel(String modelIn)
    {
        modelIn = model;
    }
    
    public String getEngineSize()
    {
       return engineSize; 
    }
    
    public void setEngineSize(String engineSizeIn)
    {
        engineSizeIn = engineSize;
    }
    
    
}
