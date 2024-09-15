 
package ebrahimmohamed2051710975;
 
import java.util.ArrayList;



 
public class citizens {
    // Declaration of all the class attributes
   private String name ;
   private String ID;
   private int age ;
   private String gender;
   private boolean marriage ;
    ArrayList<Dose> Doses=new ArrayList<>();
   
    public citizens(){
        
    } // zero argument constractor
    public citizens(String name,String  ID , int age , String gender , boolean marriage ){
        this.name =name;
        this.ID=ID;
        this.age=age ;
        this.gender =gender;
        this.marriage = marriage;
    }// five arguments constractor 
 
     // setter
    public void setName(String name) {
        this.name = name;
    } //setter for citizen nmae

    public void setID(String ID) {
        this.ID = ID;
    } // setter for citizen id

    public void setAge(int age) {
        this.age = age;
    } //setter for citizen age

    public void setType(String gender) {
        this.gender = gender;
    }// setter for citizen gender

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    } // setter for citizen marriage case.
 
 
    // getter 
    public String getName() {
        return name;
    } // getter return name of citizen

    public String getID() {
        return ID;
    }// getter method to return civil id of citizen

    public int getAge() {
        return age;
    }// getter method to return age of citizen

    public String getGender() {
        return gender;
    } // getter method to return gender of citizen
  public static String g() {
        return "c";
    } // getter method to return gender of citizen

    public boolean isMarriage() {
        return marriage;
    }// getter method to return marriage case of citizen

    public ArrayList<Dose> getDoses() {
        return Doses;
    } // this method return array list contian doses that citizen taken

    public void setDoses(ArrayList<Dose> Doses) {
        this.Doses = Doses;
    }// this metho set array list contain doses to citizen
    

     public String toString() {
 return "citizen name  ('"+  name +"') citizen ID ('"+ ID+ "') citizen age ('" + 
         age + "') citizen gender ('" + gender + "') marrid (" + marriage+") dose "+Doses+"\n" ;
 } // this method to return data of each object

     


    @Override
    public boolean equals(Object o) {
          citizens s =(citizens) o ;
          if (this.ID.equals(s.ID))
              return true ;
          else 
              return false ;
    } //this method check that current object id equal anthor object or no
    

     
    
    
}
