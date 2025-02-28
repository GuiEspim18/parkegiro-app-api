package com.br.parkegiro.api.Controller.Admin;

import com.br.parkegiro.api.Model.Admin.dto.AdminAddDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public ResponseEntity<?> getAdmins() {
        return adminService.getAdmins();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody AdminAddDTO admin) {
        return adminService.create(admin);
    }

}
