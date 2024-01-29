package com.hanyang.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hanyang.shortlink.project.common.convention.result.Result;
import com.hanyang.shortlink.project.common.convention.result.Results;
import com.hanyang.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import com.hanyang.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.hanyang.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.hanyang.shortlink.project.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回收站管理控制层
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    private final RecycleBinService recycleBinService;

    /**
     * 保存回收站
     */
    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询回收站短链接
     */
    @GetMapping("/api/short-link/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        return Results.success(recycleBinService.pageShortLink(requestParam));
    }
}
