package com.sastra.authentication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Data
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table( name = "users" )
public class UserEntity {
    @Id
    @Column( name = "ID" )
    private int id;
    @Column( name = "user_login" )
    private String user;
    @Column( name = "user_pass" )
    private String user_pass;
    @Column( name = "user_nicename" )
    private String user_nicename;
    @Column( name = "user_url" )
    private String user_url;
    @Column( name = "user_email" )
    private String user_email;
    @Column( name = "user_registered" )
    private Date user_registered;
    @Column( name = "user_activation_key" )
    private String user_activation_key;
    @Column( name = "user_status" )
    private int user_status;
    @Column( name = "display_name" )
    private String display_name;
}
