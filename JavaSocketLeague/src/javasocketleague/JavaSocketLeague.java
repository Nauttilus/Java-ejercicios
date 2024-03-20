
package javasocketleague;


public class JavaSocketLeague {


    public static void main(String[] args) {
        Team t1 = new Team();
        Team t2 = new Team();
        Player p1team1 = new Player();//creamos una nueva instancia para el archivo de Player
        Player p2team1 = new Player();    
   
        //nombres de los equipos
        t1.teamName = "azules";
        t2.teamName = "blancos"; //es del archivo de Team 
        
        //poner jugadores para el equipo 1
        p1team1.playerName = "Luis"; //player name es el string dentro del Player
        p2team1.playerName = "Arturo";
        
        //jugadores del equipo 2
         t2.playerArray = new Player[2]; //creamos el array con la cantidad de jugadores
         
                 t2.playerArray[0] = new Player(); //utilizamos la primera posicion del array
                 t2.playerArray[0].playerName = "Dante"; // dentro del array indicamos que es el string de Player y le ponemos el nombre
         
                t2.playerArray[1] = new Player();
                 t2.playerArray[1].playerName = "Goku";
             
        
        Player[] thePlayer1 = {p1team1,p2team1 };
        t1.playerArray = thePlayer1;
        
        
//        for (Player thePlayer: t1.playerArray){
//            System.out.println(thePlayer.playerName);
//        }
//            for (Player thePlayer: t2.playerArray){
//            System.out.println(thePlayer.playerName);
//        }
        
            
            Game curreGame = new Game();
            curreGame.homeTeam = t1;
            curreGame.awayTeam= t2;
            
            Goal goall = new Goal();
            goall.thePlayer =curreGame.homeTeam.playerArray[1];
            goall.theTeam = curreGame.homeTeam;
            goall.theTime=55;
            Goal[] theGoals ={goall};
            curreGame.goals = theGoals;
            System.out.println("goal scored after "  + curreGame.goals[0].theTime + " mins by " + 
                    curreGame.goals[0].thePlayer.playerName + " of " + curreGame.goals[0].theTeam.teamName );
            
            
            
            
    }
    
}
