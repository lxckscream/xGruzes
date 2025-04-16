package ru.don1xdev.xgruzes.utilities.configuration;

import org.bukkit.configuration.file.FileConfiguration;
import ru.don1xdev.xgruzes.utilities.Wrapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConfigurationModel implements Wrapper {
    private final File file;
    private final FileConfiguration fileConfiguration;

    public ConfigurationModel(File file, FileConfiguration fileConfiguration) {
        this.file = file;
        if (!this.file.exists()) {
            try {
                this.file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.fileConfiguration = fileConfiguration;
    }

    public FileConfiguration getFileConfiguration() {
        return fileConfiguration;
    }

    public File getFile() {
        return file;
    }

    public void loadDefaults(List<DefaultValue> defaultValues){
        defaultValues.forEach(defaultValue -> {
            if (this.getFileConfiguration().get(defaultValue.getPath())==null) {
                this.getFileConfiguration().set(defaultValue.getPath(), defaultValue.getValue());
            }
        });
        this.save();
    }

    public void save() {
        try {
            this.getFileConfiguration().save(this.getFile());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
