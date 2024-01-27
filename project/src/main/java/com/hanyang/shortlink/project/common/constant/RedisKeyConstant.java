package com.hanyang.shortlink.project.common.constant;

/**
 * Redis Key 常量类
 */
public class RedisKeyConstant {

    /**
     * 短链接跳转前缀 Key
     */
    public static final String SKIP_SHORT_LINK_KEY = "short-link_skip_%s";

    /**
     * 短链接跳转锁前缀 Key
     */
    public static final String LOCK_SKIP_SHORT_LINK_KEY = "short-link_lock_skip_%s";
}
