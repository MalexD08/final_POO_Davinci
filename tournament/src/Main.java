import tournament.Llave;
import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Team teamA = new Team("Equipo A", new String[]{"Messi", "DiMaria", "Isabel", "Isaac"});

        Team teamB = new Team("Equipos B", new String[]{"Tomas", "Jogher", "Paco", "Franco"});

        Team teamC = new Team("Equipo C", new String[]{"Almada", "Dybala", "DePaul", "MacAllister"});

        Team teamD = new Team("Equipo D", new String[]{"Pepe", "Lucio", "Mario", "Luigi"});

        Team teamE = new Team("Equipo E", new String[]{"Ana", "Carlos", "Sofia", "Javier", "Javier", "Mariana"});

        Team teamF = new Team("Equipo F", new String[]{"Laura", "Diego", "Valentina", "Alejandro", "Gabriela"});

        Team teamG = new Team ("Equipo G", new String[]{"Juancito","Roman","Cordoba","Clemente","Diaz"});

        Team teamH = new Team ("Equipo H", new String[]{"Juancito","Roman","Cordoba","Clemente","Diaz"});


        /*String [] playersG = {"Juancito","Roman","Cordoba","Clemente","Diaz"};
        Team teamG = new Team("Equipo G", playersG);

        String [] playersH = {"Aymar","Palermo","Cruz","Nacho","Ruben"};
        Team teamH = new Team("Equipo H", playersH);*/

       teamA.showMembers();
      
       teamB.showMembers();

        //Rearrange games based on new Match structure (partidosCuartos)

        //primerPartido.makeLocalGoal(1);
        //primerPartido.makeVisitantGoal(2);
        //primerPartido.makeVisitantGoal(3);
        //System.out.println(primerPartido.getMatchStatus());

        //segundoPartido.makeLocalGoal(0);
        //System.out.println(segundoPartido.getMatchStatus());

        //tercerPartido.makeVisitantGoal(1);
        //tercerPartido.makeVisitantGoal(2);
        //tercerPartido.makeLocalGoal(0);
        //tercerPartido.makeLocalGoal(3);
        //tercerPartido.makeLocalGoal(2);
        //System.out.println(tercerPartido.getMatchStatus());

        //cuartoPartido.makeLocalGoal(2);
        //cuartoPartido.makeVisitantGoal(0);
        //cuartoPartido.makeVisitantGoal(1);
        //cuartoPartido.makeLocalGoal(3);
        //System.out.println(cuartoPartido.getMatchStatus());

        Llave cuartosFinal = new Llave();

        ArrayList<Team> equiposCuarto= new ArrayList<Team>();
        equiposCuarto.add(teamA);
        equiposCuarto.add(teamB);
        equiposCuarto.add(teamC);
        equiposCuarto.add(teamD);
        equiposCuarto.add(teamE);
        equiposCuarto.add(teamF);
        equiposCuarto.add(teamG);
        equiposCuarto.add(teamH);


        ArrayList<Team> getEquiposQueAvanzan= new ArrayList<Team>();
        ArrayList<Match> partidosCuarto = new ArrayList<Match>();
        partidosCuarto.add(new Match(equiposCuarto.get(0), equiposCuarto.get(1)));
        partidosCuarto.add(new Match(equiposCuarto.get(2), equiposCuarto.get(3)));
        partidosCuarto.add(new Match(equiposCuarto.get(4), equiposCuarto.get(5)));
        partidosCuarto.add(new Match(equiposCuarto.get(6), equiposCuarto.get(7)));



        partidosCuarto.get(0).makeLocalGoal(1);
        partidosCuarto.get(0).makeVisitantGoal(2);
        partidosCuarto.get(0).makeVisitantGoal(3);


        partidosCuarto.get(1).makeLocalGoal(0);
        System.out.println(partidosCuarto.get(1).getMatchStatus());

        partidosCuarto.get(2).makeVisitantGoal(1);
        partidosCuarto.get(2).makeVisitantGoal(2);
        partidosCuarto.get(2).makeLocalGoal(0);
        partidosCuarto.get(2).makeLocalGoal(3);
        partidosCuarto.get(2).makeLocalGoal(2);
        System.out.println(partidosCuarto.get(2).getMatchStatus());

        partidosCuarto.get(3).makeLocalGoal(2);
        partidosCuarto.get(3).makeVisitantGoal(0);
        partidosCuarto.get(3).makeVisitantGoal(1);
        partidosCuarto.get(3).makeLocalGoal(3);
        System.out.println(partidosCuarto.get(3).getMatchStatus());

    }


}