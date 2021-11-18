import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Integer yearOfBirth;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString(){
        String s;
        s = "\n\t\t\t"+this.name;
        s = s+" "+this.surname;
        s = s+" "+String.valueOf(this.yearOfBirth);
        return s;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null||getClass()!=o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && surname.equals(human.surname) && yearOfBirth.equals(human.yearOfBirth);
    }


}
