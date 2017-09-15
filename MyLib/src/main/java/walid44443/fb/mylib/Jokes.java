package walid44443.fb.mylib;

public class Jokes {
    public static String generateNewJoke() {
        String[] joke_arr = {"tm trararm tm tm ,hhh"
                ,"there is one and two and threeeeee hhhhhhh"
                ,"there one asked what is the time , the another man replayed 10.10 , he said tell me 20 hhhhh"};
        return joke_arr[(int) Math.floor(Math.random() * joke_arr.length)];
    }
}
