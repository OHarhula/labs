package lab2.creator;

import lab2.model.Cathedra;
import lab2.model.Group;

import java.util.*;
import java.util.Random;

public class CathedraCreator {

    public static final List<String> DICTIONARY_LETTERS_FOR_ABBREVIATION = Arrays.asList("A","E","I","O","U","Y","B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Z");

    public static final Integer MAX_GROUPS_NUMBER = 10;
    public static final Integer MIN_GROUPS_NUMBER = 5;

    public static final Integer MAX_LETTERS_IN_ABBREVIATION = 5;
    public static final Integer MIN_LETTERS_IN_ABBREVIATION = 2;


    public Cathedra CreateCathedraRandomly(){
        Random random = new Random();

        GroupCreator groupCreator = new GroupCreator();
        HumanCreator humanCreator = new HumanCreator();

        Integer numberOfGroups = random.nextInt(MAX_GROUPS_NUMBER-MIN_GROUPS_NUMBER)+MIN_GROUPS_NUMBER;
        Cathedra cathedra = new Cathedra();
        Integer numberOfLetters = random.nextInt(MAX_LETTERS_IN_ABBREVIATION-MIN_LETTERS_IN_ABBREVIATION)+MIN_LETTERS_IN_ABBREVIATION;
        String s = DICTIONARY_LETTERS_FOR_ABBREVIATION.get(random.nextInt(DICTIONARY_LETTERS_FOR_ABBREVIATION.size()-1));
        for (int i=0; i<numberOfLetters; i++){
            s = s + DICTIONARY_LETTERS_FOR_ABBREVIATION.get(random.nextInt(DICTIONARY_LETTERS_FOR_ABBREVIATION.size()-1));
        }
        cathedra.setTitle(s);

        cathedra.setManager(humanCreator.CreateHumanRandomly());
        List<Group> groups = new ArrayList<>();

        for (int i=0; i<=numberOfGroups; i++){
            groups.add(groupCreator.CreateGroupRandomly());
        }
        cathedra.setGroups(groups);

        return cathedra;
    }
}
