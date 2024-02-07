package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable //어딘가에 내장될 수 있다는 뜻
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) //reflect proxy
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
