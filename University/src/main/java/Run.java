import lab2.University;
import lab2.UniversityCreator;
import lab4.UniversityJSONReaderWriter;

public class Run {
    public static void main(String[] args){
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.CreateUniversityRandomly();
        System.out.println(university.toString());
        String path = "C://Users//is7xm//IdeaProjects//lab2.University.txt";


        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        universityJSONReaderWriter.WriteToFile(university, path);

        University universityFromJson = universityJSONReaderWriter.ReadeFromFile(path);

        System.out.println("\n\nequals is "+university.equals(universityFromJson)+"\n\n");
    }
}
