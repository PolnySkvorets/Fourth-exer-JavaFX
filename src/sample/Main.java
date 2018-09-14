package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Path path = new Path(); //  создание обекта класса графического пути
        MoveTo moveTo = new MoveTo(); // объект класса  - точка начала рисования
        moveTo.setX(50.0f); // координаты точки начала
        moveTo.setY(150.0f);
        CubicCurveTo cubicCurveTo = new CubicCurveTo(); // создаем объект кривой линии
        cubicCurveTo.setControlX1(400.0f); // опорная точка искривления линии
        cubicCurveTo.setControlY1(10.0f);
        cubicCurveTo.setControlX2(275.0f);// вторая опорная точка искривления линии
        cubicCurveTo.setControlY2(250.0f);
        cubicCurveTo.setX(100.0f);// координаты конца линии
        cubicCurveTo.setY(150.0f);
         path.getElements().add(moveTo);
         path.getElements().add(cubicCurveTo);

        Group root = new Group(path);
        Scene scene = new Scene(root, 600,300);
        primaryStage.setTitle("Cubic curve");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
