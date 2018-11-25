package cn.wj.service;

import java.util.List;

import cn.wj.bean.ActiveUser;
import cn.wj.bean.SysPermission;
import cn.wj.bean.SysUser;

public interface SysService {

	ActiveUser authenticat(String usercoce, String password)throws Exception;

	List<SysPermission> findMenuListByUserId(String userid) throws Exception;
	List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
	SysUser findSysUserByUserCode(String userCode) throws Exception;
}
