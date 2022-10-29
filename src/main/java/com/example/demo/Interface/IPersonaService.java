
package com.example.demo.Interface;

import com.example.demo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Para traer una lista de personas
    public List<Persona> getPersona();
    
    //Para guardar un objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Para eliminar un objeto pero lo buscamos por ID
    public void deletePersona (Long id);
    
    //Para buscar una persona por ID
    public Persona findPersona(Long id);
}
