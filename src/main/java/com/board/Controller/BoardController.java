package com.board.Controller;

import com.board.Entity.Board;
import com.board.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    // 게시글 등록
    @PostMapping
    public ResponseEntity<Board> create(@RequestBody Board board) {
        Board saved = boardService.save(board);
        return ResponseEntity.ok(saved);
    }

    // 전체 게시글 조회
    @GetMapping
    public List<Board> findAll() {
        return boardService.findAll();
    }

    // 특정 게시글 조회
    @GetMapping("/{id}")
    public Board findById(@PathVariable Long id) {
        return boardService.findById(id);
    }

    // 게시글 수정
    @PutMapping("/{id}")
    public Board update(@PathVariable Long id, @RequestBody Board board) {
        return boardService.update(id, board.getTitle(), board.getContent());
    }

    // 게시글 삭제
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        boardService.delete(id);
    }

}
