package cards;
import java.util.Random;

public class Cards {
    public int id;
    public String name;
    public String description;
    public int hp;
    public int attack;
    public int speed;
    public String pack;
    // constructor =  metodo executado imediatamente após a criação do objeto
    public Cards(String name, String description, int hp, int attack, int speed, int id){
      this.name = name;
      this.description = description;
      this.hp = hp;
      this.attack = attack;
      this.speed = speed;
      this.id = id;
      if (id <= 40){
          pack = "First edition";
        }
      else{pack = "The Wolf pack";}
      imprimirCard();
    };
    private void imprimirCard(){
        System.out.format(
                "Nome: %s, descrição: %s, hp: %d, attack: %d, speed: %d, id: %d pack: %s \n", name, description,
                hp, attack, speed, id, pack);
    }


    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.name = name;
    }
    public void setHp(String hp){
        this.name = name;
    }
    public void setAttack(String attack){
        this.name = name;
    }
    public void setSpeed(String speed){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
