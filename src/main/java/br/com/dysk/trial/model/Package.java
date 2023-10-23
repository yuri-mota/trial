package br.com.dysk.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Package {
    private Long id;
    private Responsible responsible;
    private Student student;
    private Double price;
    private List<Date> paymentDates;
    private Double payedValue;
    private Float packageHours;
}
