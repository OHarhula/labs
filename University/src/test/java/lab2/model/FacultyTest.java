package lab2.model;

import lab2.creator.CathedraCreator;
import lab2.creator.FacultyCreator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {
    @Test
    void createFacultyRandomly(){
        FacultyCreator creator = new FacultyCreator();
        Faculty obj = creator.CreateFacultyRandomly();
        List<Cathedra> list = obj.getCathedras();
        HashSet<Cathedra> set = new HashSet<>();
        set.add(list.get(1));
        for (int i=0; i< list.size();i++){
            set.add(list.get(i));
        }
        assertEquals(list.size(), set.size());


    }

}