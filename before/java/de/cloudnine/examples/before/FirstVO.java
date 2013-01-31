package de.cloudnine.examples.before;

public class FirstVO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName( final String name ) {
		this.name = name;
	}

	public FirstVO( final String name ) {
		setName( name );
	}
}
