
package ebrahimmohamed2051710975;

 
public class healthprofessional extends citizens {
    // Declaration of all the class attributes
    private String experience ;
     public static String g() {
        return "h";
    } // getter method to return gender of citizen
    
    public healthprofessional (){
        
    } //zero argument constractor 
    public healthprofessional ( String name ,String ID,String experience ){
        
        setName(name);
        setID(ID);
        this.experience =experience ;
    }

    //setter
    public void setExperience(String experience) {
        this.experience = experience;
    }
    //getter
    public String getExperience() {
        return experience;
    }

     public String toString() {
 return "health professional name ('"+getName()+"') health professional id ('"+
         getID() +"') health professional experience ('"+ experience+"')"  ;
 } //this mehod return data about each healproffessional
    
}
