package com.aselad.tools.cache;

/**
 * Holds a key-value pair. The value is optional and defaults to null.
 */
public class KVItem {
    private String key;
    private String value = null;

    public KVItem(String key) {
        this.key = key;
    }

    public KVItem(String key, String value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public boolean hasValue() {
        return (value != null);
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String val = hasValue() ? " " + this.value : "";
        return this.key + val;
    }
}