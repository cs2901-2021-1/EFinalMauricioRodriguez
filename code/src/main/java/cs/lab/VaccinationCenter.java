package cs.lab;

import java.util.List;

public class VaccinationCenter {
    int id;
    String location;
    List<Person> personasVacunadas;

    public void setNewPersona(int id,int age){
        personasVacunadas.add(new Person(id,age));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void applySecondVaccine(int id){
        for (Person persona:personasVacunadas){
            if (persona.getId() == id){
                persona.setAppliedDosis();
            }
        }
    }

    public VaccinationCenter(int id,String location){
        this.id = id;
        this.location = location;
    }

}
