package ss5_access_modifier.bai_tap.lopchighitrongjava;

public class Students {
    private String name="John";
    private String classes="C02";
    Students(){

    }
    public String getName() {
        return name;
    }
    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
