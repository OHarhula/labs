import com.google.gson.Gson;

public class Run {
    public static void main(String[] args){
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.CreateUniversityRandomly();
        System.out.println(university.toString());


        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        universityJSONReaderWriter.WriteToFile(university);

        University universityFromJson = universityJSONReaderWriter.ReadeFromFile("C://Users//is7xm//IdeaProjects//University.txt");

        System.out.println("\n\nequals is "+university.equals(universityFromJson)+"\n\n");
    }
}
