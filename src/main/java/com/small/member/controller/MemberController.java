package com.small.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/members")
public class MemberController {

  @GetMapping(path="/welcome")
  public void welcome() {
    System.out.println("members/welcome");
  }
}