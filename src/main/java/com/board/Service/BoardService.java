package com.board.Service;

import com.board.Entity.Board;

import java.util.List;

public interface BoardService {
    Board save(Board board);
    Board findById(Long id);
    List<Board> findAll();
    Board update(Long id, String title, String content);
    void delete(Long id);
}
