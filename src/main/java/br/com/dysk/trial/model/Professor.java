package br.com.dysk.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor {
    private Long id;
    private String name;
    private String cpf;
    private Date birthday;
}
