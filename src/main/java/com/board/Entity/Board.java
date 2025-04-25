package com.board.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "BOARD")

public class Board {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "writer")
    private String writer;
    @Column(name = "create_at")
    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
