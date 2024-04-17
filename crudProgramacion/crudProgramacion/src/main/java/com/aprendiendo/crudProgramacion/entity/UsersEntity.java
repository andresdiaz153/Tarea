package com.aprendiendo.crudProgramacion.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Table(name = "Users")
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersEntity implements Serializable {

    @Id
    @Column(name = "id-user")
    private Integer idUser;
    private String name;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date birthdate;

}
