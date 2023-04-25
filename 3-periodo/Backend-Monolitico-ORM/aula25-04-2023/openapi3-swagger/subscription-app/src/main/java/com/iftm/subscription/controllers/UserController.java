package com.iftm.subscription.controllers;

import com.iftm.subscription.data.vo.UserVO;
import com.iftm.subscription.services.UserService;
import com.iftm.subscription.utils.MediaTypes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@Tag(name = "user", description = "Endpoints for managing users.")
public class UserController {

    @Autowired
    private UserService service;

    // READ - HTTP GET
    // Endpoint: http://localhost:8080/api/v1/user
    @GetMapping
    @Operation(
            summary = "Find All Users", description = "Find All Users", tags = {"user"},
            responses = {
                @ApiResponse(description = "Success.", responseCode = "200",
                    content = {
                        @Content(mediaType = MediaTypes.APPLICATION_JSON,
                            array = @ArraySchema(schema = @Schema(implementation = UserVO.class))
                        )
                    }
                ),
                @ApiResponse(description = "Not Found.", responseCode = "404", content = @Content),
                @ApiResponse(description = "Bad Request.", responseCode = "400", content = @Content),
                @ApiResponse(description = "Unauthorized.", responseCode = "401", content = @Content),
                @ApiResponse(description = "Internal Server Error.", responseCode = "500", content = @Content)
            }

    )
    public List<UserVO> findAll() {
        return service.findAll();
    }

    // READ - HTTP GET
    // Endpoint: http://localhost:8080/api/v1/user/ID
    @GetMapping("/{id}")
    public UserVO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    // USERS BY GROUP NAME - HTTP GET
    // Endpoint: http://localhost:8080/api/v1/user/group/NOME_DO_GRUPO
    @GetMapping("group/{name}")
    public List<UserVO> findUsersByGroupName(@PathVariable("name") String groupName) {
        return service.findByGroupName(groupName);
    }

    // CREATE - HTTP POST
    // Endpoint: http://localhost:8080/api/v1/user
    @PostMapping
    public UserVO save(@RequestBody UserVO userVO) {
        return service.save(userVO);
    }

    // UPDATE - HTTP PUT
    // Endpoint: http://localhost:8080/api/v1/user
    @PutMapping
    public UserVO update(@RequestBody UserVO userVO) {
        return service.update(userVO);
    }

    // DELETE - HTTP DELETE
    // Endpoint: http://localhost:8080/api/v1/user/ID
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
