package com.KoreaIT.example.JAM.session;

import com.KoreaIT.example.JAM.Member;

public class Session {
	public int loginedMemberId = -1;
	public Member loginedMember;
	
	public Session() {
		loginedMemberId = -1;
	}
}
