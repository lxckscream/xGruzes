package ru.don1xdev.xgruzes.services;

import ru.don1xdev.xgruzes.models.gruz.GruzModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GruzesManagerService implements ManagerService{
    private final List<GruzModel> gruzModels = new ArrayList<>();

    @Override
    public void start() {

    }

    @Override
    public void stop() {
        this.getGruzModels().clear();
    }

    public List<GruzModel> getGruzModels() {
        return gruzModels;
    }

    public GruzModel getRandomGruz() {
        return this.getGruzModels().get(new Random().nextInt(this.getGruzModels().size()));
    }
}
