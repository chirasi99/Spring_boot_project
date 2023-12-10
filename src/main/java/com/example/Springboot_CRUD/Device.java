package com.example.Springboot_CRUD;

//import com.sun.org.apache.xpath.internal.objects.XString;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;

@Entity
@Table (name = "device_records")
class Device {
    @Id
    private int device_id;
    @Column
    private String name;
    @Column
    private  String model;
    @Column
    private  String status;
    @Column
    private String enrolled_time;

    public Device(){}

    public Device(int device_id, String name, String model,String status,String enrolled_time){
        super();
        this.device_id = device_id;
        this.name = name;
        this.model = model;
        this.status = status;
        this.enrolled_time = enrolled_time;

    }

    public int getDevice_id(){
        return device_id;
    }

    public void setDevice_id(int device_id){
        this.device_id = device_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public String getEnrolled_time(){
        return enrolled_time;
    }

    public void setEnrolled_time(String enrolled_time){
        this.enrolled_time=enrolled_time;
    }
}
