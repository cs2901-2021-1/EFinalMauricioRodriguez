package cs.lab;

import java.util.Scanner;

public class Login {
    private String userName;
    private String password;
    private  boolean logged = false;
    Scanner capt = new Scanner(System.in);
    public Login(){

    }
    public void log(){
        System.out.println("Ingrese usuario: ");
        this.userName = capt.next();
        System.out.println("Ingrese contraseña: ");
        this.password = capt.next();
    }
}
