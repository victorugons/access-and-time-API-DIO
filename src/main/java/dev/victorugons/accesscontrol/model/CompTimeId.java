package dev.victorugons.accesscontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class CompTimeId implements Serializable {
    private long compTimeId;
    @EmbeddedId
    private StayControlId stayControlId;
    private long userId;
}
