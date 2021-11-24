package lab2;

import lab2.model.University;
import lab2.creator.UniversityCreator;

public class Run {
    public static void main(String[] args){
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.CreateUniversityRandomly();
        System.out.println(university.toString());

    }
}
