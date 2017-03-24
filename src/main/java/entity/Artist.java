package entity;

import lombok.*;

import java.util.List;

/**
 * Created by eugen on 3/3/17.
 */
public class Artist {

    private Integer id;

    private String name;

    private String surname;

    public Artist() {
    }

    public Artist(String name, String surname) {
        this.name = name;

        this.surname = surname;
    }

    private List<Instrument> instrumentList;

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Instrument=" + instrumentList +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Instrument> getInstrumentList() {
        return instrumentList;
    }

    public void setInstrumentList(List<Instrument> instrumentList) {
        this.instrumentList = instrumentList;
    }


}
