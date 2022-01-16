package eu.reformedstudios.apiexample;

import com.google.inject.AbstractModule;

public class ExampleModule extends AbstractModule {


	@Override
	protected void configure() {
		bind(ExampleService.class).toInstance(new ExampleService());
	}
}
