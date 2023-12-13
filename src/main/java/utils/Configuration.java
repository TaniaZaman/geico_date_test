package utils;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	// The Properties class represents a persistent set of properties.
	private Properties properties = new Properties();
	
	// This is a default Constructor
	// Why I am putting loadProperty () method inside constructor
	// because when Configuration class is instantiated (when it will create object)
	// then default Constructor will be initialized, the method loadproperty() present inside
	// the Constructor will also be initialized
	public Configuration() {
		loadProperty ();
	}
	
	public void loadProperty () {
			try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Individual return type method created
	public String getProperties(String key) {
		return properties.getProperty(key);
	}

}