package ua.training.model;

public enum Records {
    MIKE ("Gimple","Mike","Rewwq"),
    KARL ("Grimes","Karl","WD");
    private final String name;
    private final String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    private final String nickname;

    Records(String name, String surname, String nickname) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
    }


//    Records(String surname, String name, String nickname) {
//    }
}
