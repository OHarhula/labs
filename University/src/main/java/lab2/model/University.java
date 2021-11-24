package lab2.model;

import java.util.List;

public class University extends EducationalUnit {
    private List<Faculty> faculties;

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString(){
        String s;
        s = "\n\nUniversity: "+this.title+"\n";
        s = s+"\nUniversity leader is: "+this.manager;
        s = s+"\nFaculties: "+this.faculties;
        return s;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null||getClass()!=o.getClass()) return false;
        University university = (University) o;
        return title.equals(university.title) && manager.equals(university.manager) && faculties.equals(university.faculties);
    }
}
