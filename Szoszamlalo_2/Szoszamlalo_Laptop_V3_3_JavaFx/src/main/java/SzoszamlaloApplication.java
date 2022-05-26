import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


    public class SzoszamlaloApplication extends Application {

        @Override
        public void start(Stage stage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/szoszamlalo.fxml"));
            stage.setTitle("Szoszamlalo");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.show();

        }
    }
