package data;

import java.sql.Date;

public class Learner {
    private String ID;
    private String name;
    private Date dateOfBirth;
    private double score;
    private Course course;
    
    public Learner() {
    }

    public Learner(String iD, String name, Date dateOfBirth, double score, Course course) {
        ID = iD;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.score = score;
        this.course = course;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getScore() {
        return score;
    }

    public Course getCourse() {
        return course;
    }

    

    
}
