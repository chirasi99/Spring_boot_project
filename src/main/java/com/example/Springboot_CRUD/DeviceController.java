package com.example.Springboot_CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {
    @Autowired
    private DeviceService deviceService;
    @PostMapping("/add")

    public String addDevice(@RequestBody Device device){
        return deviceService.addDevice(device);
    }

    @PostMapping("/bulkAdd")
    public String addDevices(@RequestBody List<Device> devices){
        return deviceService.addDevices(devices);
    }

    @DeleteMapping("/all/{device_id}")
    public String deleteDevice(@PathVariable int device_id){
        return deviceService.deleteDevice(device_id);
    }

    @PutMapping("/update")
    public String updateDevice(@RequestBody Device device){
        return deviceService.updateDevice(device);
    }

    @RequestMapping("/all/{device_id}")
    public Device getDevice(@PathVariable int device_id){
        return deviceService.getDevice(device_id);
    }


}
