package com.example.arquiteto.controllers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StandardError {

    private Integer status;
    private String msg;
    private Long timeStamp;
}
