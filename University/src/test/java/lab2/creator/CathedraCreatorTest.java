package lab2.creator;

import lab2.model.Cathedra;
import lab2.model.Faculty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CathedraCreatorTest {

    @Test
    void createCathedraRandomly(){
        CathedraCreator creator = new CathedraCreator();
        Cathedra cathedra = creator.CreateCathedraRandomly();

        assertTrue(cathedra.getTitle()!=null);
        assertTrue(cathedra.getManager()!=null);
        Integer size = cathedra.getGroups().size();
        assertTrue((CathedraCreator.MIN_GROUPS_NUMBER<=size)&&(CathedraCreator.MAX_GROUPS_NUMBER>=size));

    }

}