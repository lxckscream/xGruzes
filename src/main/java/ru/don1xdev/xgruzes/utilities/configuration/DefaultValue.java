package ru.don1xdev.xgruzes.utilities.configuration;

public class DefaultValue {
    private final String path;
    private final Object value;

    public DefaultValue(String path, Object value) {
        this.path = path;
        this.value =value;
    }

    public Object getValue() {
        return value;
    }

    public String getPath() {
        return path;
    }
}
