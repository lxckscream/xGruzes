package ru.don1xdev.xgruzes.services;

import org.bukkit.scheduler.BukkitRunnable;
import ru.don1xdev.xgruzes.XGruzes;

public class TimerManagerService implements ManagerService{
    private BukkitRunnable task = new BukkitRunnable() {
        @Override
        public void run() {
            if (nowVal <= 0) {
                XGruzes.getGruzesManagerService().getRandomGruz().spawn();
                TimerManagerService.this.stop();
            } else nowVal--;
        }
    };

    private final long initVal;
    private long nowVal;

    public TimerManagerService(){
        this.initVal = XGruzes.getConfiguration().getFileConfiguration().getLong("interval");
        this.nowVal = this.initVal;
    }

    @Override
    public void start() {
        this.task.runTaskTimer(PLUGIN, 20, 20);
    }

    @Override
    public void stop() {
        this.nowVal = this.initVal;
        this.task.cancel();
    }

    public BukkitRunnable getTask() {
        return task;
    }
}
