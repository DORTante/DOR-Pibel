package dor;

public final class N {
	
	private final World dabendorf;
	private Antagonist napoleon;
	private final Answer answerToUltimateQuestion;
	private Thought idea;
	private int appetite;//0 to 100
	private Cake[] cakes = {new Cake("ApplePie"),new Cake("Cheesecake"),new Cake
       ("Sachercake"),new Cake("FrankfurtCrownCake"),new Cake("RainbowCake")};
	
	public N(int appetite) {
		this.appetite = appetite;
		dabendorf = new World();
		napoleon = new Antagonist("Napoléon");
		answerToUltimateQuestion = new Answer(42);
		dabendorf.guard();
		napoleon.askForPermission();
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			eatCake(cakes[i%cakes.length]);
		}
		clearThoughts(idea);
	}
	
	public boolean playChess(int levelOfDifficulty, boolean lostQueen) {
		//return win
		if(appetite < 50) {
			if(levelOfDifficulty > 90 || (levelOfDifficulty > 50 && !lostQueen)) {
				return true;
			} else {
				return Math.random()>0.5 ? true : false;
			}
		} else {
			return false;
		}
	}
	public boolean willTaskBeDone(Task t) {
		return Math.random()>0.9 ? true : false;
	}
	public void eatCake(Cake k) {
		k.eat();
		appetite--;
		k.askForMore(true);
	}
	public String getAnswer() {
		return "The answer is "+answerToUltimateQuestion;
	}
	public void clearThoughts(Thought idea) {
		idea.slowsort();
		idea.garbageCollector();
	}
}