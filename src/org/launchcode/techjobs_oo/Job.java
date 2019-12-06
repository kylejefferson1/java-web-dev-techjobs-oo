package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }




    @Override
    public String toString() {
        String run = "\n" + "ID: " + id + "\n";

        if (name.equals ("")) {
           run += "Name: Data not available\n";
        } else {
            run += "Name: " + getName() + "\n";
        }
        if (employer.getValue().equals ("")) {
            run += "Employer: data not available\n";
        } else {
            run += "Employer: " + getEmployer() + "\n";
        }
        if (location.getValue().equals ("")) {
            run += "Location: data not available\n";
        } else {
            run += "Location: " + getLocation() + "\n";
        }
        if (positionType.getValue().equals ("")) {
            run += "Position Type: data not available\n";
        } else {
            run += "Position Type: " + getPositionType() + "\n";
        }
        if (coreCompetency.getValue().equals ("")) {
            run += "Core Competency: data not available\n";
        } else {
            run += "Core Competency: " + getCoreCompetency() + "\n";
        }

        return run;

    }
}

// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
//  other five fields. The second constructor should also call the first in order to initialize
//  the 'id' field.

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
//  match.

// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//  and id.