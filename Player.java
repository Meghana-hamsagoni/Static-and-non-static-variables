public class Player {
    public static int totalPlayers= 0;
   String playerName;

public static void main (String [] args)
 {
Player obj1= new Player();
obj1.playerName="Yashwanth"; 
totalPlayers++;
Player obj2= new Player();
obj2.playerName="karthik"; 
totalPlayers++;
System.out.println("TotalPlayers :" + totalPlayers );
}
}

 
