package ua.training.model.entities;

import java.util.Date;

public class Record {
    private String surname;
    private String name;
    private String nickname;
    private String comment;
    private Group group;
    private String phone;
    private String email;
    private Address address;
    private Date creationDate= new Date();
    private Date lastChangeDate;

    public Record(String surname, String name,
                  String nickname, String comment,
                  Group group, String phone, String email,
                  Address address, Date creationDate,
                  Date lastChangeDate) {
        this.surname = surname;
        this.name = name;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.creationDate = creationDate;
        this.lastChangeDate = lastChangeDate;
    }

    public Record() { }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", creationDate=" + creationDate +
                ", lastChangeDate=" + lastChangeDate +
                '}';
    }
}
