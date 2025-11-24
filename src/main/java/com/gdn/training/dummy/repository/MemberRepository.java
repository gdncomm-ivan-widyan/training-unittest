package com.gdn.training.dummy.repository;

import com.gdn.training.dummy.entity.Member;

public interface MemberRepository {
  Member getMember(String id);
  Member save(Member member);
}
