package com.example.demo.errorResponse;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeErrorResponse {
    private int status;
    private String message;
    private long timestamp;
}
