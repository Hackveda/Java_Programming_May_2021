package Class_object;

class Encapsulation_demo
{
	// access specifier
	private int score = 0;

	public int getScore() 
	{
		return score;
	}

	public void addRuns(int score) 
	{
		
		//this keyword is used to point current object of class/method
		this.score = this.score + score;
	}

	public void six() 
	{
		addRuns(6);
	}

	public void four()
	{
		addRuns(4);
	}

	public void single() 
	{
		addRuns(1);
	}

	public void printScore() 
	{
		System.out.println("Score : " + score);
	}

public static void main(String[] args) 
{
	Encapsulation_demo scorer = new Encapsulation_demo();
		scorer.four();
		scorer.four();
		scorer.single();
		scorer.six();
		scorer.six();
		scorer.six();
		//scorer.addRuns(1)
		scorer.printScore();
	}
}