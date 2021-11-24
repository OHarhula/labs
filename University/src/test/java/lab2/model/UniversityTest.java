package lab2.model;

import lab2.creator.FacultyCreator;
import lab2.creator.UniversityCreator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    @Test
    void createUniversityRandomly(){
        UniversityCreator creator = new UniversityCreator();
        University obj = creator.CreateUniversityRandomly();
        List<Faculty> list = obj.getFaculties();
        HashSet<Faculty> set = new HashSet<>();
        set.add(list.get(1));
        for (int i=0; i< list.size();i++){
            set.add(list.get(i));
        }
        assertEquals(list.size(), set.size());
    }

}