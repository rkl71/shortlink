package com.hanyang.shortlink.admin.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hanyang.shortlink.admin.common.biz.user.UserContext;
import com.hanyang.shortlink.admin.common.convention.exception.ServiceException;
import com.hanyang.shortlink.admin.common.convention.result.Result;
import com.hanyang.shortlink.admin.dao.entity.GroupDO;
import com.hanyang.shortlink.admin.dao.mapper.GroupMapper;
import com.hanyang.shortlink.admin.remote.ShortLinkRemoteService;
import com.hanyang.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.hanyang.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import com.hanyang.shortlink.admin.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * URL 回收站接口实现层
 */
@Service
@RequiredArgsConstructor
public class RecycleBinServiceImpl implements RecycleBinService {

    private final GroupMapper groupMapper;

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };


    @Override
    public Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(GroupDO::getDelFlag, 0);
        List<GroupDO> groupDOList = groupMapper.selectList(queryWrapper);
        if (CollUtil.isEmpty(groupDOList)) {
            throw new ServiceException("用户无分组信息");
        }
        requestParam.setGidList(groupDOList.stream().map(GroupDO::getGid).toList());
        return shortLinkRemoteService.pageRecycleBinShortLink(requestParam);
    }
}
