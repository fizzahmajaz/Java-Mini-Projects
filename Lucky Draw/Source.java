import java.util.Scanner;
import java.util.Random;

public class LuckyDrawSystem{
    public static void main(String args[]){
        //Take the number of participents
        //Store the name of participents
        //Ask for the count of winners
        //Create var to store the randomly generate winners
        //Randomly generate winners
        //Use string builder to display that
        //Print the results

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Take the number of participents
        System.out.println("Enter the number of participents you want :");
        int countParticipents = sc.nextInt();
        sc.nextLine();

        //Make an array to store the value
        String [] Participents = new String [countParticipents];
        
        //Run a loop to store the participents name
        for (int i = 0; i<countParticipents; i ++){

            System.out.println("Enter the name of participent " + (i + 1) + " :");
            Participents[i] = sc.nextLine();
        }

        //How many winners do they want

        System.out.println("How many winner do you want? :");
        int countWinners = sc.nextInt();

        if (countWinners > countParticipents){
            System.out.println("You are exceding the limit try again");
            return;
        }

        //Store the winners initially consider it 0

        int winners = 0;
        StringBuilder display = new StringBuilder();

        //make an array to check either its selected before or not
        boolean[] selected = new boolean[countParticipents];

        //Run a loop to generate the winners

        while (winners < countWinners){
             int generate = random.nextInt(countParticipents);

            if (!selected[generate]){
                selected[generate] = true;

                
            display.append("Winner ").append(winners + 1).append(" is ").append(Participents[generate]).append("\n");

            winners++;
            }
           

        }

        System.out.println("------------------Winners---------------");
        System.out.println(display);




        
    }
}
