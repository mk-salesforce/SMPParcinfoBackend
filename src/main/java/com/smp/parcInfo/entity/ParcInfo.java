package com.smp.parcInfo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "parc_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParcInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String utilisateur;
    private String service ;
    private String fonction ;
    private String loginSage ;
    private String mail;
    private String fixe;
    private String mobile;
    private String materiel;
    private String fabricant;
    private String modele;
    private String type;
    private String numeroDeSerie;
    private String annee;
    private String nomAppareil;
    private String adresseIp;
    private String processeur;
    private String ram;
    private String rom;
    private String os;
    private String versionOffice;
}

