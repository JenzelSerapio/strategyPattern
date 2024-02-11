public class CharacterDemo {
    public static void main(String[] args) {
        Character knight = new Character(new Knight(), new Knight());
        Character wizard = new Character(new Wizard(), new Wizard());
        Character archer = new Character(new Archer(), new Archer());

        knight.attack();
        knight.defend();

        System.out.println();

        wizard.attack();
        wizard.defend();

        System.out.println();

        archer.attack();
        archer.defend();
    }
}