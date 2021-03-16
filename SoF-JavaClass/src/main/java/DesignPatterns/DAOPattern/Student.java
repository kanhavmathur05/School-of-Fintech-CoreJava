package DesignPatterns.DAOPattern;

public class Student {
    private int id;
    private String name;
    private int fee;

    public Student(int id, String name, int fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
