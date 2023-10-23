package br.com.dysk.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Responsible {
    private Long id;
    private String name;
    private String cpf;
    private List<Student> students;
}
