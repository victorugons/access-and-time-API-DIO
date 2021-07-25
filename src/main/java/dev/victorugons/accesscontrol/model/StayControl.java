package dev.victorugons.accesscontrol.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class StayControl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EmbeddedId
    private StayControlId id;
    private LocalDateTime stayEntry;
    private LocalDateTime stayExit;
    private BigDecimal timePeriod;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
