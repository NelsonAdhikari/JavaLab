package JavaLabPractical;

class Wood{
void create(){
System.out.println("Wood is created..");
}
}

class Foam extends Wood{
void insert(){
System.out.println("Foam inserted..");
}
}

class Duster extends Wood{
void apply(){
System.out.println("Wood applied..");
}
}

public class qn38{
public static void main(String[] args){
Duster d = new Duster();
d.create();
d.apply();
//d.insert();//compile time error
}
}

	
