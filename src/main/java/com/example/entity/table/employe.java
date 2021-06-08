package com.example.entity.table;

import com.mongodb.lang.NonNull;
import com.sun.deploy.panel.IProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employe")
public class employe {
    @Id
    private  int Id;
    private String Name;
}
