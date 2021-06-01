package com.bootcampsantander.SantanderBootcamp.exceptions;

import com.bootcampsantander.SantanderBootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
