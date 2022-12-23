package com.example.salonn;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class salon extends Application {

//    fields of first stage
    Label usernameLabel =new Label("Username");
    TextField username =new TextField();
    Label passwordLabel =new Label("Password");
    PasswordField password=new PasswordField();
    Button signin=new Button("Sign In");
    Text salon1 =new Text("BEAUTY SALON");
    Text quote =new Text("If it makes you feel beautiful, then do it.");
    Text warning=new Text("Please try again ");

//    fields of MainStage
    Button registration =new Button("Registration");
    Text salon =new Text("BEAUTY SALON");
    Button BookingAppointment=new Button("Booking Appointment");
    Button CustomerHistory=new Button("History");
    Button Feedback=new Button("Feedback");
    Button exit =new Button("Exit");

//    fields of RegistrationStage
    Text Eregistration=new Text("EMPLOYEE REGISTRATION");
    Label fname=new Label("First Name");
    TextField fnameText =new TextField();
    Label lname=new Label("Last Name");
    TextField lnameText=new TextField();
    Label Address=new Label("Address");
    TextField AddressText=new TextField();
    Label contact=new Label("Contact Number");
    TextField contactText=new TextField();
    Label email=new Label("Email Id");
    TextField emailtext=new TextField();
    Label gender =new Label("Gender");
    RadioButton male = new RadioButton("M");
    RadioButton female = new RadioButton("F");
    Button Submit=new Button("Submit");
    Button registrationBack =new Button("Back");

//    fields of bookingstage
    Text booking=new Text("BOOKING APPOINTMENTS");
    Label cName=new Label("Customer Name");
    TextField cnameText=new TextField();
    Label cEmail=new Label("Email Id");
    TextField cEmailText=new TextField();
    Label cContact=new Label("Contact Number");
    TextField ccontactText=new TextField();
    Label date=new Label("Date ");
    DatePicker dateText=new DatePicker();
    Label day=new Label("Day");
    ChoiceBox<String> days=new ChoiceBox<>();
    Text services=new Text("Services");
    Label Haircut=new Label("Haircut");
    ChoiceBox<String > haircutChoice=new ChoiceBox<>();
    Label Eyebrows=new Label("EyeBrows");
    ChoiceBox<String> Eyebrowschoice=new ChoiceBox<>();
    Label Blowdry=new Label("Blow Dry");
    ChoiceBox<String> Blowdrychoice=new ChoiceBox<>();
    Label skincare=new Label("Skincare");
    ChoiceBox<String> skincareChoice= new ChoiceBox<>();
    Label others=new Label("Other Services");
    ChoiceBox<String> otherChoice=new ChoiceBox<>();
    Button backBooking=new Button("Back");
    Button submitBooking=new Button("Submit");

//      feilds of feedbackStage
    Text customerFeedback=new Text("CUSTOMER FEEDBACK");
    Label feName=new Label("Name");
    TextField feNameText=new TextField();
    Label feEmail=new Label("Email");
    TextField feEmailText=new TextField();
    Label feContact=new Label("Phone Number");
    TextField feContacttext=new TextField();
    Text q=new Text("How was your Experience with us ?");
    ChoiceBox<String> qChoice=new ChoiceBox<>();
    Label comments=new Label("Comments");
    TextField commentsText=new TextField();
    Button backFeedback=new Button("Back");
    Button SubmitFeedback=new Button("Submit");

//    Customer history Fields
    Text history =new Text("DATA HISTORY");
    Button backHistory=new Button("Back");
    Button viewHistory=new Button("Customer Data");
    Button EmployeeHistory=new Button("Employee Data");
    Button updateHistory=new Button("Update Data");




    @Override
    public void start(Stage stage) throws IOException {
//     Employee Registration files names
        File EfnamesFile=new File("Efnames.txt");
        File ElnamesFile=new File("Elnames.txt");
        File EaddressFile=new File("Eaddress.txt");
        File EgenderFile=new File("Egender.txt");

//        customer booking stage file names
        File CnamesFile=new File("Cnames.txt");
        File CemailFile=new File("Cemail.txt");
        File CgenderFile=new File("Cgender.txt");
        File CContactFile=new File("CContact.txt");
        File CdateFile=new File("Cdate.txt");
        File CdayFile=new File("Cday.txt");
        File HaircutFile=new File("Haircut.txt");
        File EyebrowsFile=new File("Eyebrows.txt");
        File BlowdryFile=new File("Blowdry.txt");
        File skincareFile=new File("skincare.txt");
        File othersFile=new File("others.txt");


//       stages
       Stage MainStage=new Stage();
       Stage RegistrationStage=new Stage();
       Stage BookingStage=new Stage();
       Stage FeedbackStage=new Stage();
       Stage CustomerHistoryStage=new Stage();



 //        adding components to gridpane of first stage
       GridPane gridPane=new GridPane();
       gridPane.add(usernameLabel,0,1);
       gridPane.add(username,1,1);
       gridPane.add(passwordLabel,0,2);
       gridPane.add(password,1,2);
       gridPane.add(signin,1,6);
       gridPane.add(salon1,0,0,3,1);
       gridPane.add(quote,0,8,3,1);



        gridPane.setAlignment(Pos.CENTER);
       gridPane.setHgap(10);
       gridPane.setVgap(10);

//       gridpane of MainStage

        GridPane gpMain=new GridPane();
        gpMain.add(salon,0,0,3,1);
        gpMain.add(registration,0,2);
        gpMain.add(BookingAppointment,0,3);
        gpMain.add(CustomerHistory,0,4);
        gpMain.add(Feedback,0,5);
        gpMain.add(exit,0,6);

        gpMain.setVgap(10);
        gpMain.setHgap(10);
        gpMain.setAlignment(Pos.CENTER);

//        gridPane of registrationStage

        ToggleGroup g = new ToggleGroup();
        male.setToggleGroup(g);
        female.setToggleGroup(g);

        GridPane gpRegistration=new GridPane();
        gpRegistration.add(Eregistration,0,0,3,1);
        gpRegistration.add(fname,0,1);
        gpRegistration.add(fnameText,1,1);
        gpRegistration.add(lname,0,2);
        gpRegistration.add(lnameText,1,2);
        gpRegistration.add(Address,0,3);
        gpRegistration.add(AddressText,1,3);
        gpRegistration.add(contact,0,4);
        gpRegistration.add(contactText,1,4);
        gpRegistration.add(email,0,5);
        gpRegistration.add(emailtext,1,5);
        gpRegistration.add(gender,0,6);
        gpRegistration.add(male,1,6);
        gpRegistration.add(female,2,6);
        gpRegistration.add(Submit,0,8);
        gpRegistration.add(registrationBack,2,8);

        gpRegistration.setVgap(10);
        gpRegistration.setHgap(10);
        gpRegistration.setAlignment(Pos.CENTER);

//        GridPane of bookingstage

        GridPane gpBooking=new GridPane();
        days.getItems().addAll("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
        days.setValue("Monday");
        haircutChoice.getItems().addAll("Short","Medium","Long","Men Clipper","kids");
        haircutChoice.setValue("Short");
        Eyebrowschoice.getItems().addAll("Tint","Wax","Reshape","MicroBladding");
        Eyebrowschoice.setValue("Tint");
        Blowdrychoice.getItems().addAll("Short","Medium","Long","Specialized");
        Blowdrychoice.setValue("Short");
        skincareChoice.getItems().addAll("European Facial","Deep Hydrating","Acne facial");
        skincareChoice.setValue("European Facial");
        otherChoice.getItems().addAll("Menicure","Pedicure","Polish Change");
        otherChoice.setValue("Menicure");

        gpBooking.add(booking,0,0,3,1);
        gpBooking.add(cName,0,2);
        gpBooking.add(cnameText,1,2);
        gpBooking.add(cEmail,0,3);
        gpBooking.add(cEmailText,1,3);
        gpBooking.add(cContact,0,4);
        gpBooking.add(ccontactText,1,4);
        gpBooking.add(date,0,6);
        gpBooking.add(dateText,1,6);
        gpBooking.add(day,0,7);
        gpBooking.add(days,1,7);
        gpBooking.add(Haircut,0,9);
        gpBooking.add(haircutChoice,1,9);
        gpBooking.add(Eyebrows,0,10);
        gpBooking.add(Eyebrowschoice,1,10);
        gpBooking.add(Blowdry,0,11);
        gpBooking.add(Blowdrychoice,1,11);
        gpBooking.add(skincare,0,12);
        gpBooking.add(skincareChoice,1,12);
        gpBooking.add(others,0,13);
        gpBooking.add(otherChoice,1,13);
        gpBooking.add(backBooking,3,15);
        gpBooking.add(submitBooking,0,15);

        gpBooking.setVgap(10);
        gpBooking.setHgap(10);
        gpBooking.setAlignment(Pos.CENTER);

//        gridPane og feedbackStage

        GridPane gpFeedback=new GridPane();
        qChoice.getItems().addAll("Excellent","Good","Bad","Very Bad");
        qChoice.setValue("Excellent");

        gpFeedback.add(customerFeedback,0,0,3,1);
        gpFeedback.add(feName,0,2);
        gpFeedback.add(feNameText,1,2);
        gpFeedback.add(feEmail,0,3);
        gpFeedback.add(feEmailText,1,3);
        gpFeedback .add(feContact,0,4);
        gpFeedback.add(feContacttext,1,4);
        gpFeedback.add(q,0,6);
        gpFeedback.add(qChoice,1,6);
        gpFeedback.add(comments,0,7);
        gpFeedback.add(commentsText,1,7);
        gpFeedback.add(backFeedback,2,9);
        gpFeedback.add(SubmitFeedback,0,9);

        gpFeedback.setVgap(10);
        gpFeedback.setHgap(10);
        gpFeedback.setAlignment(Pos.CENTER);

//        gridPane of customer history

        GridPane gpHistory=new GridPane();
        gpHistory.add(history,0,0,3,1);
        gpHistory.add(backHistory,0,6);
        gpHistory.add(viewHistory,0,1);
        gpHistory.add(EmployeeHistory,0,2);
       /*
        gpHistory.add(deleteHistory,0,3);
*/
        gpHistory.setVgap(10);
        gpHistory.setHgap(10);
        gpHistory.setAlignment(Pos.CENTER);
//      styling salon
        salon1.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));
        salon1.setFill(Color.rgb(170, 51, 106));
        //      styling salon
        salon.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));
        salon.setFill(Color.rgb(170, 51, 106));

