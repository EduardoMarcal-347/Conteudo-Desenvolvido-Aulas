package com.iftm.subscription.controllers;

import com.iftm.subscription.data.vo.EmailVO;
import com.iftm.subscription.data.vo.UserVO;
import com.iftm.subscription.services.EmailService;
import com.iftm.subscription.utils.MediaTypes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/v1/email")
public class EmailController {
    @Autowired
    private EmailService service;

    // READ - HTTP GET
    // Endpoint: http://localhost:8080/api/v1/email
    @GetMapping
    @Operation(summary = "Find All Emails", description = "Find All Emails",
        responses = {
                @ApiResponse(description = "Success", responseCode = "200",
                        content = {
                            @Content(mediaType = MediaTypes.APPLICATION_JSON,
                                array = @ArraySchema(schema = @Schema(implementation = EmailVO.class))
                            )
                        }
                ),
                @ApiResponse(description = "Not Found.", responseCode = "404", content = @Content),
                @ApiResponse(description = "Bad Request.", responseCode = "400", content = @Content),
                @ApiResponse(description = "Unauthorized.", responseCode = "401", content = @Content),
                @ApiResponse(description = "Internal Server Error.", responseCode = "500", content = @Content)
        }
    )
    public List<EmailVO> findAll() {
        return service.findAll();
    }

    // READ - HTTP GET
    // Endpoint: http://localhost:8080/api/v1/email/ID
    @GetMapping("/{id}")
    @Operation(summary = "Find Emails by ID", description = "Find Emails by ID",
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = {
                                    @Content(mediaType = MediaTypes.APPLICATION_JSON,
                                            schema = @Schema(implementation = EmailVO.class)
                                    )
                            }
                    ),
                    @ApiResponse(description = "Not Found.", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Bad Request.", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized.", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Internal Server Error.", responseCode = "500", content = @Content)
            }
    )
    public EmailVO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    // CREATE - HTTP POST
    // Endpoint: http://localhost:8080/api/v1/email
    @PostMapping
    @Operation(summary = "Create Emails", description = "Create Emails",
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200",
                            content = {
                                    @Content(mediaType = MediaTypes.APPLICATION_JSON,
                                            schema = @Schema(implementation = EmailVO.class)
                                    )
                            }
                    ),
                    @ApiResponse(description = "Not Found.", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Bad Request.", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized.", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Internal Server Error.", responseCode = "500", content = @Content)
            }
    )
    public EmailVO save(@RequestBody EmailVO emailVO) {
        return service.save(emailVO);
    }

    // UPDATE - HTTP PUT
    // Endpoint: http://localhost:8080/api/v1/email
    @PutMapping
    @Operation(summary = "Update Emails", description = "Update Emails",
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200"),
                    @ApiResponse(description = "Not Found.", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Bad Request.", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized.", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Internal Server Error.", responseCode = "500", content = @Content)
            }
    )
    public EmailVO update(@RequestBody EmailVO emailVO) {
        return service.update(emailVO);
    }

    // DELETE - HTTP DELETE
    // Endpoint: http://localhost:8080/api/v1/email/ID
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete Email by ID", description = "Delete Email by ID",
            responses = {
                    @ApiResponse(description = "Success", responseCode = "200"),
                    @ApiResponse(description = "Not Found.", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Bad Request.", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized.", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Internal Server Error.", responseCode = "500", content = @Content)
            }
    )
    public String delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}