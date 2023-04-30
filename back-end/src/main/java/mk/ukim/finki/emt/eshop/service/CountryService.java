package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.Country;
import mk.ukim.finki.emt.eshop.model.dto.CountryDto;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();

    Country getCountryById(Long country);

    Country addCountry(CountryDto country);

    Country editCountry(Long id, CountryDto country);

    void deleteCountry(Long id);
}
