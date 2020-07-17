package ru.netology.sender;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.anyString;


class MessageSenderImplTest {

    @Test
    public void sendTest() {
        MessageSenderImpl messageSender = Mockito.mock(MessageSenderImpl.class);
        Map<String, String> map = new HashMap<>();
        map.put(MessageSenderImpl.IP_ADDRESS_HEADER, anyString());
        Mockito.when(messageSender.send(map))
                .thenReturn(anyString());
    }
}