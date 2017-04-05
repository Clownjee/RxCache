package com.ghizzoniandrea.rxcache.cache;

import android.graphics.Bitmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MemoryCache implements Cache {

    private ConcurrentMap<String, Object> hashMap;

    public MemoryCache() {
        hashMap = new ConcurrentHashMap<>();
    }

    @Override
    public Bitmap getBitmap(String key) {
        return (Bitmap) this.hashMap.get(key);
    }

    @Override
    public String getString(String key) {
        if (hashMap.containsKey(key))
            return String.valueOf(this.hashMap.get(key));
        return null;
    }

    @Override
    public byte[] getBytes(String key) {
        if (hashMap.containsKey(key))
            return (byte[]) this.hashMap.get(key);
        return null;
    }

    @Override
    public Object getObject(String key) {
        if (hashMap.containsKey(key))
            return this.hashMap.get(key);
        return null;
    }

    @Override
    public Integer getInt(String key) {
        if (hashMap.containsKey(key)) {
            return (Integer) this.hashMap.get(key);
        } else {
            return null;
        }
    }

    @Override
    public Long getLong(String key) {
        if (hashMap.containsKey(key)) {
            return (Long) this.hashMap.get(key);
        } else {
            return null;
        }
    }

    @Override
    public Double getDouble(String key) {
        if (hashMap.containsKey(key)) {
            return (Double) this.hashMap.get(key);
        } else {
            return null;
        }
    }

    @Override
    public Float getFloat(String key) {
        if (hashMap.containsKey(key)) {
            return (Float) this.hashMap.get(key);
        } else {
            return null;
        }
    }

    @Override
    public Boolean getBoolean(String key) {
        if (hashMap.containsKey(key)) {
            return (Boolean) this.hashMap.get(key);
        } else {
            return null;
        }
    }

    @Override
    public void put(String key, Object value) {
        if (value instanceof Bitmap || value instanceof String)
            this.hashMap.put(key, value);
        else if (value instanceof Integer) {
            this.hashMap.put(key, new Integer((int) value));
        } else if (value instanceof Long) {
            this.hashMap.put(key, new Long((long) value));
        } else if (value instanceof Double) {
            this.hashMap.put(key, new Double((double) value));
        } else if (value instanceof Float) {
            this.hashMap.put(key, new Float((float) value));
        } else if (value instanceof Boolean) {
            this.hashMap.put(key, new Boolean((boolean) value));
        } else {
            this.hashMap.put(key, value);
        }
    }

    @Override
    public void remove(String key) {
        if (hashMap.containsKey(key))
            this.hashMap.remove(key);
    }

    @Override
    public void clear() {
        hashMap.clear();
    }
}