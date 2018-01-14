package com.simpolor.app.board.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simpolor.app.board.vo.BoardVO;

@Repository("boardMapper")
public class BoardMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List selectBoardList(BoardVO boardVO){
		return sqlSession.selectList("selectBoardList", boardVO);
	}
	
	public BoardVO selectBoard( int seq ){
		return sqlSession.selectOne("selectBoard", seq);
	}
	
	public int insertBoard( BoardVO boardVO ){
		
		return sqlSession.insert("insertBoard", boardVO);
	}
	
	public int updateBoard( BoardVO boardVO ){
		return sqlSession.update("updateBoard", boardVO);
	}
	
	public int deleteBoard( int seq ){
		return sqlSession.delete("deleteBoard", seq);
	}
	
}
