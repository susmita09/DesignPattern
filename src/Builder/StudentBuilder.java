package Builder;

import java.util.List;

public abstract class StudentBuilder {
    private int rollNumber;
    private String name;
    private int age;
    private String fathername;
    private String motherName;
    protected List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFathername(String fathername) {
        this.fathername = fathername;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilder setSubject();

    public Student build(){
        return new Student(this);
    }


}
