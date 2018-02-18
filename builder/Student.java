package builder;

public class Student {

	private String name;
	private String id;
	private String clas;
	private String section;
	private String roll;
	private String contact;

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getClas() {
		return clas;
	}

	public String getSection() {
		return section;
	}

	public String getRoll() {
		return roll;
	}

	public String getContact() {
		return contact;
	}

	public static class Builder {
		private String name;
		private String id;
		private String clas;
		private String section;
		private String roll;
		private String contact;

		public Builder clas(String clas) {
			this.clas = clas;
			return this;
		}

		public Builder section(String section) {
			this.section = section;
			return this;
		}

		public Builder roll(String roll) {
			this.roll = roll;
			return this;
		}

		public Builder contact(String contact) {
			this.contact = contact;
			return this;
		}

		public Builder(String name, String id) {
			this.name = name;
			this.id = id;
		}

		public Student build() {
			return new Student(this);
		}
	}

	private Student(Builder builder) {
		this.name = builder.name;
		this.id = builder.id;
		this.clas = builder.clas;
		this.section = builder.section;
		this.roll = builder.roll;
		this.contact = builder.contact;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", clas=" + clas + ", section=" + section + ", roll=" + roll
				+ ", contact=" + contact + "]";
	}
	
	
}
