package com.hanyang.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanyang.shortlink.admin.dao.entity.GroupDO;
import com.hanyang.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.hanyang.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口层
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    /**
     * 查询用户短链接分组集合
     *
     * @return 短链接分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();

    /**
     * 修改短链接分组
     *
     * @param requestParam 短链接分组参数
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);
}
