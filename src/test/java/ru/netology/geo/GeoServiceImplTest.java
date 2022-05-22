package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;


class GeoServiceImplTest {

    @Test
    void testByIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);
        Location expected1 = new Location("New York", Country.USA, null, 0);
        Location actual = geoService.byIp("172.");
        Location actual1 = geoService.byIp("96.");
        assertEquals(expected.getCountry(), actual.getCountry());
        assertEquals(expected1.getCountry(), actual1.getCountry());
    }
}
