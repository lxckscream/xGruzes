package ru.don1xdev.xgruzes.utilities.configuration.implementation;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import ru.don1xdev.xgruzes.utilities.configuration.ConfigurationModel;
import ru.don1xdev.xgruzes.utilities.configuration.DefaultValue;

import java.io.File;
import java.util.Arrays;

public class Configuration extends ConfigurationModel {
    public Configuration() {
        super(new File(PLUGIN.getDataFolder() + "/config.yml"), YamlConfiguration.loadConfiguration(new File(PLUGIN.getDataFolder() + "/config.yml")));
        loadDefaults(
                Arrays.asList(
                        new DefaultValue("interval", 1800)
                )
        );
    }
}
