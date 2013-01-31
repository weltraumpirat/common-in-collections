package de.cloudnine.examples.after;

public class FirstVO implements Named {
	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName( final String name ) {
		this.name = name;
	}

	public FirstVO( final String name ) {
		setName( name );
	}
}
