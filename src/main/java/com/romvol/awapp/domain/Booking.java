package com.romvol.awapp.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

import static com.romvol.awapp.domain.Booking.Status.ACTIVE;

@Document
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    private String id;
    private String note;
    private LocalDateTime createdDate;
    private LocalDateTime bookingDate;
    @NotNull
    private Customer customer;
    @NotNull
    private Procedure procedure;
    private Status status = ACTIVE;

    enum Status {
        ACTIVE,
        INACTIVE
    }
}
