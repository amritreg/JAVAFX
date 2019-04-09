
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

public class Main3 extends Application {

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

       /* button.setOnAction(new EventHandler<ActionEvent>() {
            @Override //this is called anonymous inner classes and lambada
            //functionality is directly added to the object.
            public void handle(ActionEvent event) {
                System.out.println("THis is 3rd example");
            }
        });*/

       //this is the new version to do called - lambada

        button.setOnAction(e -> {
            System.out.printf("THis is real function \n");
            System.out.printf("Hey you!");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        //creation of scene
        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);

        primaryStage.show();



    }


}
