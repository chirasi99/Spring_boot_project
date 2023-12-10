package com.example.Springboot_CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceDAO dao;
    public String addDevice(Device device){
        dao.save(device);
        return "New Device has been added into Database, device number: "+ device.getDevice_id();
    }

    public String addDevices(List<Device> device){
        dao.saveAll(device);
        return "All New Devices has been added into Database";
    }

    public String deleteDevice(int device_id){
        Device device = dao.getById(device_id);
        dao.delete(device);
        return "Device Number is deleted: " + device_id;
    }

    public String updateDevice(Device device){
        dao.save(device);
        return "Device Number is update : " + device.getDevice_id();
    }
    public Device getDevice(int device_id){
        return dao.findById(device_id).get();
    }
}
