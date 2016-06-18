package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.User;

/**
 * 
 * <p>Title: UserMapper</p>
 * <p>Description: mapper接口，相当 于dao接口，用户管理</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-22下午2:45:12
 * @version 1.0
 */
public interface UserMapper {

	//根据id查询用户信息
	public User findUserById(int id) throws Exception;

}
