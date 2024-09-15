  
package ebrahimmohamed2051710975;

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.*;


public class MainOperations {
    static ArrayList<citizens> list = new ArrayList(); // this is array list have citizens
    
   public static void add_new_citizen_to_list (String name , String ID,int age , String type , boolean marriage ) {
       citizens n = new citizens ( name ,  ID ,  age, type ,  marriage);
       
       /*if (list.isEmpty()){
           list.add(n);
           System.out.println("citizen added successfully  ");
       } // this statment to add frist citizen to list */
       
       int f=0;
         for(int i =0 ;i<list.size(); i++){
            if(  list.get(i).getID().equals(n.getID())){
                f++;
            }
            
       }
       if(f==0){
                list.add(n);
                System.out.println("citizen added successfully");
            }
            else {
                
                
                System.out.println("citizen was not added becaus he is already exists ");
            }
               
   } //previos method to add new citizens to the list using civil ID
       
       
   //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-_-_-_-_-_-_
   
    public static void add_new_dose_to_citizen(String citizenID ,String manufacturer  ,String place ,String name
            ,String healthprofessionalID, String experience  ){
        
        Dose d = new Dose (manufacturer,place ,new healthprofessional(name ,healthprofessionalID,experience  ));
        int f=0; 
        for(int i=0 ; i<list.size();i++){
            if(list.get(i).getID().equals(citizenID )){
               f++;
                 list.get(i).Doses.add(d);
            System.out.println("dose added successfully to this ID '"+list.get(i).getID() +"' and citizen name is  "+list.get(i).getName());
            }
           
       }
        if(f==0) {
                System.out.println("citizen '"+citizenID+"' is not found    ");
            }
    } // this previos method to add new dose to citizen using civil ID
    
    public static void citizens_take_2Doses_or_more(){
        int counter =0;
        for(int i=0 ; i<list.size();i++){
            if (list.get(i).Doses.size()>=2){
                counter++;
            }
        }
        System.out.println("\nnumber of fully vaccinated persons  "+counter);//(who toke 2 doses or more 
    } // this previos method count number of citizens who take at least 2 doses or more
    
    
    //_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-__-_-_-_-_-_-_-_-_-_-_-_-_
    
    
  
  public static void writeToFille(){
      sort(list);
      File f = new File("C:/Users/DELL/Desktop/demofile3.txt");// look at desktop to find file .
   try{
      
     PrintWriter pr = new PrintWriter(f);
      for (citizens x : list){
     pr.println(x.toString() );
        }
      pr.close(); 

     }
  catch( Exception e){
      System.out.println("there is an error: "+e);
      }
   finally {
       System.out.println("finally"); 
   }
     
    
   
    } //this method to write list of citizens in file
    
    
    
    
    public static void sort(ArrayList<citizens> list)
     {

      list.sort((o1, o2)
        -> o1.getID().compareTo(o2.getID()));
       } //this method to sort arraylist called list have citizens
    
    
}// this is main functions class
