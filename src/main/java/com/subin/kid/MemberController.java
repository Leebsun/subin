package com.subin.kid;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.subin.member.MemberDTO;
import com.subin.member.MemberService;

@Controller
@RequestMapping(value="/member/*")
public class MemberController {
	
	@Inject
	MemberService memberService;
	
	@RequestMapping(value="memberJoin", method=RequestMethod.GET)
	public String memberJoin()throws Exception{
		return "member/memberJoin";
	}
	
	@RequestMapping("/memberJoinSucess")
	public String memberJoinSucess(MemberDTO memberDTO,Model model) throws Exception{
		
		int resultCnt = memberService.memberJoin(memberDTO);
		String result="";
		
		if(resultCnt==0){
			result="failure";
		}else{
			result="success";
		}
		
		model.addAttribute("result", result);
		model.addAttribute("memberDTO", memberDTO);
		
		return "member/memberJoinCompleted";
		
	}

}

