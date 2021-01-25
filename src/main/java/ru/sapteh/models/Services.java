package ru.sapteh.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Services {
    private int id;
    private String nameEmployee;
    private String nameService;
    private Statuses idStatus;
    private String date;

}
