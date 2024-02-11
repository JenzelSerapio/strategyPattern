public class Archer implements AttackStrategy, DefenseStrategy {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }

    @Override
    public void defend() {
        System.out.println("Archer dodges to avoid attack!");
    }
}