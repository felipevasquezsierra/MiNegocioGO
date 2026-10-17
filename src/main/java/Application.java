import configuration.Config;
import ui.CliUserInterface;

public class Application {

    public static void main(String[] args) {

        CliUserInterface cliUserInterface = Config.getCliUserInterface();
        cliUserInterface.applicationInit();

    }
}
