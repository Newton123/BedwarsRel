package io.github.yannici.bedwars.Database;

public abstract class DatabaseObject {
	
	private int id = 0;
	
	public DatabaseObject() {
		this.id = 0;
	}

	@DBGetField(name = "id")
	public int getId() {
		return this.id;
	}

	@DBSetField(name = "id")
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isNew() {
		return (this.id == 0);
	}
	
}