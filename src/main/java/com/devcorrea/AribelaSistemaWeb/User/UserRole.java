package com.devcorrea.AribelaSistemaWeb.User;

public enum UserRole {
    ADMIN("Admin"),
    SELLER("Seller"), // vendedora
    USER("User");

    private String Role;

    UserRole(String role) {
        Role = role;
    }

    public String getRole() {
        return Role;
    }
}
