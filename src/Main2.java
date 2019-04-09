
/**
 * Created by amrit on 14-03-2017.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main2 extends Application implements EventHandler<ActionEvent> {

    Button button;//creation of object of Button class

    public static void main(String [] args){
        launch(args);//its a method inside application class
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        // primaryStage is an instance of Stage class.
        primaryStage.setTitle("Title of the window");

        button = new Button();
        button.setText("Click Me");

        button.setOnAction(this);// if we click on button it is handle by this class which is handle() function.

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        //creation of scene
        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);

        primaryStage.show();



    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==button){
            System.out.println("YOu clicked me aye!!");
        }
    }
}