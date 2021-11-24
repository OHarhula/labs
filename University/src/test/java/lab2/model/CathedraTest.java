package lab2.model;

import lab2.creator.CathedraCreator;
import lab2.creator.GroupCreator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CathedraTest {
    @Test
    void createCathedraRandomly(){
        CathedraCreator creator = new CathedraCreator();
        Cathedra obj = creator.CreateCathedraRandomly();
        List<Group> list = obj.getGroups();
        HashSet<Group> set = new HashSet<>();
        set.add(list.get(1));
        for (int i=0; i< list.size();i++){
            set.add(list.get(i));
        }
        assertEquals(list.size(), set.size());


    }

}