//        quote styling
        quote.setFont(Font.font("times new roman", FontWeight.BOLD, 18));
        quote.setFill(Color.rgb(170, 51, 106));
//      sign in styling
        signin.setStyle("-fx-border-style:solid;-fx-background-color:purple;-fx-text-fill:white;-fx-border:none");
//    warning stylings
        warning.setFill(Color.rgb(255,0,0));
//        employe registration styling
        Eregistration.setFill(Color.rgb(255,20,147));
        Eregistration.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));
//         booking custmer styling
        booking.setFill(Color.rgb(255,20,147));
        booking.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));
//        Feedback styling
        customerFeedback.setFill(Color.rgb(255,20,147));
        customerFeedback.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));
//        history styling
        history.setFill(Color.rgb(255,20,147));
        history.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));

//      sign in button function
       signin.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               String user="hirra";
               String pass="1234";

               if(user.equals(username.getText())&& pass.equals(password.getText())){
//                   previous stage willl close and new will appear
                   stage.close();
                   MainStage.show();
               }
               else {

                   gridPane.add(warning, 0, 5,2,1);
                   if(user.equals(username.getText())&& pass.equals(password.getText())){
//                   previous stage willl close and new will appear
                       stage.close();
                       MainStage.show();
                   }
               }
           }
       });

