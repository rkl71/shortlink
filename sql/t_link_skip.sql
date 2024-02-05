CREATE TABLE `t_link_skip_%d` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                `gid` varchar(32) DEFAULT 'default' COMMENT '分组标识',
                                `full_short_url` varchar(128) DEFAULT NULL COMMENT '完整短链接',
                                PRIMARY KEY (`id`),
                                UNIQUE KEY `idx_unique_full_short_url` (`full_short_url`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;