package com.hanyang.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 回收站恢复功能
 */
@Data
public class RecycleBinRestoreReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}
