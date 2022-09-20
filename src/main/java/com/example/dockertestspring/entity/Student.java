package com.example.dockertestspring.entity;


import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column
    private String name;

    @NotNull
    @Column
    private String surname;
    @NotNull
    @Column
    private String patronymic;
    @NotNull
    @Column
    private String groupStudent;
    @NotNull
    @Column
    private  int level;

}
