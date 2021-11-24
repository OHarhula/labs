package lab2.creator;

import lab2.model.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanCreatorTest {
    @Test
    void createHumanRandomly(){
        HumanCreator creator = new HumanCreator();
        Human human = creator.CreateHumanRandomly();
        assertTrue(HumanCreator.DICTIONARY_NAMES.contains(human.getName()));
        assertTrue(HumanCreator.DICTIONARY_SURNAMES.contains(human.getSurname()));
        assertTrue((HumanCreator.MIN_YEAR_OF_BIRTH<=human.getYearOfBirth())&&(HumanCreator.MAX_YEAR_OF_BIRTH>=human.getYearOfBirth()));

    }


}