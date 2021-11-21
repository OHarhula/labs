import com.google.gson.Gson;


import java.io.*;
import java.util.Scanner;

public class UniversityJSONReaderWriter {

    public void WriteToFile(University university){
        try{
            File file = new File("C://Users//is7xm//IdeaProjects//University.txt");
            FileWriter fileWriter = new FileWriter("C://Users//is7xm//IdeaProjects//University.txt");

            Gson gson  = new Gson();
            fileWriter.write(gson.toJson(university));

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ol, it's all bullshit, let's do it again!");
        }
    }

    public University ReadeFromFile(String  path){
        University university = null;
        try{
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            String s = scanner.nextLine();
            Gson gson  = new Gson();
            university = gson.fromJson(s, University.class);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Okay girl, programming is not yours");
        }

        return university;
    }




}
