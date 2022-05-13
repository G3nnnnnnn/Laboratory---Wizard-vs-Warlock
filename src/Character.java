public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */

    Character(){
        System.out.println("Non Parameterized Constructor");
    }

    Character(String name, int newLevel, int newHealth, int newMana){
        characterName = name;
        level = newLevel;
        manaPoints = newMana;
        healthPoints = newHealth;
    }

     /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */

    public void nameDisplay(){
        System.out.println("Character Initialized "+ characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints){


        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);

        /**
        * Prompt Character is defeated if HP falls below 0
        * eg. Character Shaman defeated.
        * */
        
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("\nCharacter "+ enemyCharacter.characterName +" Defeated");
        }
    }

    public void levelUp(){
        int levelUp = 10;
        level += levelUp;

        System.out.println(characterName +" Leveled up to Level "+ level);
    }

}
