public class Weapon {
    private String name;
    private Integer ammo;
    private Integer maxAmmo;
    private Integer damage;

    public Weapon(String name, Integer ammo, Integer maxAmmo, Integer damage) {
        this.name = name;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.damage = damage;
    }

    public Weapon(String name) {
        this.name = name;
        this.ammo = 8;
        this.maxAmmo = 8;        
        this.damage = 60;
    }

	public void shoot() {
		Integer currentAmmo = getAmmo();
		if (currentAmmo > 0) {
			System.out.println(getName() + ": PUM!!!");
			setAmmo(currentAmmo - 1);
		} else {
			System.out.println("No ammo");
		}
	}

	public void reload() {
		System.out.println("Reloading...");
		setAmmo(getMaxAmmo());
	}	

	public void howManyAmmo() {
		System.out.println(getName() + " has " + getAmmo().toString() + " bullets");
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmmo() {
        return ammo;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }

    public Integer getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(Integer maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}