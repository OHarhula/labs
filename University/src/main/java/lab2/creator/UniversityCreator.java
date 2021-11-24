package lab2.creator;

import lab2.model.Faculty;
import lab2.model.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UniversityCreator {

    public static final List<String> DICTIONARY_TITLES = Arrays.asList("Harvard lab2.model.University","Massachusetts Institute of Technology","Stanford lab2.model.University","Cambridge lab2.model.University","California Institute of Technology","Oxford lab2.model.University","Princeton lab2.model.University","lab2.model.University of Chicago","lab2.model.University College London","Yale lab2.model.University");
    public static final Integer MAX_FACULTIES_NUMBER = 7;
    public static final Integer MIN_FACULTIES_NUMBER = 1;

    public University CreateUniversityRandomly() {
        Random random = new Random();
        FacultyCreator facultyCreator = new FacultyCreator();
        HumanCreator humanCreator = new HumanCreator();

        Integer numberOfFaculties = random.nextInt(MAX_FACULTIES_NUMBER - MIN_FACULTIES_NUMBER) + MIN_FACULTIES_NUMBER;
        University university = new University();

        university.setTitle(DICTIONARY_TITLES.get(random.nextInt(DICTIONARY_TITLES.size() - 1)));

        university.setManager(humanCreator.CreateHumanRandomly());

        List<Faculty> faculties = new ArrayList<>();

        for (int i = 0; i <= numberOfFaculties; i++) {
            faculties.add(facultyCreator.CreateFacultyRandomly());
        }
        university.setFaculties(faculties);

        return university;
    }
}
