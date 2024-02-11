class Knight implements AttackStrategy, DefenseStrategy {
    @Override
    public void attack() {
        System.out.println("Knight swings a sword!");
    }

    @Override
    public void defend() {
        System.out.println("Knight has multiple defense strategies...");
        defendWithShield();
        dodge();
        createMagicBarrier();
    }

    private void defendWithShield() {
        System.out.println("Using a shield to defend!");
    }

    private void dodge() {
        System.out.println("Dodging to avoid attack!");
    }

    private void createMagicBarrier() {
        System.out.println("Creating a magic barrier for defense!");
    }
}