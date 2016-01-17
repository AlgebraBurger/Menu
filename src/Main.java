import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Butchokoi on 1/17/2016.
 */
public class Main extends Application{

    Stage window;
    BorderPane layout;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Menu");

        //file menu
        Menu fileMenu = new Menu("_File");

        //Menu Items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e->System.out.println("Create a new file..."));
        fileMenu.getItems().add(newFile);

        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));


        //Edit Menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));


        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(e->System.out.println("Pasting..."));
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }
}
