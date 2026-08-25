package model;

import java.util.ArrayList;

public class Team {
    private int idTeam;
    private String nameTeam;
    private ArrayList<Gamer> gamerList; // Composición: una lista de objetos Gamer
    private Gamer leader;             // Asociación: un objeto Gamer actúa como líder
    private long totalScore;

    public Team() {
        this.idTeam = 0;
        this.nameTeam = "Team Default";
        this.gamerList = new ArrayList<>();
        this.leader = new Gamer();
        this.totalScore = 0;
    }

    public Team(int idTeam, String nameTeam, ArrayList<Gamer> gamerList, Gamer leader, long totalScore) {
        this.idTeam = idTeam;
        this.nameTeam = nameTeam;
        this.gamerList = gamerList;
        this.leader = leader;
        this.totalScore = totalScore;
    }

    
    public int getIdTeam() { return idTeam; }
    public void setIdTeam(int idTeam) { this.idTeam = idTeam; }

    public String getNameTeam() { return nameTeam; }
    public void setNameTeam(String nameTeam) { this.nameTeam = nameTeam; }

    public ArrayList<Gamer> getGamerList() { return gamerList; }
    public void setGamerList(ArrayList<Gamer> gamerList) { this.gamerList = gamerList; }

    public Gamer getLeader() { return leader; }
    public void setLeader(Gamer leader) { this.leader = leader; }

    public long getTotalScore() { return totalScore; }
    public void setTotalScore(long totalScore) { this.totalScore = totalScore; }
}
