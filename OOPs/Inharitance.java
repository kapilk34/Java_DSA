package OOPs;

class Pokemon{
    int power;
    String type;
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }
    Pokemon(){}
    void print(){
        System.out.println(power + " " + type);
    }
}

class LegendaryPokemon extends Pokemon{ //child class
    String ability;
}

class StrongPokemon extends Pokemon{  //child class
    int speed;
}

class GodPokemon extends LegendaryPokemon{  //grand child class
    char tag;
}

public class Inharitance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        Pokemon pikachu = new Pokemon();
        pikachu.power = 100;
        GodPokemon dialga = new GodPokemon();
        dialga.type = "Great";
    }
}
