package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;

import java.util.Properties;

public class Main extends Application {

    GridPane grid;

    @Override
    public void start(Stage stage) throws Exception {
        grid = new GridPane();
        Scene scene = new Scene(grid, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Everything4Rent");


//        CreateSignIn();
//        CreateLogIn();
//        sendMail();


        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    private void CreateSignIn()
    {
        Text welcomeText = new Text();
        welcomeText.setText("Welcome to Everthing4Rent");
        welcomeText.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 20));
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        grid.add(welcomeText, 0, 0, 2, 1);

        Label usermailname = new Label();
        usermailname.setText("Email");
        grid.add(usermailname, 0, 1);

        TextField usermailfield = new TextField();
        grid.add(usermailfield, 1, 1);

        Label userfname = new Label();
        userfname.setText("First Name");
        grid.add(userfname, 0, 2);

        TextField userfnamefield = new TextField();
        grid.add(userfnamefield, 1, 2);

        Label userlname = new Label();
        userlname.setText("Last Name");
        grid.add(userlname, 0, 3);

        TextField userlnamefield = new TextField();
        grid.add(userlnamefield, 1, 3);

        Label password = new Label();
        password.setText("Password");
        grid.add(password, 0, 4);

        PasswordField passwordfield = new PasswordField();
        grid.add(passwordfield, 1, 4);

        Button button = new Button("Sign In");
        HBox hbox = new HBox(8); // spacing = 8
        hbox.getChildren().add(button);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(hbox, 1, 5);
        //grid.setGridLinesVisible(true); //Uncomment to see the actual layout
        final Text pressedText = new Text();
        pressedText.setFill(Color.FIREBRICK);
        grid.add(pressedText, 1, 6);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RemoveSignIn();
            }
        });
    }

    private void RemoveSignIn()
    {
        grid.getChildren().clear();
    }

    private void CreateLogIn()
    {
        Text welcomeText = new Text();
        welcomeText.setText("Welcome to Everthing4Rent");
        welcomeText.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 20));
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        grid.add(welcomeText, 0, 0, 2, 1);

        Label usermailname = new Label();
        usermailname.setText("Email");
        grid.add(usermailname, 0, 1);

        TextField usermailfield = new TextField();
        grid.add(usermailfield, 1, 1);

        Label password = new Label();
        password.setText("Password");
        grid.add(password, 0, 2);

        PasswordField passwordfield = new PasswordField();
        grid.add(passwordfield, 1, 2);

        Button button = new Button("Log In");
        HBox hbox = new HBox(8); // spacing = 8
        hbox.getChildren().add(button);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(hbox, 1, 3);
        //grid.setGridLinesVisible(true); //Uncomment to see the actual layout
        final Text pressedText = new Text();
        pressedText.setFill(Color.FIREBRICK);
        grid.add(pressedText, 1, 4);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RemoveLogIn();
            }
        });
    }

    private void RemoveLogIn()
    {
        grid.getChildren().clear();
    }

//    private sendMail()
//    {
//        String to = "talivanov@gmail.com";
//
//        // Sender's email ID needs to be mentioned
//        String from = "talivanov@gmail.com";
//
//        // Assuming you are sending email from localhost
//        String host = "localhost";
//
//        // Get system properties
//        Properties properties = System.getProperties();
//
//        // Setup mail server
//        properties.setProperty("mail.smtp.host", host);
//
//        // Get the default Session object.
//        Session session = Session.getDefaultInstance(properties);
//
//        try {
//            // Create a default MimeMessage object.
//            MimeMessage message = new MimeMessage(session);
//
//            // Set From: header field of the header.
//            message.setFrom(new InternetAddress(from));
//
//            // Set To: header field of the header.
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//            // Set Subject: header field
//            message.setSubject("This is the Subject Line!");
//
//            // Now set the actual message
//            message.setText("This is actual message");
//
//            // Send message
//            Transport.send(message);
//            System.out.println("Sent message successfully....");
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
//    }


}