package com.maistrenko.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Value {
    @Id  @GeneratedValue
    private Long id;
    private String sensorId;
    private String valueType;
    private BigDecimal value;
    private LocalDateTime timestamp = LocalDateTime.now();


}