//       registration button function
        registration.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                MainStage.close();
                RegistrationStage.show();
            }
        });
//        exit button function
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                MainStage.close();
            }
        });
//        registractionback button function
        registrationBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                RegistrationStage.close();
                MainStage.show();
            }
        });
//        booking button function

        BookingAppointment.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                MainStage.close();
                BookingStage.show();
            }
        });

//        backBooking function
        backBooking.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                BookingStage.close();
                MainStage.show();
            }
        });

//        feedback button function
        Feedback.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                MainStage.close();
                FeedbackStage.show();
            }
        });

//        backFeedback  function
        backFeedback.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FeedbackStage.close();
                MainStage.show();
            }
        });
//       customer history button
        CustomerHistory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                MainStage.close();
                CustomerHistoryStage.show();
            }
        });

//        back customer history button
        backHistory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                CustomerHistoryStage.close();
                MainStage.show();
            }
        });
//      registration submit button
        Submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                String EfnameF= fnameText.getText();
                String ElnameF=lnameText.getText();
                String EaddressF=AddressText.getText();

                ArrayList<String> Efname=new ArrayList<>();
                ArrayList<String> Elname=new ArrayList<>();
                ArrayList<String> Eaddress=new ArrayList<>();
                ArrayList<Toggle> Egender=new ArrayList<>();

                Efname.add(EfnameF);
                Elname.add(ElnameF);
                Eaddress.add(EaddressF);
                Egender.add(g.getSelectedToggle());

