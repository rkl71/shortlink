package com.hanyang.shortlink.admin.controller;

import com.hanyang.shortlink.admin.common.convention.result.Result;
import com.hanyang.shortlink.admin.common.convention.result.Results;
import com.hanyang.shortlink.admin.dto.req.ShortLinkGroupReqDTO;
import com.hanyang.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private  final GroupService  groupService;

    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupReqDTO requestParam){
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }
}
