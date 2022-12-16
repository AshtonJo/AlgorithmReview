package com.leekimcho.guestservice.client;


import com.leekimcho.guestservice.dto.MemberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="member-service")
public interface ServiceClient {
    @GetMapping(value = "/api/member-service/member-context", consumes="application/json")
    MemberDto getMemberContext(@RequestBody String email);
}
