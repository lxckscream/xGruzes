package ru.don1xdev.xgruzes;

import org.bukkit.plugin.java.JavaPlugin;
import ru.don1xdev.xgruzes.services.GruzesManagerService;
import ru.don1xdev.xgruzes.services.TimerManagerService;
import ru.don1xdev.xgruzes.utilities.configuration.implementation.Configuration;

public final class XGruzes extends JavaPlugin {
    private static XGruzes instance;
    private static Configuration configuration;
    private static TimerManagerService timerManagerService;
    private static GruzesManagerService gruzesManagerService;

    @Override
    public void onEnable() {
        instance = this;
        configuration = new Configuration();
        timerManagerService = new TimerManagerService();
        gruzesManagerService = new GruzesManagerService();


        /*
         *  Инициализация сервисов
         */
        timerManagerService.start();
        gruzesManagerService.start();


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

    public static GruzesManagerService getGruzesManagerService() {
        return gruzesManagerService;
    }

    public static TimerManagerService getTimerManagerService() {
        return timerManagerService;
    }
}
