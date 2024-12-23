package com.team6.bms.mapper;

import org.apache.ibatis.annotations.Param;

import com.team6.bms.model.BookInfo;
import com.team6.bms.model.BookType;

import java.util.List;
import java.util.Map;

public interface BookTypeMapper {
    int deleteByPrimaryKey(Integer booktypeid);

    int insert(BookType record);

    int insertSelective(BookType record);

    BookType selectByPrimaryKey(Integer booktypeid);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);

    List<BookType> selectAllByLimit(@Param("begin") Integer begin, @Param("size") Integer size);

    Integer selectCount();

    List<BookType> selectAll();

    int selectCountBySearch(Map<String, Object> searchParam);

    List<BookType> selectBySearch(Map<String, Object> searchParam);
}
