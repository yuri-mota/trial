package br.com.dysk.trial.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {
    private Long id;
    private Float hours;
    private Student student;
    private Professor professor;
    private Date date;
    private Time time;
}
