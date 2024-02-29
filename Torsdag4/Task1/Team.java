class Team{
	
private String teamName;
private int teamRank;
private String playerName;


public Team(String teamName){

	this.teamName = teamName;
}

public String getTeamName(){
		return this.teamName;
	}

	public int getTeamRank(){
		return this.teamRank;
	}

	public void setTeamName(String teamName){
		this.teamName = teamName;

	}

	public void setTeamRank(int teamRank){
	this.teamRank = teamRank;
}

		@Override
	public String toString(){
		return "Hold: " + teamName + ": Rang: " + teamRank;
}
}