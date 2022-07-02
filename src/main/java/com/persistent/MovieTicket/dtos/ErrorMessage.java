package com.persistent.MovieTicket.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessage {
    String errorCode;
    String errorMessage;

    public ErrorMessage(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
