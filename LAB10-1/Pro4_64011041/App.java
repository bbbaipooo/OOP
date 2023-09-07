package Pro4_64011041;

import java.io.*;

public class App {
    public static void main(String[] args) {
        // Create File object
		File file1 = new File("Salary.txt");
        double totalAssistant = 0, totalAssociate = 0, totalFull = 0, totalAll;
        int a=0,b=0,c=0;

		// Check if file exists 
		if (file1.exists()) {
			System.out.println("File " + file1.getName() + " already exists");
			System.exit(0);
		}
		String rank = "";
		double salary;
        //try (
		//	// Create output file
		//	PrintWriter output = new PrintWriter(file1);
		//) {
		//	// Save data to file
		//	for (int i = 1; i <= 1000; i++) {
		//		output.print("FirstName" + i + " LastName" + i);
		//		rank = getRank();
		//		salary = getSalary(rank);
		//		output.printf(" " + rank + " %.2f\n", salary);
         //       if (rank == "assistant") {
         //           totalAssistant += totalAssistant;
        //            a+=1;
        //        }
        //        else if (rank == "associate") {
        //            totalAssociate += totalAssociate;
         //           b+=1;
         //       }
        //        else if (rank == "associate") {
          //          totalFull += totalFull;
          //          c+=1;
         //       }
		//	}
		//}
		

        //totalAll = totalAssistant + totalAssociate + totalFull;
        System.out.println("Total salary for assistant professor is "+totalAssistant);
        System.out.println("Total salary for associate professor is "+totalAssociate);
        System.out.println("Total salary for full professor is "+totalFull);
        //System.out.println("Total salary for all professor is "+totalAll);
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