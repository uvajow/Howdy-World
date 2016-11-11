//Morgan Jones
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
public class Reflex
{
    public static void main(String[] args) 
        {
        double num;
        double start = 0;
        double stop = 0;
        int repeat = 0;
        String choice = "";
        int c = 0;
        int dog = 0;
        int tri = 1;
        //inheritance right?
        intro r = new intro();
        r.intro();
        
       //the reflex action part of the program to repeat six times
        do
        {
        double[] times = new double[6];
        while(repeat < 6)
        {
            Random rand = new Random();
            int n = rand.nextInt(6)+2;
            
            
            System.out.println(" \n Enter P for Play");
            System.out.println(" Enter D for Directions");
            System.out.println(" Enter C for Cast of Characters");
            System.out.println(" Enter M for Magic");
            System.out.println(" Enter Q for Quit");
            System.out.println(" \nThis is turn number " + tri + "\n");
            System.out.println(" \nSelect a menu option and press enter to continue...");
            Scanner keyboard = new Scanner(System.in);
            choice = keyboard.nextLine();
            if (choice.equalsIgnoreCase("D"))
        {
           r.intro();
                       System.out.println(" \n Enter P for Play");
           System.out.println(" Enter D for Directions");
            System.out.println(" Enter C for Cast of Characters");
            System.out.println(" Enter M for Magic");
            System.out.println(" Enter Q for Quit");
            System.out.println(" \nThis is turn number " + tri + "\n");
            System.out.println(" \nSelect a menu option and press enter to continue...");
           keyboard.nextLine();
        }
         if (choice.equalsIgnoreCase("Q"))
        {
           
           System.out.println("Program Terminated");
           keyboard.nextLine(); 
           keyboard.nextLine();
        }
         if (choice.equalsIgnoreCase("M"))
        {
           
           System.out.println(" Sorry, magic pending, \"better luck next time!\"");
            System.out.println(" \nSelect a menu option and press enter to continue...");
           keyboard.nextLine();
        }
        if (choice.equalsIgnoreCase("C"))
        {
          
           System.out.println(" \n\n\nTHE CAST OF ASCII CHARACTERS");
            System.out.println(" Enter A for Ant Eater");
            System.out.println(" Enter C for Cards");
            System.out.println(" Enter D for Dove");
            System.out.println(" Enter E for Epic Fail");
            System.out.println(" Enter M for Mona_Lisa");
            System.out.println(" Enter P for Painter");
            
            /*Scanner inputAnimal = new Scanner(System.in);
            inputAnimal = inputAnimal.nextLine();
            Scanner keyboard = new Scanner(System.in);
            choice = keyboard.nextLine();
            */
            
            System.out.println(" \nThis is turn number " + tri + "\n");
            System.out.println(" \nSelect a menu option and press enter to continue...");
           keyboard.nextLine();
        }
        //keyboard.nextLine();
            // try to put in here the way to access quit redo and start from the menu
            //if(keyboard.nextLine=q)
            //{
            //    return q;
            //}
            System.out.println("wait for the GO!!!");
            /*try
                {
                Thread.sleep(333);
                System.out.println("wait for it...");
            }
            catch(InterruptedException ex)
            {
            }
            //777 milliseconds are multiplied by a random number between 1 and 6 making the computer delay that long
            */try 
               {
                Thread.sleep(999 * n);
            }
            catch (InterruptedException ex)
               {
            }
            //the first thing that the program does after having slept a random amount of time is display "GO!"
            System.out.println("\"GO!!! Press Enter as Quick as You Can!!! Now!!!\"");
            //then the program timer starts right after the GO!, making a timestamp
            double appTimestampStart = System.currentTimeMillis();
            double milliStart = System.currentTimeMillis();
            Scanner stopper = new Scanner(System.in);
            //the "timer" is now counting, continuing to remain active until the next key-strike
            keyboard.nextLine();
            //this sets the next input to be a keryboard strike, the "enter key" works
            double milliEnd = System.currentTimeMillis();
            
            
            //the milliEnd is another snapshot of the current time at the moment of the keyboard strike
            double milliTime = milliEnd - milliStart;
            //the first timestamp is subtracted from the second timestamp
            times[c] = milliTime;
            //here the array times[c] is assigned the milliTime value which is represented in milliseconds
            System.out.println("Good Job!");
            c++;
            if (milliTime <= 50)
            {
             epic_fail q = new epic_fail();
             q.epic_fail();
            }
            else if (milliTime > 352)
            {
             mona_lisa q = new mona_lisa();
             q.mona_lisa();
            }
            else if (milliTime > 349)
            {
             just_applause q = new just_applause();
             q.just_applause();
            }
            else if (milliTime > 346)
            {
             happy_face q = new happy_face();
             q.happy_face();
              }
            else if (milliTime > 343)
            {
             kangaroo q = new kangaroo();
             q.kangaroo();
              }
            else if (milliTime > 340)
            {
             chicken q = new chicken();
             q.chicken();             
              }
            else if (milliTime > 337)
            {
             wolf q = new wolf();
             q.wolf();
            }
                else if (milliTime > 334)
            {
             dove q = new dove();
             q.dove();             
            }
                else if (milliTime > 331)
            {
             applause_man q = new applause_man();
             q.applause_man();             
            }
            else if (milliTime > 328)
            {
             mufassa q = new mufassa();
             q.mufassa();         
            }
             else if(milliTime > 325)
            {
             painter q = new painter();
             q.painter();   
            }
            else if (milliTime > 322)
            {
             cards q = new cards();
             q.cards();
            }
            else if (milliTime > 319)
            {
             mortal_kombat q = new mortal_kombat();
             q.mortal_kombat();          
            }
            else if (milliTime > 255)
            {
             toilet_tissue q = new toilet_tissue();
             q.toilet_tissue();
            }
            else if (milliTime > 222)
            {
             ant_eater q = new ant_eater();
             q.ant_eater();
            }
            else if (milliTime > 197)
            {
             eagle q = new eagle();
             q.eagle();
            }
            else if (milliTime <= 197 && milliTime > 50)
            {
             heels q = new heels();
             q.heels();
            }
            //static void images() Trying to call the images class to run here
            //{ this is where i need some help figuring out how to call from here
            //if the time is less than 50 milliseconds(which is indicative of having clicked too early) then dog catches the arrayElement
            // and manually assigns the time to be 222 milliseconds
            System.out.println(" That took you: " + milliTime + " milliseconds!");
            if (times[dog]<50)
            {
                times[dog]=275;
            }
            //these are the index counters for dog and repeat (( perhaps times[repeat] would also work? ))
            repeat++;
            dog++;
            tri++;
            
        
        }
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        
        
        double slowest = times[0];
        for (int o=1; o < times.length; o++)
        {
            if (times[o] > slowest)
            {
                slowest = times[o];
            }
       }    
        
           
           System.out.println(" Your slowest time was: " + slowest + "  milliseconds");
        System.out.println(" ");
        Double fastest = times [0];
        for (int p=1; p < times.length; p++)
           {
            if (times[p] < fastest)
                {
                fastest = times[p];
                }
           }
        System.out.println(" Your fastest time was: " + fastest + "  milliseconds");
        System.out.println(" ");
        double total = 0;
        for (double element : times)
          {
           total += element;
          }
        double average = 0;
        if (times.length>0)
            {
            average = total / times.length;
            }
        System.out.println(" Your average time was: " + average + "  milliseconds");
        System.out.println(" ");
        System.out.println(" These are your reaction times from each try: ");
        System.out.println(" |1st try|2nd try|3rd try|4th try|5th try|6th try|");
        //These following for loops are strait out of the text book, the examples to manipulate the advanced for loop to arrange, and sort arrays.
        for (int i=0; i < times.length; i++)
        {
             if (i>=0)
               {
                System.out.print(" | ");
                System.out.print(times[i]);
               }
            }   
        System.out.print(" | ");
        System.out.println(" ");     
         //first represents times[0] while second represents times[1] as the loop iterates 
        //first and second increase by one respectively and simoultaneously
        int first = 0;
        int second = 1;
        //roa defines how many times  the while loop is supposed to run, when i did not 
        //specify how many times for the while loop to iterate i would get "the most common array error" a bounds error
        int roa = 1;
        System.out.println(" ");
        System.out.println(" These response times point out whether you sped up or slowed down");
        while (roa < 6)
        {
            if (times[first]<times[second])
            {
                System.out.print(times[first]);
                System.out.print(" down>");
            }
            else if(times[first]>times[second])
            {
                System.out.print(times[first]);
                System.out.print(" up>");
            }
            else if(times[first]==times[second])
            {
                System.out.print(times[first]);
                System.out.print (" same>");
            }
            //this was tricky for me, I only run the while loop above seven times on the 8 element array because the eighth element
            //cannot be compared to a ninth nonexistent element, there is not going to be a "faster or slower" after times[7](which is actually
            //the seventh element.. looking at this again I realize i may not entirely comprehend how i got it to work yet.. yay tho it works. for now.
            //there may an empty array element or two that isnt being filled or displayed... idk.
            if(roa==5)
            {
                System.out.print(times[5]);
            }
            roa++;
            first++;
            second++;
        }
        System.out.println(" ");
        System.out.println(" ");
        // here i want to make a loop that subtracts the first from the second, the second from the third, the third from the fourth
        // and displays the information so that you can see whether you are getting faster or slower
        // bar graph!!
        System.out.print(" 1st Try ");
        while(fastest<times[0])
        {
            System.out.print(":");
            times[0]--;
            times[0]--;
            times[0]--;
            times[0]--;
            times[0]--;
                                }
        System.out.print("|");
        System.out.println("");
        System.out.print(" 2nd Try ");
        while(fastest<times[1])
        {
            System.out.print(":");
            times[1]--;
            times[1]--;
            times[1]--;
            times[1]--;
            times[1]--;
                               }
        System.out.print("|");
        System.out.println("");
        System.out.print(" 3rd Try ");
        while(fastest<times[2])
        {
            System.out.print(":");
            times[2]--;
            times[2]--;
            times[2]--;
            times[2]--;
            times[2]--;
                                }
        System.out.print("|");
        System.out.println("");
        System.out.print(" 4th Try ");
        while(fastest<times[3])
        {
            System.out.print(":");
            times[3]--;
            times[3]--;
            times[3]--;
            times[3]--;
            times[3]--;
                                }
        System.out.print("|");
        System.out.println("");
        System.out.print(" 5th Try ");
        while(fastest<times[4])
        {
            System.out.print(":");
            times[4]--;
            times[4]--;
            times[4]--;
            times[4]--;
            times[4]--;
                                }
        System.out.print("|");
        System.out.println("");
        System.out.print(" 6th Try ");
        while(fastest<times[5])
        {
            System.out.print(":");
            times[5]--;
            times[5]--;
            times[5]--;
            times[5]--;
            times[5]--;
                                }
        System.out.print("|\n");
        /*
        System.out.println("");
        System.out.print(" 7th Try ");
        while(fastest<times[6])
        {
            System.out.print(":");
            times[6]--;
            times[6]--;
            times[6]--;
            times[6]--;
            times[6]--;
                                }
        System.out.print("|");
        System.out.println("");
        System.out.print(" 8th Try ");
        while(fastest<times[7])
        {
            System.out.print(":");
            times[7]--;
            times[7]--;
            times[7]--;
            times[7]--;
            times[7]--;
                                }
        System.out.print("|");
        // then that time can be taken into account and you can see whether overall you were getting faster or slower by
        // combinging the negative and positive numbers and seeing whether you earned a negative score or positive score
        // a negative score meaning that overall you got faster, a positive score meaning that overall you were getting slower
        System.out.println(" ");
        // aiming at a rectangle started here to build a line graph onto
        */
        repeat = 0;
        c = 0;
        dog = 0;
        roa=1;
        first=0;
        second=1;
        tri=1;
                    System.out.println(" \n Enter P for Play");
        System.out.println(" Enter D for Directions");
            System.out.println(" Enter C for Cast of Characters");
            System.out.println(" Enter M for Magic");
            System.out.println(" Enter Q for Quit");
            System.out.println(" \nThis is turn number " + tri + "\n");
            System.out.println(" \nSelect a menu option and press enter to continue...");
        Scanner endWhile = new Scanner(System.in);
        choice = endWhile.nextLine();
        //writeOutputAction("times", times[]);
        int attempt = 0;
       /*if (choice.equalsIgnoreCase("P")) 
       {
           PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
writer.println("The first line");
writer.println("The second line");
writer.close();
        }
       */
       /*{
          PrintWriter writer = new PrintWriter("reflex results.txt"); 
           writer.println();
           System.out.println(" |1st try|2nd try|3rd try|4th try|5th try|6th try|");
        //These following for loops are strait out of the text book, the examples to manipulate the advanced for loop to arrange, and sort arrays.
        for (int i=0; i < times.length; i++)
        {
             if (i>=0)
               {
                System.out.print(" | ");
                System.out.print(times[i]);
               }
            }  
           
           writer.close();
           attempt++;
        }
        */
        if (choice.equalsIgnoreCase("D"))
        {
           r.intro();
                       System.out.println(" \n Enter P for Play");
           System.out.println(" Enter D for Directions");
            System.out.println(" Enter C for Cast of Characters");
            System.out.println(" Enter M for Magic"); 
            System.out.println(" Enter Q for Quit");
            System.out.println(" \nThis is turn number " + tri + "\n");
            System.out.println(" \nSelect a menu option and press enter to continue...");
           endWhile.nextLine();
        }
         if (choice.equalsIgnoreCase("Q"))
        {
           
           System.out.println("Program Terminated");
           endWhile.nextLine(); 
           endWhile.nextLine();
        }
         if (choice.equalsIgnoreCase("M"))
        {
           
           System.out.println(" \nSorry, magic pending, \"better luck next time!\"\n\n");
                       System.out.println(" \n Enter P for Play");System.out.println(" \n Enter D for Directions");
            System.out.println(" Enter C for Cast of Characters");
            System.out.println(" Enter M for Magic");
            System.out.println(" Enter S for Start Over");
            System.out.println(" Enter Q for Quit");
            System.out.println(" \nThis is turn number " + tri + "\n");
            System.out.println(" \nPress enter to continue...");
            System.out.println(" \nSelect a menu option and press enter to continue...");
           endWhile.nextLine();
        }
        /*if (choice.equalsIgnoreCase("P"))
        {
           writeOutputAction(String filename)
           PrintWriter TXToutput = new PrintWriter(new File(filename));
        
        for (String name : names) 
        {
            TXToutput.println(times);
        }
        
        TXToutput.close();
        }*/
    }
        while(choice.equalsIgnoreCase("S")||choice.equalsIgnoreCase("D"));
        System.out.println(" Program Terminated for real");
    }
    
}


       
         