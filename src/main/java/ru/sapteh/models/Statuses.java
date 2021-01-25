package ru.sapteh.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statuses {
    private int id;
    private String nameStatus;
    private String runTime;
    private String priority;
}
