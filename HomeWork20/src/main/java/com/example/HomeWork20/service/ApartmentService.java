package com.example.HomeWork20.service;

import com.example.HomeWork20.repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;
}
