public class DiceFactory
{
    public DiceFactory()
    {
    }

    public Integer makeDie(int die)
    {
        Integer value = null;
        for (Integer i = 1; i <= die; i++)
        {
            value = i;
            System.out.print(value+"\t");
        }
        //System.out.println(value);
        return value;
    }
    public static void main(String[] args)
    {
        Die die3 = new Die(4,new int[]{1,1,1,2});
        die3.roll();
        die3.setProbabilities(new int[]{1,1,-1,2});
        System.out.println();
        Die die20 = new Die(20);
        die20.roll();
        System.out.println(die3);
        System.out.println("Make die");
        Integer die2 = new DiceFactory().makeDie(6);
    }
}
