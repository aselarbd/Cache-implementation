package com.aselad.tools.cache;

public interface KVCache {

    KVItem get(String key);

    void put(KVItem item);

    void delete(KVItem item);
}