package dev.victorugons.accesscontrol.model;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CompTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EmbeddedId
    private CompTimeId id;
    private LocalDateTime date;
    private BigDecimal workedHours;
    private BigDecimal balance;
}
