package game;

public class Character {
    protected String name;
    protected int health;

    /**
     * Персонаж.
     *
     * @param name   имя персонажа
     * @param health начальное здоровье
     */
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println("Атакую!");
    }

    /**
     * Драка.
     *
     * @param damage количество урона
     */
    public void takeDamage(int damage) {
        if (damage > 0) {
            health -= damage;
            if (health < 0) {
                health = 0;
            }
            System.out.println(name + " получает " + damage + " урона. Осталось здоровья: " + health);
        }
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
