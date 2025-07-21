
public class Person {
    private String name;
    private int age;
    private String gender;
    
    // Constructor
    public Person(String pangalan, int edad, String kasarian) {
        this.name = pangalan;
        this.age = edad;
        this.gender = kasarian;
    }
    
    // Getters and setters
    public String getPangalan() {
        return name;
    }
    
    public void setPangalan(String name) {
        this.name = name;
    }
    
    public int getEdad() {
        return age;
    }
    
    public void setEdad(int age) {
        this.age = age;
    }
    
    public String getKasarian() {
        return gender;
    }
    
    public void setKasarian(String gender) {
        this.gender = gender;
    }
}