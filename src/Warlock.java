public class Warlock  extends Character{
    Warlock(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }
    // Warlock Mari  Supernatunal powers
    public void divineJudgment(Character enemyCharacter) {
        int damagePoints = 80;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with  divineJudgment (Damage - 80)");
        damageTarget(enemyCharacter, damagePoints);
    }

    public void lightingBomb(Character enemyCharacter) {
        int damagePoints = 50;
        int manaCost = 20;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with lightingBomb(Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }

    // Health Point Regen of Mari
    public void Recover(){
        int heal=80;
        int manaRegen=60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }
    
   

}
