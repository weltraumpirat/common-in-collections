package de.cloudnine.examples.before;

public class SecondVO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName( final String name ) {
		this.name = name;
	}

	public SecondVO( final String name ) {
		setName( name );
	}
}
