package skunk.domain;

public class PredictableDie
{
	private int[] theRolls;
	private int nextInt;
	private int lastRoll;

	public PredictableDie()
	{

	}

	public PredictableDie(int[] is)
	{
		this.theRolls = is;
		this.nextInt = 0;
	}

	public void roll()
	{
		this.lastRoll = theRolls[this.nextInt];
		if (this.nextInt == 2)
		{
			this.nextInt = 0;
		}
		else
		{
			this.nextInt++;
		}

	}

	public int getLastRoll()
	{

		return this.lastRoll;
	}
}
