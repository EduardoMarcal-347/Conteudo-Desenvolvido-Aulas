package com.iftm.subscription.controllers;

import com.iftm.subscription.data.vo.GroupVO;
import com.iftm.subscription.data.vo.UserVO;
import com.iftm.subscription.services.GroupService;
import com.iftm.subscription.utils.MediaTypes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/group")
public class GroupController {

    @Autowired
    GroupService service;

    // READ - HTTP GET
    // Endpoint: http://localhost:8080/api/v1/group
    @GetMapping
    @Operation(summary = "Find All Groups", description = "Find All Groups",
        responses = {
                @ApiResponse(description = "Not Found.", responseCode = "404", content = @Content),
                @ApiResponse(description = "Bad Request.", responseCode = "400", content = @Content),
                @ApiResponse(description = "Unauthorized.", responseCode = "401", content = @Content),
                @ApiResponse(description = "Internal Server Error.", responseCode = "500", content = @Content)
        }
    )
    public List<GroupVO> findAll() {
        return service.findAll();
    }

    // READ - HTTP GET
    // Endpoint: http://localhost:8080/api/v1/group/ID
    @GetMapping("/{id}")
    public GroupVO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    // CREATE - HTTP POST
    // Endpoint: http://localhost:8080/api/v1/group
    @PostMapping
    public GroupVO save(@RequestBody GroupVO groupVO) {
        return service.save(groupVO);
    }

    // INSERT USERS - HTTP POST
    // Endpoint: http://localhost:8080/api/v1/group/insert-users
    @PostMapping("insert-users")
    public GroupVO insertUsers(@RequestBody GroupVO groupVO) {
        return service.insertUsers(groupVO);
    }

    // UPDATE - HTTP PUT
    // Endpoint: http://localhost:8080/api/v1/group
    @PutMapping
    public GroupVO update(@RequestBody GroupVO groupVO) {
        return service.update(groupVO);
    }

    // DELETE - HTTP DELETE
    // Endpoint: http://localhost:8080/api/v1/group/ID
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
