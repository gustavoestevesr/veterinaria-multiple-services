package com.veterinaria.tutorms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.veterinaria.tutorms.compartilhado.TutorDTO;
import com.veterinaria.tutorms.model.Tutor;
import com.veterinaria.tutorms.repository.TutorRepository;

@Service
public class TutorServiceImpl implements TutorService {

    private final TutorRepository tutorRepository;

    ModelMapper mapper = new ModelMapper();

    public TutorServiceImpl(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    @Override
    public TutorDTO salvarTutor(TutorDTO tutorDTO) {
        Tutor tutor = mapper.map(tutorDTO, Tutor.class);
        tutorRepository.save(tutor);
        return mapper.map(tutor, TutorDTO.class);
    }

    @Override
    public Optional<TutorDTO> obterTutorPorID(String id) {
        Optional<Tutor> tutor = tutorRepository.findById(id);

        if (tutor.isPresent()) {
            TutorDTO tutorDto = mapper.map(tutor, TutorDTO.class);
            return Optional.of(tutorDto);
        }

        return Optional.empty();
    }

    @Override
    public List<TutorDTO> obterTodosTutores() {
        List<Tutor> tutores = tutorRepository.findAll();
        return tutores.stream()
                .map(t -> mapper.map(tutores, TutorDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public TutorDTO atualizarTutor(String id, TutorDTO tutorDTO) {
        Tutor tutor = mapper.map(tutorDTO, Tutor.class);
        tutor.setId(id);
        tutor = tutorRepository.save(tutor);
        return mapper.map(tutor, TutorDTO.class);
    }

    @Override
    public void removerTutor(String id) {
        tutorRepository.deleteById(id);
    }

}
