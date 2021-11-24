package lab2.creator;

import lab2.model.Group;
import lab2.model.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupCreator {

    public static final Integer MIN_GROUP_SIZE = 15;
    public static final Integer MAX_GROUP_SIZE = 35;

    public static final Integer MIN_SPECIALTY_NUMBER = 1;
    public static final Integer MAX_SPECIALTY_NUMBER = 200;

    public static final Integer MIN_NUMBER_OF_GROUPS = 1;
    public static final Integer MAX_NUMBER_OF_GROUPS = 3;

    public static final Integer MAX_YEAR_OF_ADMISSION = 21;
    public static final Integer MIN_YEAR_OF_ADMISSION = MAX_YEAR_OF_ADMISSION-5;


    public Group CreateGroupRandomly(){
        Random random = new Random();
        HumanCreator humanCreator = new HumanCreator();

        Integer numberOfStudents = random.nextInt(MAX_GROUP_SIZE-MIN_GROUP_SIZE)+MIN_GROUP_SIZE;
        Group group = new Group();


        group.setTitle(String.valueOf(random.nextInt(MAX_SPECIALTY_NUMBER-MIN_SPECIALTY_NUMBER)+MIN_SPECIALTY_NUMBER)+"-"+String.valueOf(random.nextInt(MAX_YEAR_OF_ADMISSION-MIN_YEAR_OF_ADMISSION)+MIN_YEAR_OF_ADMISSION)+"-"+String.valueOf(random.nextInt(MAX_NUMBER_OF_GROUPS-MIN_NUMBER_OF_GROUPS)+MIN_NUMBER_OF_GROUPS));
        group.setManager(humanCreator.CreateHumanRandomly());
        List<Human> students = new ArrayList<>();
        students.add(group.getManager());

         for (int i=1; i<=numberOfStudents; i++){
             students.add(humanCreator.CreateHumanRandomly());
         }
         group.setStudents(students);
        return group;
    }
}
