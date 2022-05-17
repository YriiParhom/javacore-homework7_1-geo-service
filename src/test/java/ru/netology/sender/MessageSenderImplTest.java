package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationServiceImpl;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;


class MessageSenderImplTest {

    @Test
    public void sendTest() {

        GeoServiceImpl geoService = Mockito.mock(GeoServiceImpl.class);
        geoService.byIp(anyString());

        LocalizationServiceImpl localizationService = Mockito.mock(LocalizationServiceImpl.class);
        localizationService.locale(Country.RUSSIA);

        MessageSenderImpl messageSender = new MessageSenderImpl(geoService, localizationService);
        Map<String, String> header = new HashMap<>();
        header.put(MessageSenderImpl.IP_ADDRESS_HEADER, anyString());

        String expected = localizationService.locale(Country.RUSSIA);

        Assertions.assertEquals(expected, messageSender.send(header));

    }
}