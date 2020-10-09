package cn.cz.atcrowdfunding.mapper;

import cn.cz.atcrowdfunding.bean.TAdminRole;
import cn.cz.atcrowdfunding.bean.TAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminRoleMapper {
    long countByExample(TAdminRoleExample example);

    int deleteByExample(TAdminRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAdminRole record);

    int insertSelective(TAdminRole record);

    List<TAdminRole> selectByExample(TAdminRoleExample example);

    TAdminRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAdminRole record, @Param("example") TAdminRoleExample example);

    int updateByExample(@Param("record") TAdminRole record, @Param("example") TAdminRoleExample example);

    int updateByPrimaryKeySelective(TAdminRole record);

    int updateByPrimaryKey(TAdminRole record);

	List<Integer> getAssignRoleAdminId(String id);

	void saveAdminAndRole(@Param("roleIds") Integer[] roleId, @Param("adminId") Integer adminId);

	void deleteAdminAndRoleByAdminId(@Param("roleIds") Integer[] roleId, @Param("adminId") Integer adminId);
}