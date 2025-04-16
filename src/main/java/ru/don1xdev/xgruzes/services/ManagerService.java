package ru.don1xdev.xgruzes.services;

public interface ManagerService {
    void start();
    void stop();

    default void restart() {
        this.stop();
        this.start();
    }
}
