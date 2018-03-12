package ua.training.model;

import ua.training.model.entities.Record;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Record> records = new ArrayList<>();

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
    public void addRecord(Record record){
        records.add(record);
    }
}
