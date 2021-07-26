package cs.lab;

import java.util.List;

public class Application {
    private static Application instance = null;
    List<VaccinationCenter> vaccinationCenters;
    private Application(){

    }
    private int getNumberOfVaccinationCenters(){
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

}
