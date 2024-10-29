abstract class Animal
{   public abstract void eat();
public abstract void sleep();
}

class Lion extends Animal
{ public void eat()
{ System.out.println("Lions are carnivores, cause of that eat animal based food"); }
public void sleep()
{ System.out.println("Lions sleep 20hrs in a day"); }
}

class Tiger extends Animal
{ public void eat()
{ System.out.println("Tigers are also carnivores like lions. They hunt for their food"); }
public void sleep()
{ System.out.println("Tigers sleep almost half a day"); }
}

class Deer extends Animal
{ public void eat()
{ System.out.println("Unlike carnivores deerr are homnivores and they eat only plant based food"); }
public void sleep()
{ System.out.println("Deer like animals sleeps only few hours in a day"); }
}

public class AbstractClass
{ public static void main(String[] args)
{ Lion l=new Lion();
l.eat();
l.sleep();

Tiger t=new Tiger();
t.eat();
t.sleep();

Deer d=new Deer();
d.eat();
d.sleep();
}
}
