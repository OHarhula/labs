package lab2.creator;

import lab2.model.Faculty;
import lab2.model.Group;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultyCreatorTest {

    @Test
    void createGroupRandomly(){
        FacultyCreator creator = new FacultyCreator();
        Faculty faculty = creator.CreateFacultyRandomly();

        assertTrue(faculty.getTitle()!=null);
        assertTrue(faculty.getManager()!=null);
        Integer facultySize = faculty.getCathedras().size();
        assertTrue((FacultyCreator.MIN_CATHEDRAS_NUMBER<=facultySize)&&(FacultyCreator.MAX_CATHEDRAS_NUMBER >=facultySize));

    }

}