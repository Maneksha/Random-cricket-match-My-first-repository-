
package randomcricketmatch;

import java.util.Scanner;
import java.util.ArrayList;

class Bat
{
    void IndianPlayers()
    {
     
                System.out.println(" "+" "+"Indian Team:");

        ArrayList<String> India_batsman = new ArrayList<String>();

        
        India_batsman.add("Dhoni");
        India_batsman.add("Gautham gambhir");
        India_batsman.add("Virat kholi");
        India_batsman.add("Virendar sehwag");
        India_batsman.add("Suresh Raina");
        India_batsman.add("Yuvraj singh");
        
        for(String st : India_batsman)
        {
            System.out.println("Batsman:"+" "+st);
        }
    }
    
    
    void PakistanPlayers()
    {
        
        
                        
        System.out.println(" "+" "+"pakistan Team:");

                        
        ArrayList<String> Pakistan_batsman = new ArrayList<String>();

        
        Pakistan_batsman.add("Ahmed shehzad");
        Pakistan_batsman.add("Imran nazir");
        Pakistan_batsman.add("Mohammed hafiz");
        Pakistan_batsman.add("Nazir jamshed");
        Pakistan_batsman.add("Salman Butt");
        Pakistan_batsman.add("Umar Akmal");
        
        for(String st : Pakistan_batsman)
        {
            System.out.println("Batsman:"+" "+st);
        }
    }
    
    
}

class Bowl
{
    void IndianPlayers()
    {
        ArrayList<String> India_bowler = new ArrayList<String>();
        
        India_bowler.add("Irfan pathan");
        India_bowler.add("Yusuf pathan");     
        India_bowler.add("Harbhajan singh");
        India_bowler.add("Shree santh");   
        India_bowler.add("Vinay kumar");
        
        
        for(String st : India_bowler)
        {
            System.out.println("Bowler:"+" "+st);
        }
        
         
        System.out.println("______________________________________");

    }
    
    
    void PakistanPlayers()
    {
        ArrayList<String> Pakistan_bowler = new ArrayList<String>();
        
        Pakistan_bowler.add("Abdur rauf");
        Pakistan_bowler.add("Mohammad rasif");     
        Pakistan_bowler.add("Mohammed sami");
        Pakistan_bowler.add("Umar gul");   
        Pakistan_bowler.add("Mohammed irfan");
        
        
        for(String st : Pakistan_bowler)
        {
            System.out.println("Bowler"+" "+st);
        }
        
        
                
        System.out.println("______________________________________");

    }
    
}

class Toss
{
    void toss(String team1,String team2)
    {
       
        System.out.println("TOSS between"+" "+team1+" "+"and"+" "+team2);
        
        long toss_no= Math.round( Math.random() )  ;
        
        
        if(toss_no == 1)
             System.out.println(team1+" "+"won the toss and choose to bat");
        else
             System.out.println(team2+" "+"won the toss and choose to bat");

        

    }
}


public class RandomCricketMatch {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        
        System.out.println("Team 1:");
        String team1=sc.next();
        
        System.out.println("Team 2:");
        String team2=sc.next();
        
        System.out.println("Overs:");
        int overs=sc.nextInt();
        
        System.out.println("______________________________________");

        
        System.out.println(team1+" "+"VS"+" "+team2+" "+":"+" "+overs+" "+"Overs");
        
        System.out.println("______________________________________");
        
        Bat bat=new Bat();
        Bowl bowl=new Bowl();
        
       
        bat.IndianPlayers();
        bowl.IndianPlayers();
        
        bat.PakistanPlayers();
        bowl.PakistanPlayers();
        
        
         Toss tossing=new Toss();
        tossing.toss(team1,team2);
       
        
        
        
        

        
        
    }
    
}
