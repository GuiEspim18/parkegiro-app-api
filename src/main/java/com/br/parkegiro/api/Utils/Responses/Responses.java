package com.br.parkegiro.api.Utils.Responses;

import org.springframework.http.ResponseEntity;

public class Responses {

    public ResponseEntity<?> ok() {
        return ResponseEntity.status(200).body("Ok");
    }

    public ResponseEntity<?> ok(String message) {
        return ResponseEntity.status(200).body(message);
    }

    public ResponseEntity<?> ok(Object body) {
        return ResponseEntity.status(200).body(body);
    }

    public ResponseEntity<?> notFound() {
        return ResponseEntity.status(404).body("Not found");
    }

    public ResponseEntity<?> notFound(String message) {
        return ResponseEntity.status(404).body(message);
    }

    public ResponseEntity<?> notFound(Object body) {
        return ResponseEntity.status(404).body(body);
    }

    public ResponseEntity<?> serverError() {
        return ResponseEntity.status(500).body("Internal Server Error");
    }

    public ResponseEntity<?> serverError(String message) {
        return ResponseEntity.status(500).body(message);
    }

    public ResponseEntity<?> serverError(Object body) {
        return ResponseEntity.status(500).body(body);
    }

    public ResponseEntity<?> forbidden() {
        return ResponseEntity.status(403).body("Forbidden");
    }

    public ResponseEntity<?> forbidden(String message) {
        return ResponseEntity.status(403).body(message);
    }

    public ResponseEntity<?> forbidden(Object body) {
        return ResponseEntity.status(403).body(body);
    }

    public ResponseEntity<?> conflict() {
        return ResponseEntity.status(409).body("Conflict");
    }

    public ResponseEntity<?> conflict(String message) {
        return ResponseEntity.status(409).body(message);
    }

    public ResponseEntity<?> conflict(Object body) {
        return ResponseEntity.status(409).body(body);
    }

    public ResponseEntity<?> unauthorized() {
        return ResponseEntity.status(401).body("Unauthorized");
    }

    public ResponseEntity<?> unauthorized(String message) {
        return ResponseEntity.status(401).body(message);
    }

    public ResponseEntity<?> unauthorized(Object body) {
        return ResponseEntity.status(401).body(body);
    }

}
