package lab2;

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
        s = "\n\nlab2.University: "+this.title+"\n";
        s = s+"\nlab2.University leader is: "+this.manager;
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
