package com.entityrelationship.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shine_passport")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String passport_number;
//    @OneToOne (fetch = FetchType.LAZY,mappedBy = "passport")
    @OneToOne
    @JsonBackReference
    private Student student;

}
