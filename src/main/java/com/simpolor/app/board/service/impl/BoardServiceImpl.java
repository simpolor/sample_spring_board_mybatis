package com.simpolor.app.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.simpolor.app.board.mapper.BoardMapper;
import com.simpolor.app.board.service.BoardService;
import com.simpolor.app.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource(name="boardMapper")
	private BoardMapper boardMapper;
	
	public List selectBoardList(BoardVO boardVO) {
		List list = null; 
		list = boardMapper.selectBoardList(boardVO);
		
		return list;
	}

	public BoardVO selectBoard(int seq) {
		BoardVO boardVO = null; 
		boardVO = boardMapper.selectBoard(seq);
		
		return boardVO;
	}

	public int insertBoard(BoardVO boardVO) {
		int result = 0;
		result = boardMapper.insertBoard(boardVO);
		
		return result;
	}
	
	public int updateBoard(BoardVO boardVO) {
		int result = 0;
		result = boardMapper.updateBoard(boardVO);
		
		return result;
	}
	
	public int deleteBoard(int seq ) {
		int result = 0;
		result = boardMapper.deleteBoard(seq);
		
		return result;
	}
}
