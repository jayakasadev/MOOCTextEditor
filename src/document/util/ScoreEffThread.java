package document.util;

import document.BasicDocument;
import document.Document;
import document.EfficientDocument;

/**
 * Created by kasa2 on 10/1/2016.
 */
public class ScoreEffThread implements Runnable{
    private long time;
    private String text;
    private int trials;

    public ScoreEffThread(String text, int trials){
        this.text = text;
        this.trials = trials;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for(int a = 0; a < trials; a++){
            Document d = new EfficientDocument(text);
            d.getFleschScore();
        }
        long finishTime = System.currentTimeMillis();

        time = finishTime -startTime;
    }

    public long getTime(){
        return time;
    }
}
