package Person;

class Instructor {
    private String name;
    private int Birthyr;
    private double salary;

    public Instructor(String name, int Birthyr, double salary) {
        this.name = name;
        this.Birthyr = Birthyr;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthyr() {
        return Birthyr;
    }

    public void setBirthyr(int Birthyr) {
        this.Birthyr = Birthyr;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\nBirth year: " + Birthyr ;
    }
}