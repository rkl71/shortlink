CREATE TABLE `t_link_stats_today` (
                                      `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                      `gid` varchar(32) DEFAULT 'default' COMMENT '分组标识',
                                      `full_short_url` varchar(128) DEFAULT NULL COMMENT '短链接',
                                      `date` date DEFAULT NULL COMMENT '日期',
                                      `today_pv` int(11) DEFAULT '0' COMMENT '今日PV',
                                      `today_uv` int(11) DEFAULT '0' COMMENT '今日UV',
                                      `today_uip` int(11) DEFAULT '0' COMMENT '今日IP数',
                                      `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                      `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                      `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0：未删除 1：已删除',
                                      PRIMARY KEY (`id`),
                                      UNIQUE KEY `idx_unique_full-short-url` (`full_short_url`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;