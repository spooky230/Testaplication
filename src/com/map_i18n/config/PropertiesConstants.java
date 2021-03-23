package com.map_i18n.config;

import com.map_i18n.exception.LocaleNotConfiguredException;
import com.map_i18n.exception.LocaleNotPresentException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesConstants {
    public static final String GREETINGS = "com.lesson.menu.greetings";
    public static final String MENU = "com.lesson.menu.choice";
    public static final String FINISH = "com.lesson.menu.finish";
    public static final String INCORRECT_NUMBER = "com.lesson.menu.incorrect.double";
    public static final String INCORRECT_CHOICE = "com.lesson.menu.incorrect.choice";
    public static final String INPUT_COLOR = "com.lesson.filer.input.color";
    public static final String INPUT_YEAR = "com.lesson.filer.input.year";
    public static final String INPUT_MODEL = "com.lesson.filer.input.model";
    public static final String INPUT_PRICE = "com.lesson.filer.input.price";
    private static final String LANG_PROPERTIES = "lang/%s.properties";
    private static PropertiesConstants instance = null;
    private final Properties properties;
    private final HashMap<String, String> propertiesMap;
    private final ConstantsMode mode;

    public static PropertiesConstants getInstance() {
        return instance;
    }

    //    public Properties getProperties() {
//        return properties;
//    }
    static void init(String locale, ConstantsMode mode) {
        if (null != instance) {
            System.out.println("Constants alrady initialized. skipping...");
        } else {
            instance = new PropertiesConstants(String.format(LANG_PROPERTIES, locale), mode);
        }
    }

    private PropertiesConstants(String locale, ConstantsMode mode) {
        this.mode = mode;
        switch (mode) {
            case JAVA_PROPERTIES: {
                propertiesMap = null;
                try (InputStream input = getClass().getClassLoader().getResourceAsStream(locale)) {

                    properties = new Properties();

                    if (input == null) {
                        System.out.println("Sorry, unable to find config.properties");
                        return;
                    }

                    //load a properties file from class path, inside static method
                    properties.load(input);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    throw new LocaleNotPresentException();
                }
                break;
            }
            case HASHMAP: {
                properties = null;
                URL res = getClass().getClassLoader().getResource(locale);
                try (BufferedReader reader = new BufferedReader(new FileReader(Paths.get(res.toURI()).toFile()))) {

                    propertiesMap = new HashMap<>();

                    while (reader.ready()) {
                        String line = reader.readLine();
                        String[] parts = line.split("=");
                        propertiesMap.put(parts[0], parts[1]);
                    }
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                    throw new LocaleNotPresentException();
                }
                break;
            }
            default:
                throw new LocaleNotPresentException();
        }

    }

    public static String getProperty(String property) {
        if (null == instance) {
            throw new LocaleNotConfiguredException();
        }
        switch (instance.mode) {
            case JAVA_PROPERTIES:
                return instance.properties.getProperty(property);
            case HASHMAP:
                return instance.propertiesMap.get(property);
            default:throw new LocaleNotConfiguredException();
        }
    }
}
