package cs.lab;

import java.util.Scanner;
import java.util.logging.Logger;

public class Login {
    Scanner capt = new Scanner(System.in);
    static final Logger logger = Logger.getLogger(Final.class.getName());
    public Login(){

    }
    public void log(){
        boolean logged;
        do{
            logger.info("Ingrese usuario: ");
            String userName = capt.next();
            logger.info("Ingrese contraseña: ");
            String password = capt.next();
            StringBuilder input1 = new StringBuilder();
            input1.append(password);
            input1.reverse();
            String reverse = input1.toString();
            logged = userName.equals(reverse);
        }
        while(logged = false);
        Application app = Application.getInstance();
        app.run();
    }
}
