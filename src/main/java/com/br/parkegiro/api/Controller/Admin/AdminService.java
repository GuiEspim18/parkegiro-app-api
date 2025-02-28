package com.br.parkegiro.api.Controller.Admin;

import com.br.parkegiro.api.Model.Admin.Admin;
import com.br.parkegiro.api.Model.Admin.AdminRepository;
import com.br.parkegiro.api.Model.Admin.dto.AdminAddDTO;
import com.br.parkegiro.api.Utils.Responses.Responses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService extends Responses {

    @Autowired
    private AdminRepository adminRepository;

    public ResponseEntity<?> getAdmins() {
        return ok("Hello world");
    }

    public ResponseEntity<?> create(AdminAddDTO admin) {
        Admin exits = adminRepository.findByEmail(admin.email());
        if (exits == null) {
            adminRepository.save(new Admin(admin));
            return ok("Administrador cadastrado com sucesso");
        }
        return conflict("Administrador já cadastrado!");
    }

}
