public class Die
{
    int sides;
    int[] probabilities;
    //private int value;
    public Die(int sides, int[] probabilities)
    {
        this.sides = sides;
        this.probabilities = probabilities;
    }

    public Die(int i)
    {
        sides = i;
    }

    public void setSides(int sides)
    {
        this.sides = sides;
    }

    public void roll()
    {
        int value = 0;
        for (int i = 1; i <= sides; i++)
        {
            value = i;
            System.out.print(value+"\t");
        }
    }

    public void setProbabilities(int[] probabilities)
    {
        this.probabilities = probabilities;
        for (int j = 1; j < probabilities.length; j++)
        {
            if (probabilities[j] < 0)
            {
                System.out.print("\n "+"negative numbers not allowed\n");
                System.out.println("probability sum must be greater than 0");
            }
        }
    }
}
