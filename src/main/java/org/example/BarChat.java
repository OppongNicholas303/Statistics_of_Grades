package org.example;

public class BarChat {

    private static double [] scores;

    public BarChat(double[] scores) {
        BarChat.scores = scores;
    }

    private static int [] scoresStats(){
        int [] stats = new int[5];

        for (double score : scores) {
            if (score <= 20) {
                stats[0]++;
            } else if (score <= 40) {
                stats[1]++;
            } else if (score <= 60) {
                stats[2]++;
            } else if (score <= 80) {
                stats[3]++;
            } else {
                stats[4]++;
            }
        }
        return stats;
    }


    private static int getMaxStat() {
        int maxStats = scoresStats()[0];
        for(int stat : scoresStats()){
            maxStats = Math.max(maxStats, stat);
        }
        return maxStats;
    }

    public void getGraph(){
        System.out.println();
        for (int i = getMaxStat()-1; i >= 0; i--){
            System.out.print(i+1 + ">  ");
            for (int stat : scoresStats()){
                if(stat > i){
                    System.out.print("#######   ");
                }else {
                    System.out.print("          ");
                }

            }
            System.out.println();
        }

        System.out.println("  +---------+---------+---------+---------+---------+");
        System.out.println("      0-20     21-40     41-60     61-80     80-100 ");
    }
}
