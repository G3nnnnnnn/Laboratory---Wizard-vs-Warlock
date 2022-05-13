public class Wizard extends Character{
        Wizard (String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }

    // Wizard Gen Supernatural Powers
    public void ringofOrder(Character enemyCharacter){
        int damagePoints = 55;
        int manaCost = 45;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with ringofOrder (Damage - 55)");
        damageTarget(enemyCharacter, damagePoints);
    }
    
    public void wrathSunction(Character enemyCharacter){
        int damagePoints = 150;
        int manaCost = 45;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with wrathSunction (Damage - 150)");
        damageTarget(enemyCharacter, damagePoints);
    }
   
}

