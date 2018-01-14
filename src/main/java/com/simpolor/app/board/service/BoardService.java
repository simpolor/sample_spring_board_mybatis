package com.simpolor.app.board.service;

import java.util.List;

import com.simpolor.app.board.vo.BoardVO;

public interface BoardService {
	
	public List selectBoardList(BoardVO boardVO);

	public BoardVO selectBoard(int seq);
		
	public int insertBoard(BoardVO boardVO);
		
	public int updateBoard(BoardVO boardVO);
	
	public int deleteBoard(int seq );

}
