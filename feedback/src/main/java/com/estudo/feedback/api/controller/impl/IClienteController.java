package com.estudo.feedback.api.controller.impl;

import com.estudo.feedback.api.request.ClienteRequest;
import com.estudo.feedback.api.response.ClienteResponse;
import com.estudo.feedback.domain.dto.HttpError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

// interface responsável por mostrar exatamente como serão as mensagens na tela do front-end
// Dando códigos de respostas para diferentes situações (criado, valor faltante, erro inesperado)

@Tag(name = "Clientes")
@RestController()
@RequestMapping(value = "/clientes")
@Validated
public interface IClienteController {
    @Operation(
            summary = "Criar Cliente",
            description = "Endpoint responsável por criar um novo cliente",
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "Cliente criado com sucesso.",
                            content = @Content(schema = @Schema(implementation = ClienteResponse.class))),
                    @ApiResponse(
                            responseCode = "422",
                            description = "Requisição possui pelo menos um valor faltante ou inválido.",
                            content = @Content(schema = @Schema(implementation = HttpError.class))),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Ocorreu um erro inesperado.",
                            content = @Content(schema = @Schema(implementation = HttpError.class)))
            })
    @PostMapping
    @ResponseStatus(CREATED)
    ClienteResponse create(@Valid @RequestBody ClienteRequest clienteRequest);
    @Operation(
            summary = "Buscar Cliente",
            description = "Endpoint responsável por buscar um cliente",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Cliente encontrado com sucesso.",
                            content = @Content(schema = @Schema(implementation = ClienteResponse.class))),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Cliente não encontrado.",
                            content = @Content(schema = @Schema(implementation = HttpError.class))),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Ocorreu um erro inesperado.",
                            content = @Content(schema = @Schema(implementation = HttpError.class)))
            })
    @GetMapping
    @ResponseStatus(OK)
    ClienteResponse findAll();
    @Operation(
            summary = "Atualizar Cliente",
            description = "Endpoint responsável por atualizar um cliente",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Cliente atualizado com sucesso.",
                            content = @Content(schema = @Schema(implementation = ClienteResponse.class))),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Cliente não encontrado.",
                            content = @Content(schema = @Schema(implementation = HttpError.class))),
                    @ApiResponse(
                            responseCode = "422",
                            description = "Requisição possui pelo menos um valor faltante ou inválido.",
                            content = @Content(schema = @Schema(implementation = HttpError.class))),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Ocorreu um erro inesperado.",
                            content = @Content(schema = @Schema(implementation = HttpError.class)))
            })
    @PutMapping(value = "/{id}")
    @ResponseStatus(OK)
    ClienteRequest update(@Valid @RequestBody ClienteRequest clienteRequest,@PathVariable Long id);
    @Operation(
            summary = "Deletar Cliente",
            description = "Endpoint responsável por deletar um cliente",
            responses = {
                    @ApiResponse(
                            responseCode = "204",
                            description = "Cliente deletado com sucesso."
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Cliente não encontrado.",
                            content = @Content(schema = @Schema(implementation = HttpError.class))),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Ocorreu um erro inesperado.",
                            content = @Content(schema = @Schema(implementation = HttpError.class)))
            })
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(NO_CONTENT)
    ClienteRequest delete(@PathVariable Long id);
}
