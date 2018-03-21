package ua.training.model;

import ua.training.model.entities.Record;
import ua.training.model.exeption.LoginAlreadyExistException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    private List<Record> records = new ArrayList<>();

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public void addRecord(Record record) {
        for (Records element :
                Records.values()) {
            if (element.getName().equals(record)) {
                throw new LoginAlreadyExistException();
            }
        }
    }
}
