
package Inheritance;


class Player extends Name{
    Player(String name){
      super(name);
    }
    
    void skill1(){
        System.out.println(name +" used Skill 1: Punch");
    }
    
    void skill2(){
        System.out.println(name +" used Skill 2: Kamehamewave");
    }
    
    void skill3(){
        System.out.println(name +" used Skill 3: Sharingan");
    }
}
