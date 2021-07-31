package dev.victorugons.accesscontrol.exception;

import dev.victorugons.accesscontrol.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
