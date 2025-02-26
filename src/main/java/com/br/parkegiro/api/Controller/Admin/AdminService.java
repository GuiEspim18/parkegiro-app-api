package com.br.parkegiro.api.Controller.Admin;

import com.br.parkegiro.api.Utils.Responses.Responses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService extends Responses {

    public ResponseEntity<?> getAdmins() {
        return ok("Hello world");
    }

}
