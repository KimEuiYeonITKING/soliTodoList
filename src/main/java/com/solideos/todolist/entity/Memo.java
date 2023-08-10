package com.solideos.todolist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "MEMO")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Memo {
    @Id
    @Column(name = "MEMO_NUM", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memoNum;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "TODO_NUM", nullable = false)
    @ToString.Exclude
    private Todo todo;

    @Column(name = "MEMO_CONTENT")
    private String memoContent;
}
