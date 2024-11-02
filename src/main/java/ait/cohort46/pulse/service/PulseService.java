package ait.cohort46.pulse.service;

import ait.cohort46.pulse.dto.PulseDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Supplier;

@Service
public class PulseService {
    private Random random = new Random();
    private int minId = 1;
    private int maxId = 10;
    private int minPulse = 1;
    private int maxPulse = 200;

    @Bean
    Supplier<PulseDto> sendData() {
        return () -> {
            int id = random.nextInt(minId, maxId);
            int payload = random.nextInt(minPulse, maxPulse);
            return new PulseDto(id, System.currentTimeMillis(), payload);
        };
    }
}
