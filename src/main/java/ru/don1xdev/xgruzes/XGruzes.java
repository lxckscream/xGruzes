package ru.don1xdev.xgruzes;

import org.bukkit.plugin.java.JavaPlugin;
import ru.don1xdev.xgruzes.utilities.configuration.implementation.Configuration;

public final class XGruzes extends JavaPlugin {
    private static XGruzes instance;
    private static Configuration configuration;


    @Override
    public void onEnable() {
        instance = this;
        configuration = new Configuration();

    }

    @Override
    public void onDisable() {

    }

    public static XGruzes getInstance() {
        return instance;
    }

    public static Configuration getConfiguration() {
        return configuration;
    }
}
