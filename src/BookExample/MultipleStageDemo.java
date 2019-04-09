package BookExample;
/**
 * Created by amrit on 14-03-2017.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //create a button and place it in the scene
        Scene scene = new Scene(new Button("ButOK1"),200,250);
        //set the title of the first stage
        primaryStage.setTitle("Primary Stage");
        //place a scene in the stage
        primaryStage.setScene(scene);
        //show the first stage
        primaryStage.show();

        //create a new stage
        Stage stage = new Stage();
        //set the stage title
        stage.setTitle("Second stage");
        //set the scene with a button in the stage
       /* Scene scene2 = new Scene(new Button("ButOK2"),100,100);
        stage.setScene(scene2);*/

        stage.setScene(new Scene(new Button("butok2"),100,100));
        stage.show();

    }
}
