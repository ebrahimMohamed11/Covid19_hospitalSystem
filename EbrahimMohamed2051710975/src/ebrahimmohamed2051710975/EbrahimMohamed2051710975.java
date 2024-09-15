
package ebrahimmohamed2051710975;

 
 
 
import java.util.ArrayList;
import java.util.*;
import java.io.*;
 
 import java.awt.Image;
import javafx.application.Application;
 import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
//import javafx.geometry.VPos;
//import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;


 
public class EbrahimMohamed2051710975  extends Application {

      
    public static void main(String[] args) {
        launch(args);
        
         // try to add number of citizens to list
    /* MainOperations.add_new_citizen_to_list ( "Ibrahim Mohamed" , "234565", 21 ,"male" , true ); 
     MainOperations.add_new_citizen_to_list (  "Mahmoud lol" ,   "133565",   19 ,   "male" ,    false ); 
     MainOperations.add_new_citizen_to_list (  "Ibrahim Mohamed" ,   "234565",   21 ,   "male" ,    true ); 
     MainOperations.add_new_citizen_to_list (  "Ahmed Said" ,   "456367",   26 ,   "male" ,    true ); 
     MainOperations.add_new_citizen_to_list (  "omnia Seiko" ,   "453489",   26 ,   "female" ,    true ); 
     MainOperations.add_new_citizen_to_list (  "malk Van" ,   "634768",   21 ,   "male" ,    true ); 
     MainOperations.add_new_citizen_to_list (  "missi" ,   "667322",   35 ,   " male" ,    true );
     MainOperations.add_new_citizen_to_list (  "banzema" ,   "453435",   35 ,   " male" ,    true ); 
     MainOperations.add_new_citizen_to_list (  "Mahmoud lol" ,   "133565",   19 ,   "male" ,    false );
     
     
     
     MainOperations.add_new_dose_to_citizen("234565" ,"cairo hospital" ,"cairo" ,"Ahmed Ali" ,"458927", "profissional"  );
     MainOperations.add_new_dose_to_citizen("234565" ,"itaiy" ,"cairo" ,"Ahmed Ali" ,"458927", "profissional"  );
     MainOperations.add_new_dose_to_citizen("453489" ,"itaiy" ,"cairo" ,"mohamed Alaa" ,"458927", "5 years"  );
     MainOperations.add_new_dose_to_citizen("234599" ,"cairo hospital" ,"china" ,"jo mata" ,"458927", "profissional"  );
     MainOperations.add_new_dose_to_citizen("133565" ,"china" ,"Alex" ,"Ahmed bassem" ,"463826", "profissional"  );
     MainOperations.add_new_dose_to_citizen("133565" ,"china" ,"Alex" ,"Ahmed bassem" ,"463826", "profissional"  );
     MainOperations.add_new_dose_to_citizen("667322" ,"china" ,"barshelona" ,"mark" ,"458927", "5 years"  );
     
   MainOperations.add_new_dose_to_citizen("234588" ,"cairo hospital" ,"Germany" ,"said said" ,"458927", "20 years"  );
    
    MainOperations.citizens_take_2Doses_or_more(); // calling method to count nmber of citizens how take 2 doses or more
    
     MainOperations.writeToFille(); // write to file method*/
     
     
     
     
     //_-_-_-_-_-_-_-_-_-___----_-________-------------
     
     
     //the next code if i want user to input  data
    
  /* Scanner input=new Scanner(System.in);
          System.out.println("enter number of citizens you want to add");
          int a = input.nextInt();
          for (int i=1 ; i<=a ;i++){
              System.out.println("enter name of citizen");
               String name =input.next ();
              System.out.println("enter citizen ID");         
               String ID= input.next ();
              System.out.println("enter citizen age");  
               int age =input.nextInt();
                System.out.println("enter citizen type");  
               String type=input.next ();
                System.out.println("enter true if citizen married false if he is not");  
               boolean marriage=input.nextBoolean();
              MainOperations.add_new_citizen_to_list(name, ID, age, type, marriage);
          }*/
         
       
 }
     
 


    
    public void start  (Stage st){
        GridPane pane =new GridPane();
        pane.setHgap(10);
        pane.setVgap(40);
        pane.setStyle("-fx-background-color: #92a8d1; -fx-padding: 20; -fx-font-size: 18;");
        pane.setAlignment(Pos.CENTER);
        
        
        
        Label lname = new Label("Name");
        //lname.setTextFill(Color.web("#ffffff"));
        pane.add(lname, 0, 1);
        TextField tfName = new TextField();
        //tfName.setStyle("-fx-text-fill: black; -fx-font-size: 24px;");
        pane.add(tfName, 1, 1);
        
        Label lid = new Label("ID");
        //lid.setTextFill(Color.web("#ffffff"));
        pane.add(lid, 2, 1);
        TextField tfID = new TextField();
        pane.add(tfID, 3, 1);
        
        
        Label lage = new Label("Age");
        //lage.setTextFill(Color.web("#ffffff"));
        pane.add(lage, 0, 2);
        TextField tfAge = new TextField();
        tfAge.setPrefColumnCount(3);
        pane.add(tfAge, 1, 2);
        
        
        Label lgender = new Label("Gender");
       // lgender.setTextFill(Color.web("#ffffff"));
       RadioButton mgender = new RadioButton(" Male"); 
        RadioButton fgender = new RadioButton("Fmale");
        ToggleGroup genderGroup = new ToggleGroup(); 
        mgender.setToggleGroup(genderGroup);
        fgender.setToggleGroup(genderGroup);
         
        pane.add(lgender, 0, 3);
        pane.add(mgender, 1, 3);
        pane.add(fgender, 2, 3);
         
        
        
        RadioButton tMarriage = new RadioButton(" YES"); 
        RadioButton fMarriage = new RadioButton("NO");
        ToggleGroup marraigeGroup = new ToggleGroup();// to can select one radio you should create toggelgroup
        tMarriage.setToggleGroup(marraigeGroup);
        fMarriage.setToggleGroup(marraigeGroup);
        Label lmarriage = new Label("are you marriage");
        //lmarriage.setTextFill(Color.web("#ffffff"));
        pane.add(lmarriage, 0, 4);
        pane.add(tMarriage, 1, 4);
        pane.add(fMarriage, 2, 4);
         
        
        Button add = new Button("Add new citizen");
        pane.add(add,6,5);
        pane.setHalignment(add, HPos.RIGHT);
        add.setStyle("-fx-background-color:  #dec2cb ; -fx-font-size: 12px; ");
        
        
        
        add.setOnAction(e->{
        String name = tfName.getText();
        String id = tfID.getText();
        Integer age = Integer.parseInt(tfAge.getText());
        //String gender = tfGender.getText();
        
        if(tMarriage.isResizable() && mgender.isResizable()){
            MainOperations.add_new_citizen_to_list(name,id,age,"Male",true);
            
        }
        else if(fMarriage.isResizable() && mgender.isResizable()){
            MainOperations.add_new_citizen_to_list(name,id,age,"Male",false);
        }
         else if(tMarriage.isResizable() && fgender.isResizable()){
            MainOperations.add_new_citizen_to_list(name,id,age,"Fmale",true);
        }
         else if(fMarriage.isResizable() && fgender.isResizable()) {
            MainOperations.add_new_citizen_to_list(name,id,age,"Fmale",false);
        }
        MainOperations.writeToFille();
    });
         Scene scene = new Scene(pane, 900, 400);
 
    st.setTitle("COVID19"); // Set the stage title
    st.setScene(scene); // Place the scene in the stage
    
    st.show(); // Display the stage

        
        
        
        
        
        
        
        
        
        
        
        
        
        //Image earth = new Image( "earth.png" ) ;
        
        
    }
    
    


}//this class to test program