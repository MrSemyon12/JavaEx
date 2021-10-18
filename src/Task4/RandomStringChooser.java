package Task4;

import java.util.ArrayList;
import java.util.Random;
public class RandomStringChooser {

    private ArrayList<String> wordArray;

    public RandomStringChooser(String[] wordArray){
        this.wordArray = new ArrayList<>();
        for (String current: wordArray) {
            this.wordArray.add(current);
        }
    }

    public String getNext(){
        if (this.wordArray.size() == 0)
        {
            return null;
        }
        else
        {
            Random random = new Random();
            int delIndex = random.nextInt(wordArray.size());
            String delString = this.wordArray.get(delIndex);
            this.wordArray.remove(delIndex);
            return delString;
        }
    }

}
