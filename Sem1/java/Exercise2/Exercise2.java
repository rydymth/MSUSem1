abstract class bird
{
  boolean canFly;
  boolean birdOfPrey;
  String name;
  String color;
  int popularityQuotient;

  bird(boolean canFly, boolean birdOfPrey, String color, int popular, String name)
  {
    this.canFly = canFly;
    this.birdOfPrey = birdOfPrey;
    this.name = name;
    this.color = color;
    this.popularityQuotient = popular;
  }
}

class pegion extends bird
{
  pegion ()
  {
    super(true, false, "grey", 100, "Pegion");
    System.out.println("Pegion object has been created");
  }
}

class hawk extends bird
{
  hawk ()
  {
    super(true, true, "brown", 50, "hawk");
    System.out.println("Hawk object has been created");
  }
}

class eagle extends bird
{
  eagle ()
  {
    super(true, true, "orchid", 100, "eagle");
    System.out.println("Eagle object has been created");
  }
}

class main {
  public static void main(String [] args)
  {
    bird a = new pegion();
    bird b = new hawk();
    bird c = new eagle();
  }
}
