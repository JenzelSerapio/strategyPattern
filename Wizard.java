public class Wizard implements AttackStrategy, DefenseStrategy {
    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }

    @Override
    public void defend() {
        System.out.println("Wizard creates a magic barrier for defense!");
    }
}
