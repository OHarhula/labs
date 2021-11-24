package lab2.model;

import lab2.creator.GroupCreator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    @Test
    void createGroupRandomly(){
        GroupCreator creator = new GroupCreator();
        Group group = creator.CreateGroupRandomly();
        List<Human> students = group.getStudents();
        HashSet<Human> humanSet = new HashSet<>();
        humanSet.add(students.get(1));
        for (int i=0; i< students.size();i++){
            humanSet.add(students.get(i));
        }
        assertEquals(students.size(), humanSet.size());
    }

}