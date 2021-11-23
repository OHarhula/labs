package lab2;

import java.util.List;

public class Faculty extends EducationalUnit {
        private List<Cathedra> cathedras;

    public void setCathedras(List<Cathedra> cathedras) {
        this.cathedras = cathedras;
    }

    public List<Cathedra> getCathedras() {
        return cathedras;
    }

    @Override
    public String toString(){
        String s;
        s = "\nlab2.Faculty: "+this.title;
        s = s+"\nlab2.Faculty leader is: "+this.manager;
        s = s+"\nCathedras: "+this.cathedras;
        return s;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null||getClass()!=o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return title.equals(faculty.title) && manager.equals(faculty.manager) && cathedras.equals(faculty.cathedras);
    }
}
