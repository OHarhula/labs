package lab2.creator;

import lab2.model.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HumanCreator {

    public static final List<String> DICTIONARY_NAMES = Arrays.asList("Vasilisa","Taisiya","Anna","Eugene","Vladislav","Victoria","Stanislav","Varvara","Ksenia","Alexandra","Nadezhda","Natalia","Tatiana","Maya","Alexander","Timofey","Milana","Alice","Christina","Ruslan","Lev","Dmitry","Artyom","Kirill","Diana","Matvey","Margarita","Ekaterina","Evangeline","Vera","Anton","Arthur","Gleb","Yaroslav","Yana","Philip","Angelina","Mark","Oleg","Evelina","Sophia","Arina","Daniel","Fatima","Anastasia","Zlata","Eva","Mikhail","Maxim","Andrey");
    public static final List<String> DICTIONARY_SURNAMES = Arrays.asList("Voloshka","Kryuchenko","Ivanenko","Kuzmichenko","Nikolenko","Wolf","Akimenko","Efimenko","Shaposhnik","Sokol","Tikhomirenko","Balashenko","Throat","Loginenko","Kozlenko","Lebedenko","Kalinenko","Samson","Davydenko","Voron","Denisenko","Mikhailenko","Skvorets","Kasat","Swan","Clerk","Gladenko","Filippenko","Nightingale","Alexandrenko","Kryuchek","Ermak","Stepanenko","Kozlyol","Zubenko","Komar","Bogdanenko","Kiselenko","Zhuk","Dobrynenko","Frolenko","Smirnenko","Petrenko","Markinenko","Ershenko","Karasenko","KherbakMorozenko","Nikolaenko","Kuznechenko","Bober","Serenko","Kudryashenko","Egorenko","Sokolenko","Lazarenko","Maksimenko","Stepanenko","Ivanenko","Kolesnichenko","Pike","Kalashnik","Vasilenko","Sergeenko","Maxim","Rog","Moiseenko","Borisenko","Komarenko","Voronenko","Kulak","KalmykFilimonenko","Mikhei","Smirny","Vasilienko","Goldfinch","Matveenko","Aleksenko","Romanenko","Gubanenko","Pop","Tanner");
    public static final Integer MAX_YEAR_OF_BIRTH = 2005;
    public static final Integer MIN_YEAR_OF_BIRTH = 1930;

    public Human CreateHumanRandomly(){
        Random random = new Random();
        Human human = new Human();
        human.setName(DICTIONARY_NAMES.get(random.nextInt(DICTIONARY_NAMES.size()-1)));
        human.setSurname(DICTIONARY_SURNAMES.get(random.nextInt(DICTIONARY_SURNAMES.size()-1)));
        human.setYearOfBirth(random.nextInt(MAX_YEAR_OF_BIRTH-MIN_YEAR_OF_BIRTH)+MIN_YEAR_OF_BIRTH);
        return human;
    }
}
