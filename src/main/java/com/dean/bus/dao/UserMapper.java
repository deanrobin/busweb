package com.dean.bus.dao;


import com.dean.bus.bean.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @author dean
 */
@Mapper
@Component
public interface UserMapper {


        /**
         * 添加操作，返回新增元素的 ID
         *
         * @param person
         */
        @Insert("insert into person(name,age) values(#{name},#{age})")
        @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
        int insert(Person person);
//
//        /**
//         * 更新操作
//         *
//         * @param personDO
//         * @return 受影响的行数
//         */
//        @Update("update person set name=#{name},age=#{age} where id=#{id}")
//        Long update(PersonDO personDO);
//
//        /**
//         * 删除操作
//         *
//         * @param id
//         * @return 受影响的行数
//         */
//        @Delete("delete from person where id=#{id}")
//        Long delete(@Param("id") Long id);
//
//        /**
//         * 查询所有
//         *
//         * @return
//         */
//        @Select("select id,name,age from person")
//        List<PersonDO> selectAll();

        /**
         * 根据主键查询单个
         *
         * @param name
         * @return
         */
        @Select("select phone from user where name=#{name}")
        String selectById(@Param("name") String name);

        @Select("select count(*) from person")
        int count();
}
