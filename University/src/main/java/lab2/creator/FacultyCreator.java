package lab2.creator;

import lab2.model.Cathedra;
import lab2.model.Faculty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FacultyCreator {

    public static final List<String> DICTIONARY_LETTERS_FOR_ABBREVIATION = Arrays.asList("A","E","I","O","U","Y","B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Z");
    public static final Integer MAX_CATHEDRAS_NUMBER = 5;
    public static final Integer MIN_CATHEDRAS_NUMBER = 3;

    public static final Integer MAX_LETTERS_IN_ABBREVIATION = 5;
    public static final Integer MIN_LETTERS_IN_ABBREVIATION = 2;


    public Faculty CreateFacultyRandomly(){
        Random random = new Random();
        CathedraCreator cathedracreator = new CathedraCreator();
        HumanCreator humanCreator = new HumanCreator();

        Integer numberOfCathedras = random.nextInt(MAX_CATHEDRAS_NUMBER-MIN_CATHEDRAS_NUMBER)+MIN_CATHEDRAS_NUMBER;
        Faculty faculty = new Faculty();
        Integer numberOfLetters = random.nextInt(MAX_LETTERS_IN_ABBREVIATION-MIN_LETTERS_IN_ABBREVIATION)+MIN_LETTERS_IN_ABBREVIATION;
        String s = DICTIONARY_LETTERS_FOR_ABBREVIATION.get(random.nextInt(DICTIONARY_LETTERS_FOR_ABBREVIATION.size()-1));
        for (int i=0; i<numberOfLetters; i++){
            s = s + DICTIONARY_LETTERS_FOR_ABBREVIATION.get(random.nextInt(DICTIONARY_LETTERS_FOR_ABBREVIATION.size()-1));
        }
        faculty.setTitle(s);

        faculty.setManager(humanCreator.CreateHumanRandomly());
        List<Cathedra> cathedras = new ArrayList<>();

        for (int i=0; i<=numberOfCathedras; i++){
            cathedras.add(cathedracreator.CreateCathedraRandomly());
        }
        faculty.setCathedras(cathedras);

        return faculty;
    }
}
