package lab2.creator;

import lab2.model.Cathedra;
import lab2.model.University;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniversityCreatorTest {
    @Test
    void createUniversityRandomly(){
        UniversityCreator creator = new UniversityCreator();
        University university = creator.CreateUniversityRandomly();

        assertTrue(UniversityCreator.DICTIONARY_TITLES.contains(university.getTitle()));
        assertTrue(university.getManager()!=null);
        Integer size = university.getFaculties().size();
        assertTrue((UniversityCreator.MIN_FACULTIES_NUMBER<=size)&&(UniversityCreator.MAX_FACULTIES_NUMBER>=size));

    }

}