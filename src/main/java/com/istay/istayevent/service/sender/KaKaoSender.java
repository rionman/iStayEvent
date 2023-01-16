package com.istay.istayevent.service.util.sender;


import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class KaKaoSender extends AbSender {

    public


    public boolean makeATalk(String url, String phone, Temp) {
        ATalkTemplateInfo.ATalkTemplateInfoBuilder aTalkTemplateInfoBuilder = ATalkTemplateInfo.builder();
        String nationalPhoneNumber = getNationalPhoneNumber(phone);
        aTalkTemplateInfoBuilder.nationalPhone(nationalPhoneNumber);



        return false;

    }





    @Getter
    @Builder
    private class ATalkTemplateInfo {
        private String pfId;
        private String from;
        private String templateId;
        private String text;
        private String nationalPhone;
    }


}
