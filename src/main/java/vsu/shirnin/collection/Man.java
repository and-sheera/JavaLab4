package vsu.shirnin.collection;

public class Man {
    private int id;
    private String name;
    private Sex sex;
    private int salary;
    private String bDay;
    private String subdivision;

    /**
     * Main constructor of class
     */
    public Man(int id, String name, Sex sex, int salary, String bDay, String subdivision) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bDay = bDay;
        this.subdivision = subdivision;
    }

    /**
     * @return the id of a person
     */
    public int getId() {
        return id;
    }

    /**
     * @return thi name of a person
     */
    public String getName() {
        return name;
    }

    /**
     * sets a name to a person
     * @param name name of a person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sex of a person
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets a sex of a person
     * @param sex sex of a person
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * @return salary of a person
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets a salary of a person
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return date of birth
     */
    public String getbDay() {
        return bDay;
    }

    /**
     * Sets date of birth
     */
    public void setbDay(String bDay) {
        this.bDay = bDay;
    }

    /**
     * @return name of subdivision
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * Sets subdivision
     */
    public void setSubdivision(String subdivisions) {
        this.subdivision = subdivisions;
    }

    /**
     * @return string data about person
     */
    public String ManToString() {
        return "id: " + id + ", name: " + name + ", sex: " + sex + ", salary: " + salary + ", bDay: " + bDay + ", subdivision: " + subdivision;
    }
}
