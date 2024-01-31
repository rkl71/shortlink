CREATE TABLE `t_link_os_stats` (
                                   `id`             bigint   NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                   `full_short_url` varchar(128) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '完整短链接',
                                   `gid`            varchar(32) COLLATE utf8mb4_general_ci  DEFAULT NULL COMMENT '分组标识',
                                   `date`           date                                    DEFAULT NULL COMMENT '日期',
                                   `cnt`            int                                     DEFAULT NULL COMMENT '访问量',
                                   `os`             varchar(64) COLLATE utf8mb4_general_ci  DEFAULT NULL COMMENT '操作系统',
                                   `create_time`    datetime                                DEFAULT NULL COMMENT '创建时间',
                                   `update_time`    datetime NOT NULL COMMENT '修改时间',
                                   `del_flag`       tinyint(1)                              DEFAULT NULL COMMENT '删除标识 0表示删除 1表示未删除',
                                   PRIMARY KEY (`id`),
                                   UNIQUE KEY `idx_unique_locale_stats` (`full_short_url`, `gid`, `date`, `os`) USING BTREE
) COMMENT = '短链接监控操作系统访问状态' ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;