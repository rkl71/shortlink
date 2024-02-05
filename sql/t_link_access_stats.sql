CREATE TABLE `t_link_access_stats`  (
                                               `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                               `gid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '分组标识',
                                               `full_short_url` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '完整短链接',
                                               `date` date NULL DEFAULT NULL COMMENT '日期',
                                               `pv` int NULL DEFAULT NULL COMMENT '访问量',
                                               `uv` int NULL DEFAULT NULL COMMENT '独立访问数',
                                               `uip` int NULL DEFAULT NULL COMMENT '独立IP数',
                                               `hour` int NULL DEFAULT NULL COMMENT '小时',
                                               `weekday` int NULL DEFAULT NULL COMMENT '星期',
                                               `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                                               `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                                               `del_flag` tinyint(1) NULL DEFAULT NULL COMMENT '删除标识：0 未删除 1 已删除',
                                               PRIMARY KEY (`id`),
                                               UNIQUE KEY `idx_unique_access_stats` (`full_short_url`, `gid`, `weekday`, `hour`) USING BTREE
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;