//            employee first name file handling
                String[] EfnameArray=Efname.toArray(new String[0]); //arraylist
                FileWriter Efnamefw= null;
                try {
                    Efnamefw = new FileWriter(EfnamesFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Efnamefw!= null;
                BufferedWriter Efnamebw=new BufferedWriter(Efnamefw);
                for(int x=0;x<EfnameArray.length;x++){   //string
                    try {
                        if(Efnamebw.toString().length()!=0){
                            Efnamebw.write(EfnameArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Efnamebw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Efnamebw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//        employee last name filehandling

                String[] ElnameArray=Elname.toArray(new String[0]);
                FileWriter Elnamefw= null;
                try {
                    Elnamefw = new FileWriter(ElnamesFile,true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Elnamefw!= null;
                BufferedWriter Elnamebw=new BufferedWriter(Elnamefw);
                for(int x=0;x<ElnameArray.length;x++){
                    try {
                        if(Elnamebw.toString().length()!=0){
                            Elnamebw.write(ElnameArray[x]);}
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Elnamebw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Elnamebw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//        employee address file handling

                String[] EaddressArray=Eaddress.toArray(new String[0]); //arraylist
                FileWriter Eaddressfw= null;
                try {
                    Eaddressfw = new FileWriter(EaddressFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Eaddressfw!= null;
                BufferedWriter Eaddressbw=new BufferedWriter(Eaddressfw);
                for(int x=0;x<EfnameArray.length;x++){   //string
                    try {
                        if(Eaddressbw.toString().length()!=0){
                            Eaddressbw.write(EaddressArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Eaddressbw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Eaddressbw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//        gender filehandling
                Toggle[] genderArray=Egender.toArray(new Toggle[0]); //arraylist
                FileWriter genderfw= null;
                try {
                    genderfw = new FileWriter(EgenderFile,true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert genderfw != null;
                BufferedWriter genderbw=new BufferedWriter(genderfw);

                for(int x=0;x<genderArray.length;x++){
                    try {
                        if(genderbw.toString().length()!=0){
                            genderbw.write(genderArray[x].toString());}
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        genderbw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        genderbw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }



            }
        });


//        submit booking function
        submitBooking.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                String Sname =cnameText.getText();
                String Semail =cEmailText.getText();


//            create arraylists
                ArrayList<LocalDate> dateA=new ArrayList<>();
                ArrayList<String> dayA=new ArrayList<>();
                ArrayList<String> HaircutA=new ArrayList<>();
                ArrayList<String> EyebrowsA=new ArrayList<>();
                ArrayList<String> BlowdryA=new ArrayList<>();
                ArrayList<String> skincareA=new ArrayList<>();
                ArrayList<String> othersA=new ArrayList<>();
                ArrayList<String> contactA=new ArrayList<>();
                ArrayList<String> nameA=new ArrayList<>();
                ArrayList<String> emailA=new ArrayList<>();

//                add values in arraylists
                dateA.add(dateText.getValue());
                dayA.add(days.getValue());
                HaircutA.add(haircutChoice.getValue());
                EyebrowsA.add(Eyebrowschoice.getValue());
                BlowdryA.add(Blowdrychoice.getValue());
                skincareA.add(skincareChoice.getValue());
                othersA.add(otherChoice.getValue());
                contactA.add(ccontactText.getText());
                nameA.add(Sname);
                emailA.add(Semail);

//                customer name file handling
                String[] CnameArray=nameA.toArray(new String[0]); //arraylist
                FileWriter Cnamefw= null;
                try {
                    Cnamefw = new FileWriter(CnamesFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Cnamefw!= null;
                BufferedWriter Cnamebw=new BufferedWriter(Cnamefw);
                for(int x=0;x<CnameArray.length;x++){   //string
                    try {
                        if(Cnamebw.toString().length()!=0){
                            Cnamebw.write(CnameArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cnamebw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cnamebw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//            customer email file handling

                String[] CemailArray=emailA.toArray(new String[0]); //arraylist
                FileWriter Cemailfw= null;
                try {
                    Cemailfw = new FileWriter(CemailFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Cemailfw!= null;
                BufferedWriter Cemailbw=new BufferedWriter(Cemailfw);
                for(int x=0;x<CemailArray.length;x++){   //string
                    try {
                        if(Cemailbw.toString().length()!=0){
                            Cemailbw.write(CemailArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cemailbw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cemailbw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//                customer date
                LocalDate[] CdateArray=dateA.toArray(new LocalDate[0]); //arraylist
                FileWriter Cdatefw= null;
                try {
                    Cdatefw = new FileWriter(CdateFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Cdatefw!= null;
                BufferedWriter Cdatebw=new BufferedWriter(Cdatefw);
                for(int x=0;x<CdateArray.length;x++){   //string
                    try {
                        if(Cdatebw.toString().length()!=0){
                            Cdatebw.write(CdateArray[x].toString());} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cdatebw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cdatebw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//                cutomer contact file handling

                String[] CcontactArray=contactA.toArray(new String[0]); //arraylist
                FileWriter Ccontactfw= null;
                try {
                    Ccontactfw = new FileWriter(CContactFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Ccontactfw!= null;
                BufferedWriter Ccontactbw=new BufferedWriter(Ccontactfw);
                for(int x=0;x<CcontactArray.length;x++){   //string
                    try {
                        if(Ccontactbw.toString().length()!=0){
                            Ccontactbw.write(CcontactArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Ccontactbw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Ccontactbw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//      customer day file handling
                String[] CdayArray=dayA.toArray(new String[0]); //arraylist
                FileWriter Cdayfw= null;
                try {
                    Cdayfw = new FileWriter(CdayFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Cdayfw != null;
                BufferedWriter Cdaybw =new BufferedWriter(Cdayfw );
                for(int x=0;x<CdayArray.length;x++){   //string
                    try {
                        if(Cdaybw .toString().length()!=0){
                            Cdaybw .write(CdayArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cdaybw .newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cdaybw .flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//customer haircut
                String[] ChaircutArray=HaircutA.toArray(new String[0]); //arraylist
                FileWriter Chaircutfw= null;
                try {
                    Chaircutfw = new FileWriter(HaircutFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Chaircutfw != null;
                BufferedWriter Chaircutbw=new BufferedWriter(Chaircutfw );
                for(int x=0;x<ChaircutArray.length;x++){   //string
                    try {
                        if(Chaircutbw .toString().length()!=0){
                            Chaircutbw .write(ChaircutArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Chaircutbw .newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Chaircutbw .flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//customer blowdry

                String[] CblowdryArray=BlowdryA.toArray(new String[0]); //arraylist
                FileWriter Cblowdryfw= null;
                try {
                    Cblowdryfw = new FileWriter(BlowdryFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Cblowdryfw != null;
                BufferedWriter Cblowdrybw=new BufferedWriter(Cblowdryfw );
                for(int x=0;x<CblowdryArray.length;x++){   //string
                    try {
                        if( Cblowdrybw .toString().length()!=0){
                            Cblowdrybw .write(CblowdryArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cblowdrybw .newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cblowdrybw .flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//                customer eyebrow

                String[] CeyebrowArray=BlowdryA.toArray(new String[0]); //arraylist
                FileWriter Ceyebrowfw= null;
                try {
                    Ceyebrowfw= new FileWriter(EyebrowsFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Ceyebrowfw != null;
                BufferedWriter Ceyebrowbw=new BufferedWriter(Ceyebrowfw );
                for(int x=0;x<CeyebrowArray.length;x++){   //string
                    try {
                        if( Ceyebrowbw .toString().length()!=0){
                            Ceyebrowbw .write(CeyebrowArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Ceyebrowbw .newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Ceyebrowbw .flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
//    customer skin care
                String[] CskinArray=skincareA.toArray(new String[0]); //arraylist
                FileWriter Cskinfw= null;
                try {
                    Cskinfw= new FileWriter(skincareFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Cskinfw != null;
                BufferedWriter Cskinbw=new BufferedWriter(Cskinfw );
                for(int x=0;x<CskinArray.length;x++){   //string
                    try {
                        if( Cskinbw .toString().length()!=0){
                            Cskinbw.write(CskinArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cskinbw .newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cskinbw .flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//                customer others
                String[] CotherArray=othersA.toArray(new String[0]); //arraylist
                FileWriter Cotherfw= null;
                try {
                    Cotherfw= new FileWriter(othersFile,true);//file
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert Cotherfw != null;
                BufferedWriter Cotherbw=new BufferedWriter(Cotherfw );
                for(int x=0;x<CotherArray.length;x++){   //string
                    try {
                        if( Cotherbw .toString().length()!=0){
                            Cotherbw .write(CotherArray[x]);} //string
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cotherbw .newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Cotherbw .flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

//        customer view history button
        viewHistory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                CustomerHistoryStage.close();
                Button backview=new Button("Back");
                GridPane gpView=new GridPane();
                gpView.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");

//                Text heading=new Text("Customer data");
                Label index=new Label("Index");
                Label Vname=new Label("Name");
                Label Vcontact=new Label("Contact Number");
                Label Vemail=new Label("Email");

                index.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));
                Vname.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));
                Vemail.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));
                Vcontact.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));

                /*heading.setFill(Color.rgb(255,20,147));
                heading.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));
*/
//                gpView.add(heading,0,0,5,1);
                gpView.addRow(0,index,Vname,Vcontact,Vemail);
                gpView.add(backview,4,10,2,1);
//                gpView.addColumn(4,backview);
                gpView.setAlignment(Pos.CENTER);
//                gpView.setHgap(10);
//                gpView.setVgap(10);
                gpView.setGridLinesVisible(true);
                gpView.setPadding(Insets.EMPTY);

//                reading customer names
                Scanner readNames= null;
                try {
                    readNames = new Scanner(CnamesFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int count=0;
                while(readNames.hasNextLine()){

                    Label textArea=new Label(readNames.nextLine());
                    if(textArea.toString().length()!=0){
                        gpView.addColumn(1,textArea);
                        count++;}

                }
//index
                for(int x=1; x<=count;x++){
                    String ind= String.valueOf(x);
                    Label indexes=new Label(ind);
                    gpView.addColumn(0,indexes);
                }

//                reading customer contact numbers
                Scanner readc= null;
                try {
                    readc = new Scanner(CContactFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int countc=0;
                while(readc.hasNextLine()){

                    Label textAreac=new Label(readc.nextLine());
                    if(textAreac.toString().length()!=0){
                        gpView.addColumn(2,textAreac);
                        countc++;}

                }



//                reading customer emails
                Scanner reademail= null;
                try {
                    reademail = new Scanner(CemailFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int countE=0;
                while(reademail.hasNextLine()){

                    Label textAreaE=new Label(reademail.nextLine());
                    if(textAreaE.toString().length()!=0){
                        gpView.addColumn(3,textAreaE);
                        countE++;}

                }

                // create a background fill
                BackgroundFill background_fill = new BackgroundFill(Color.rgb(247,202,201),
                        CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background = new Background(background_fill);
                gpView.setBackground(background);




                Stage ViewHistoryStage=new Stage();
                Scene ViewHistoryScene=new Scene(gpView,600,500);
                ViewHistoryStage.setScene(ViewHistoryScene);
                ViewHistoryStage.show();

                backview.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        ViewHistoryStage.close();
                        CustomerHistoryStage.show();
                    }
                });

            }


        });

//        employee history


        EmployeeHistory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                CustomerHistoryStage.close();
                Button backviewE=new Button("Back");
                GridPane gpViewE=new GridPane();
                gpViewE.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");

//                Text heading=new Text("Customer data");
                Label indexE=new Label("Index");
                Label VnameE=new Label("First Name");
                Label VcontactE=new Label("Last Name");
                Label Vaddress=new Label("Address");

                indexE.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));
                VnameE.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));
                Vaddress.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));
                VcontactE.setFont(Font.font("Times New Roman",FontWeight.BOLD,17));

                /*heading.setFill(Color.rgb(255,20,147));
                heading.setFont(Font.font("times new roman", FontWeight.EXTRA_BOLD, 32));
*/
//                gpView.add(heading,0,0,5,1);
                gpViewE.addRow(0,indexE,VnameE,VcontactE,Vaddress);
                gpViewE.add(backviewE,4,10,2,1);
//                gpView.addColumn(4,backview);
                gpViewE.setAlignment(Pos.CENTER);
//                gpView.setHgap(10);
//                gpView.setVgap(10);
                gpViewE.setGridLinesVisible(true);
                gpViewE.setPadding(Insets.EMPTY);

//                reading  names
                Scanner readNamesE= null;
                try {
                    readNamesE = new Scanner(EfnamesFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int countE=0;
                while(readNamesE.hasNextLine()){

                    Label textAreaE=new Label(readNamesE.nextLine());
                    if(textAreaE.toString().length()!=0){
                        gpViewE.addColumn(1,textAreaE);
                        countE++;}

                }
//index
                for(int x=1; x<=countE;x++){
                    String ind= String.valueOf(x);
                    Label indexes=new Label(ind);
                    gpViewE.addColumn(0,indexes);
                }

//                reading  contact numbers
                Scanner readcE= null;
                try {
                    readcE = new Scanner(ElnamesFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int countcE=0;
                while(readcE.hasNextLine()){

                    Label textAreacE=new Label(readcE.nextLine());
                    if(textAreacE.toString().length()!=0){
                        gpViewE.addColumn(2,textAreacE);
                        countcE++;}

                }



//                reading  EaddressFile
                Scanner readaddress= null;
                try {
                    readaddress = new Scanner(EaddressFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int countEE=0;
                while(readaddress.hasNextLine()){

                    Label textAreaEE=new Label(readaddress.nextLine());
                    if(textAreaEE.toString().length()!=0){
                        gpViewE.addColumn(3,textAreaEE);
                        countEE++;}

                }


                // create a background fill
                BackgroundFill background_fill = new BackgroundFill(Color.rgb(247,202,201),
                        CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background = new Background(background_fill);
                gpViewE.setBackground(background);

                Stage ViewEHistoryStage=new Stage();
                Scene ViewEHistoryScene=new Scene(gpViewE,600,500);
                ViewEHistoryStage.setScene(ViewEHistoryScene);
                ViewEHistoryStage.show();

                backviewE.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        ViewEHistoryStage.close();
                        CustomerHistoryStage.show();
                    }
                });

            }
        });
//       scenes and stages
        Scene  mainStageScene=new Scene(gpMain,600,500);
        Scene  registrationScene=new Scene(gpRegistration,600,500);
        Scene FeedbackScene=new Scene(gpFeedback,600,500);
        Scene  BookingScene=new Scene(gpBooking,600,500);
        Scene CustomerHistoryScene=new Scene(gpHistory,600,500);
        Scene scene=new Scene(gridPane,600,500);



        RegistrationStage.setScene(registrationScene);
        BookingStage.setScene(BookingScene);
        FeedbackStage.setScene(FeedbackScene);
        MainStage.setScene(mainStageScene);
        CustomerHistoryStage.setScene(CustomerHistoryScene);
        stage.setScene(scene);



        gpFeedback.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");
        gpBooking.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");
        gpRegistration.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");
        gpMain.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");
        gpHistory.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");
        gridPane.setStyle("-fx-border-style:solid;-fx-border-color:purple;-fx-border-width:3px");




        // create a image
        Image image = new Image("user.jpg");
        Image Mainimage = new Image("1p.jpeg");
        Image Regimage = new Image("2pp.jpg");
        // create a background image
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        BackgroundImage Mainbackgroundimage = new BackgroundImage(Mainimage,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        BackgroundImage Regbackgroundimage = new BackgroundImage(Regimage,
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);

        // create Background
        Background background1 = new Background(backgroundimage);
        Background background2 = new Background(Mainbackgroundimage);
        Background background3 = new Background(Regbackgroundimage);



        // create a background fill
        BackgroundFill background_fill = new BackgroundFill(Color.rgb(247,202,201),
                CornerRadii.EMPTY, Insets.EMPTY);

        // create Background
        Background background = new Background(background_fill);
        gpBooking.setBackground(background);
        gpHistory.setBackground(background);
        gpFeedback.setBackground(background);

//        setting in gridPane
        gridPane.setBackground(background1);
        gpMain.setBackground(background2);
        gpRegistration.setBackground(background3);

        //        cusor styling
        Image img =new Image("lipo.png");
        //cursor lipstick
        scene.setCursor(new ImageCursor(img));
        mainStageScene.setCursor(new ImageCursor(img));
        registrationScene.setCursor(new ImageCursor(img));
        FeedbackScene.setCursor(new ImageCursor(img));
        CustomerHistoryScene.setCursor(new ImageCursor(img));
        BookingScene.setCursor(new ImageCursor(img));

        //fix resize
        MainStage.setResizable(false);
        BookingStage.setResizable(false);
        RegistrationStage.setResizable(false);
        FeedbackStage.setResizable(false);
        stage.setResizable(false);

        stage.show();


    }

//    main class
    public static void main(String[] args) {

        launch();
    }
}