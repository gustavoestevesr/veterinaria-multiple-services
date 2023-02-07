package com.veterinaria.tutorms.service;

import java.util.List;
import java.util.Optional;

import com.veterinaria.tutorms.compartilhado.TutorDTO;

public interface TutorService {
    public TutorDTO salvarTutor(TutorDTO tutorDTO);
    public Optional<TutorDTO> obterTutorPorID(String id);
    public List<TutorDTO> obterTodosTutores();
    public TutorDTO atualizarTutor(String id, TutorDTO tutorDTO);
    public void removerTutor(String id);
}
