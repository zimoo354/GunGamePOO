public class Gun extends Weapon {
	private Integer meleeDamage;

	public Gun(String name, Integer ammo, Integer maxAmmo, Integer damage, Integer meleeDamage) {
		super(name, ammo, maxAmmo, damage);
		this.meleeDamage = meleeDamage;
	}

	public void meleeAttack() {
		System.out.println("ZAZ!!");
	}

    public Integer getMeleeDamage() {
        return meleeDamage;
    }

    public void setMeleeDamage(Integer meleeDamage) {
        this.meleeDamage = meleeDamage;
    }	
}