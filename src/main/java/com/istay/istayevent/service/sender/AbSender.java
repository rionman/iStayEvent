package com.istay.istayevent.service.util.sender;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

abstract class AbSender {

    public String getNationalPhoneNumber(String phone) {
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber()
                .setRawInput(phone)
                .setCountryCodeSource(Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN);

        String national = phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
        return national;
    }
}
