package cn.wj.mapper;

import java.util.List;

import cn.wj.bean.SysPermission;



public interface SysPermissionMapperCustom {
	

	public List<SysPermission> findMenuListByUserId(String userid)throws Exception;

	public List<SysPermission> findPermissionListByUserId(String userid)throws Exception;

}
