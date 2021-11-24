package lab4;

import lab2.creator.UniversityCreator;
import lab2.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.CreateUniversityRandomly();
        String path = "C://Users//is7xm//IdeaProjects//University.txt";

        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        universityJSONReaderWriter.WriteToFile(university, path);

        University universityFromJson = universityJSONReaderWriter.ReadeFromFile(path);

        System.out.println("\n\nequals is " + university.equals(universityFromJson) + "\n\n");

    }
}
