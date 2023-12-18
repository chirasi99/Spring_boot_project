package com.example.Springboot_CRUD;

//import com.sun.org.apache.xpath.internal.objects.XString;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table (name = "device_records")
class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int device_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private  String model;
    @Column(nullable = false)
    private  String status;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime enrolled_time;

    public Device(){}

    public Device(int device_id, String name, String model,String status,LocalDateTime enrolled_time){
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

    public LocalDateTime getEnrolled_time(){
        return enrolled_time;
    }

    public void setEnrolled_time(LocalDateTime enrolled_time){
        this.enrolled_time=enrolled_time;
    }

}
