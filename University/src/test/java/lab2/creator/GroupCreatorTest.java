package lab2.creator;

import lab2.model.Group;
import lab2.model.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupCreatorTest {

    @Test
    void createGroupRandomly(){
        GroupCreator creator = new GroupCreator();
        Group group = creator.CreateGroupRandomly();

        assertTrue(group.getTitle()!=null);
        assertTrue(group.getManager()!=null);
        Integer groupSize = group.getStudents().size();
        assertTrue((GroupCreator.MIN_GROUP_SIZE<=groupSize)&&(GroupCreator.MAX_GROUP_SIZE>=groupSize));

    }

}