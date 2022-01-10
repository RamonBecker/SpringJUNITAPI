package br.com.dicasdeumdev.springjunitapi.domain;

import lombok.*;

import javax.persistence.*;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode
//@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;



}
