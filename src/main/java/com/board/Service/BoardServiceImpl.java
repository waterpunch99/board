package com.board.Service;

import com.board.Entity.Board;
import com.board.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    @Override
    public Board save(Board board) {
        return boardRepository.save(board);
    }

    @Override
    public Board findById(Long id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

    }

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    @Override
    public Board update(Long id, String title, String content) {
        Board board = findById(id);
        board.update(title, content);
        return board;
    }

    @Override
    public void delete(Long id) {
        boardRepository.deleteById(id);

    }
}
