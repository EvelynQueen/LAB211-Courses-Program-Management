package data;

public class Topic {
    private String ID;
    private String name;
    private boolean type;
    private String tittle;
    private int duration;
    
    public Topic(String iD, String name, boolean type, String tittle, int duration) {
        ID = iD;
        this.name = name;
        this.type = type;
        this.tittle = tittle;
        this.duration = duration;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public boolean isType() {
        return type;
    }

    public String getTittle() {
        return tittle;
    }

    public int getDuration() {
        return duration;
    }
    
    

}