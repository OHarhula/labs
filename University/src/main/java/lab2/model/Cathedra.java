package lab2.model;

import java.util.List;

public class Cathedra extends EducationalUnit {
        private List<Group> groups;

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString(){
        String s;
        s = "\n\tCathedra: "+this.title;
        s = s+"\n\tCathedra leader is: "+this.manager;
        s = s+"\n\tGroups: "+this.groups;
        return s;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null||getClass()!=o.getClass()) return false;
        Cathedra cathedra = (Cathedra) o;
        return title.equals(cathedra.title) && manager.equals(cathedra.manager) && groups.equals(cathedra.groups);
    }
}
