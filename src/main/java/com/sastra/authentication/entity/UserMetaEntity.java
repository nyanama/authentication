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
import java.sql.Clob;

@Entity
@Data
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table( name = "usermeta" )
public class UserMetaEntity {
    @Id
    @Column( name = "umeta_id" )
    private int umeta_id;
    @Column( name = "user_id" )
    private int userId;
    @Column( name = "meta_key" )
    private String meta_key;
    @Column( name = "meta_value" )
    private String meta_value;
}
