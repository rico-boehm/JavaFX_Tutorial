
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Login_Screen extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Login");

        Label username  = new Label("Username:");
        Label mail = new Label("E-Mail:");
        Label password = new Label("Password:");

        TextField input_username = new TextField();
        TextField input_mail = new TextField();
        PasswordField input_password = new PasswordField();

        Button create = new Button("Create Account");

        GridPane root = new GridPane();
        root.add(username, 0, 0);
        root.add(mail, 0, 1);
        root.add(password, 0,2);
        root.add(input_username, 1, 0);
        root.add(input_mail, 1, 1);
        root.add(input_password, 1, 2);
        root.add(create, 1, 3);

        //Customize GridPane
        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(15));


        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }
}
