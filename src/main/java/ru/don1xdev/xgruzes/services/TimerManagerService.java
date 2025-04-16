package ru.don1xdev.xgruzes.services;

import org.bukkit.scheduler.BukkitRunnable;
import ru.don1xdev.xgruzes.XGruzes;

public class TimerManagerService implements ManagerService{
    private BukkitRunnable task = new BukkitRunnable() {
        @Override
        public void run() {
            if (nowVal <= 0) {
                XGruzes.getGruzesManagerService().
            } else nowVal--;
        }
    };
    private long initVal, nowVal;

    @Override
    public void start() {
        this.task.runTaskTimer(PLUGIN, 20, 20);
    }

    @Override
    public void stop() {

    }
}
