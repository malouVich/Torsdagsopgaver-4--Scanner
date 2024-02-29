class Main{
	


	public static void main(String[] args) {


		Team t1 = new Team("Lynx Legends");
		Team t2 = new Team("Thunderhawks");
		Team t3 = new Team("Phoenix Fury");
		Team t4 = new Team("Avalanche Warriors");
		Team t5 = new Team("Crimson Crushers");

		t1.setTeamRank(3);
		t2.setTeamRank(1);
		t3.setTeamRank(5);
		t4.setTeamRank(7);
		t5.setTeamRank(17);

		

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		


	}
}