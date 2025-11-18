package superheroes;

public class Hero {
    String name;
    int level;
    int strength;
    int intelligence;
    int speed;
    int health;
    int power;
    int combat;

    public int calculatePunchDamage() {
        return strength * 2;
    }

    public int calculateSpecialAttackDamaged(String attackType) {
        int damage = strength;

        if (attackType.equals("Fire Punch")) {
            damage = damage * 5;
        } else if (attackType.equals("Ice Blast")) {
            damage = damage * 3;
        }
        return damage;
    }

}
