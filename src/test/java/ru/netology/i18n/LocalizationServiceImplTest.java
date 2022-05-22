package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LocalizationServiceImplTest {

    @Test
    void testLocale() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        when(mock(LocalizationServiceImpl.class).locale(Country.USA)).thenReturn("Welcome");
        when(mock(LocalizationServiceImpl.class).locale(Country.RUSSIA)).thenReturn("Добро пожаловать");

        assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
    }
}