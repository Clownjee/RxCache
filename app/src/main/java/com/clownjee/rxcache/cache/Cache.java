package com.clownjee.rxcache.cache;

import android.graphics.Bitmap;

public interface Cache {

    /**
     * 得到Bitmap类型的值
     *
     * @param key 键
     * @return Bitmap值
     */
    Bitmap getBitmap(String key);

    /**
     * 得到String类型的值
     *
     * @param key 键
     * @return String值
     */
    String getString(String key);

    /**
     * 得到byte[]类型的值
     *
     * @param key 键
     * @return byte[]值
     */
    byte[] getBytes(String key);

    /**
     * 得到Object类型的值
     *
     * @param key 键
     * @return Object值
     */
    Object getObject(String key);

    /**
     * 得到Integer类型的值
     *
     * @param key 键
     * @return int值
     */
    Integer getInt(String key);

    /**
     * 得到Long类型的值
     *
     * @param key 键
     * @return long值
     */
    Long getLong(String key);

    /**
     * 得到Double类型的值
     *
     * @param key 键
     * @return double值
     */
    Double getDouble(String key);

    /**
     * 得到Float类型的值
     *
     * @param key 键
     * @return float值
     */
    Float getFloat(String key);

    /**
     * 得到Boolean类型的值
     *
     * @param key 键
     * @return boolean值
     */
    Boolean getBoolean(String key);

    /**
     * 设置值
     *
     * @param key   键
     * @param value 值
     */
    void put(String key, Object value);

    /**
     * 通过键清除缓存
     *
     * @param key 键
     */
    void remove(String key);

    /**
     * 清除所有
     */
    void clear();
}
