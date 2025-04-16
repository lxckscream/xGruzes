package ru.don1xdev.xgruzes.services;

import ru.don1xdev.xgruzes.XGruzes;

public interface ManagerService {
    XGruzes PLUGIN = XGruzes.getInstance();

    void start();
    void stop();

    default void restart() {
        this.stop();
        this.start();
    }
}
