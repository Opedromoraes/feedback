package com.estudo.feedback.api.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ClienteRequest {
    @Schema(description = "E-mail do cliente", example = "pedro@gmail.com")
    @NotNull
    @NotEmpty
    private String email;
    @Schema(description = "Nome do cliente", example = "Pedro Moraes")
    @NotNull
    @NotEmpty
    private String nome;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
