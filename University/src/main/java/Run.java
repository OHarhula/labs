public class Run {
    public static void main(String[] args){
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.CreateUniversityRandomly();
        System.out.println(university.toString());
    }
}
