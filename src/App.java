public class App {
    public static void main(String[] args) throws Exception {
         System.out.println("Wizards and Warlocks\n");
         /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         * 
         * 
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         * 
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         * 
         */
       Wizard Gen = new Wizard("Gen", 15, 250, 200);
       Warlock Mari = new Warlock("Mari", 10, 150, 150);

        


         /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         * 
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */
        Gen.ringofOrder(Mari);
        System.out.println("\n" + Mari.characterName);
        System.out.println("Health Point left is: " + Mari.healthPoints);
        System.out.println("Mana Points left is: " + Mari.manaPoints);
        System.out.println(" ");

        Mari.divineJudgment(Gen);
        System.out.println("\n" + Gen.characterName);
        System.out.println("Health Point left is: " + Gen.healthPoints);
        System.out.println("Mana Points left is: " + Gen.manaPoints);
        System.out.println(" ");

        Gen.ringofOrder(Mari);
        System.out.println("\n" + Mari.characterName);
        System.out.println("Health Point left is: " + Mari.healthPoints);
        System.out.println("Mana Points left is: " + Mari.manaPoints);
        System.out.println(" ");

        Mari.lightingBomb(Gen);
        System.out.println("\n" + Gen.characterName);
        System.out.println("Health Point left is: " + Gen.healthPoints);
        System.out.println("Mana Points left is: " + Gen.manaPoints);
        System.out.println(" ");

        Mari.Recover();
        System.out.println(Mari.characterName + " has total HP of " + Mari.healthPoints+ " and total of Mana is " + Mari.manaPoints);
        System.out.println(" ");
        System.out.println(Mari.characterName);
        System.out.println("HP left is " + Mari.healthPoints);
        System.out.println("Mana left is " + Mari.manaPoints);
        System.out.println(" ");

        Mari.divineJudgment(Gen);
        System.out.println("\n" + Gen.characterName);
        System.out.println("Health Point left is: " + Gen.healthPoints);
        System.out.println("Mana Points left is: " + Gen.manaPoints);
        System.out.println(" ");
        
        Gen.wrathSunction(Mari);
        System.out.println("\n" + Mari.characterName);
        System.out.println("Health Point left is: " + Mari.healthPoints);
        System.out.println("Mana Points left is: " + Mari.manaPoints);
        System.out.println(" ");

        
        Gen.levelUp();


    }

    }
