package pl.oskarpolak.calorie.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "macroelement")
@Data
public class MacroEntity {
    public enum MacroType {
        CARBO, PROTEINE, FAT;
    }

    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private MacroType type;
    private int weight;
    @Column(name = "creation_time")
    private LocalDate creationTime;
}
