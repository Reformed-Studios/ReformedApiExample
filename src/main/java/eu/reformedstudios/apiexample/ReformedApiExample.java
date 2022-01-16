package eu.reformedstudios.apiexample;

import com.google.inject.Inject;
import eu.reformedstudios.reformedcoreapi.modules.ReformedModuleBuilder;
import org.bukkit.plugin.java.JavaPlugin;

public class ReformedApiExample extends JavaPlugin {

	@Inject
	private ExampleService exampleService;

	@Override
	public void onEnable() {
		exampleService.printHello();
	}

	@Override
	public void onDisable() {

	}

	@Override
	public void onLoad() {
		ReformedModuleBuilder.builder()
						.withMainClass(this)
						.withName("ExampleModule")
						.withModule(new ExampleModule())
						.build();
	}
}
