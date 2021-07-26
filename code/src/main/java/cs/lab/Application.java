package cs.lab;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Application {
    Scanner capt = new Scanner(System.in);
    static final Logger logger = Logger.getLogger(Final.class.getName());
    private static Application instance = null;
    List<VaccinationCenter> vaccinationCenters;
    private Application(){

    }
    public int getNumberOfVaccinationCenters(){
        return vaccinationCenters.size();
    }

    public void deleteVaccinationCenter(int id){
        for (int i = 0;i<vaccinationCenters.size();i++){
            if (vaccinationCenters.get(i).getId() == id){
                vaccinationCenters.remove(i);
                return;
            }
        }
    }

    public int getPartialVaccinations(){
        int sum = 0;
        for (VaccinationCenter center:vaccinationCenters){
            for (Person persona: center.getPersonasVacunadas()){
                if (persona.getAppliedDosis() == 1) sum++;
            }
        }
        return sum;
    }

    public int getTotalVaccinations(){
        int sum = 0;
        for (VaccinationCenter center:vaccinationCenters){
            for (Person persona: center.getPersonasVacunadas()){
                if (persona.getAppliedDosis() == 2) sum++;
            }
        }
        return sum;
    }

    public void createVaccinationCenter(int id,String location){
        vaccinationCenters.add(new VaccinationCenter(id,location));
    }
    public static synchronized Application getInstance(){
        if (instance == null){
            instance = new Application();
        }
        return instance;
    }

    public void run(){
        int opciones;
        do{
            logger.info("Escoja entre las opciones: ");
            logger.info("(1) Dar de alta un centro");
            logger.info("(2) Dar de alta un centro");
            logger.info("(3) Obtener numeros de centros de vacunacion");
            logger.info("(4) Numero de personas vacunadas parcialmente");
            logger.info("(5) Numero de personas vacunadas totalmente");
            logger.info("(6) Salir del programa");
            opciones = capt.nextInt();
            switch (opciones){
                case 1:
            }
        }while(opciones != 6);
    }

}
