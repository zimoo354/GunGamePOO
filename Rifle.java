public class Rifle extends Weapon {
	private Attachment attachment;

	public Rifle(String name, Integer ammo, Integer maxAmmo, Integer damage, Attachment attachment) {
		super(name, ammo, maxAmmo, damage);
		this.attachment = attachment;
	}

	public Rifle(String name, Integer ammo, Integer maxAmmo, Integer damage) {
		super(name, ammo, maxAmmo, damage);
		this.attachment = new Attachment("No attachment", 0, 0, 0);
	}

	public void attachmentShoot() {
		if (attachment.getMaxAmmo() > 0) {
			attachment.shoot();
		} else {
			System.out.println("This rifle doesn't has attachment");
		}
	}

	public Attachment getAttachment() {
		return attachment;
	}

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }	
}