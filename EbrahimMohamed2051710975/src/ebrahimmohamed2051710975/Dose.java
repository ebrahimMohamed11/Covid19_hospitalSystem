 
package ebrahimmohamed2051710975;
import java.util.Date ;
 
public class Dose {
    // Declaration of all the class attributes
    private String manufacturer;
    private Date DateCreated ;
    healthprofessional hp;
    private String place ;
    public Dose (){
      DateCreated = new Date();  
    }
    public Dose (String manufacturer  ,String place,healthprofessional hp ){
        this.manufacturer=manufacturer;
         DateCreated = new Date();  
        this.place=place;
        this.hp= hp;
        
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

     

    public void setPlace(String place) {
        this.place = place;
    }

    public String getManufacturer() {
        return manufacturer;
    }

     
    public String getPlace() {
        return place;
    }
    public String  toString(){
      
        return "manufacturer ('"+manufacturer+"') dose date ('"+DateCreated+"') place ('"+place+"') "+"{"+hp+"}" ;
    }
    
}
