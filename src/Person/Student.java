package Person;

class Student {
    private String name;
    private int Birthyr;
    private String major;

    // Constructor
    public Student(String name, int Birthyr , String major) {
        this.name = name;
        this.Birthyr = Birthyr;
        this.major = major;
    }

    // Getters and Setters
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

     @Override
    public String toString() {
        return "Name: " + name + "\nBirth year: " + Birthyr + "\nMajor: " + major ;
    }
}