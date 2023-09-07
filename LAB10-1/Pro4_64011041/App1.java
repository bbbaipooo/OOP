package Pro4_64011041;

public class App1 {
    public static void main(String[] args) {
        
        String[] rank = new String[1000];
        double[] salary = new double[1000];
        double totalAssistant = 0, totalAssociate = 0, totalFull = 0, totalAll;
        int a=0,b=0,c=0;
        for (int i = 0; i < 1000; i++) {
            rank[i] = getRank();
            salary[i] = getSalary(rank[i]);
            if (rank[i] == "assistant") {
                totalAssistant += totalAssistant;
                a+=1;
            }
            if (rank[i] == "associate") {
                totalAssociate += totalAssociate;
                b+=1;
            }
            if (rank[i] == "associate") {
                totalFull += totalFull;
                c+=1;
            }
        }

        totalAll = totalAssistant + totalAssociate + totalFull;
        System.out.println("Total salary for assistant professor is "+totalAssistant);
        System.out.println("Total salary for associate professor is "+totalAssociate);
        System.out.println("Total salary for full professor is "+totalFull);
        System.out.println("Total salary for all professor is "+totalAll);
        System.out.println("Average salary for assistant professor is "+(totalAssistant/a));
        System.out.println("Average salary for associate professor is "+(totalAssociate/b));
        System.out.println("Average salary for full professor is "+(totalFull/c));
        System.out.println("Average salary for all professor is "+(((totalAssistant/a)+(totalAssociate/b)+(totalFull/c)))/3);
    }

    public static String getRank() {
        String[] ranks = { "assistant", "associate", "full" };
        return ranks[(int) (Math.random() * ranks.length)];
    }

    /** Return a randomly generated salary */
    public static double getSalary(String rank) {
        if (rank.equals("assistant"))
            return 50000 + (double) (Math.random() * 30001);
        else if (rank.equals("associate"))
            return 60000 + (double) (Math.random() * 50001);
        else
            return 75000 + (double) (Math.random() * 55001);
    }
}
