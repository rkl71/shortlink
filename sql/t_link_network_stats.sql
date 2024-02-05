CREATE TABLE `t_link_network_stats` (
                                        `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                        `full_short_url` varchar(128) DEFAULT NULL COMMENT '完整短链接',
                                        `gid` varchar(32) DEFAULT 'default' COMMENT '分组标识',
                                        `date` date DEFAULT NULL COMMENT '日期',
                                        `cnt` int(11) DEFAULT NULL COMMENT '访问量',
                                        `network` varchar(64) DEFAULT NULL COMMENT '访问网络',
                                        `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                        `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                        `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0：未删除 1：已删除',
                                        PRIMARY KEY (`id`),
                                        UNIQUE KEY `idx_unique_browser_stats` (`full_short_url`,`gid`,`date`,`network`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;