package cs.lab;

import java.util.List;

public class VaccinationCenter {
    int ID;
    String location;
    List<Person> personasVacunadas;

    public void setNewPersona(int ID,int age){
        personasVacunadas.add(new Person(ID,age));
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Person> getPersonasVacunadas() {
        return personasVacunadas;
    }

    public void setPersonasVacunadas(List<Person> personasVacunadas) {
        this.personasVacunadas = personasVacunadas;
    }

    public void applySecondVaccine(int ID){
        for (Person persona:personasVacunadas){
            if (persona.getID() == ID){
                persona.setAppliedDosis();
            }
        }
    }

    public VaccinationCenter(int ID,String location){
        this.ID = ID;
        this.location = location;
    }

}
