package com.estudo.feedback.api.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponse {

    @Schema(description = "Id gerado aleatoriamente pelo banco de dados", example = "1")
    private Long id;

    @Schema(description = "E-mail do cliente", example = "pedro@gmail.com")
    private String email;

    @Schema(description = "Nome do cliente", example = "Pedro Moraes")
    private String nome;

}
