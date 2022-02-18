package kea.sem3.jwtdemo.repositories;

import kea.sem3.jwtdemo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//jpaRepo extender CRUDRepo
public interface MemberRepository extends JpaRepository<Member,String> {



}
