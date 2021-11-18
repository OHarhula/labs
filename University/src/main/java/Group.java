import java.util.List;

public class Group extends EducationalUnit{

    private List<Human> students;

    public void setStudents(List<Human> students) {
        this.students = students;
    }

    public List<Human> getStudents() {
        return students;
    }

    @Override
    public String toString(){
        String s;
        s = "\n\t\tGroup: "+this.title;
        s = s+"\n\t\tGroup leader is: "+this.manager;
        s = s+"\n\t\tStudents: "+this.students;
        return s;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null||getClass()!=o.getClass()) return false;
        Group group = (Group) o;
        return title.equals(group.title) && manager.equals(group.manager) && students.equals(group.students);
    }
}
