package com.prosubject.prosubject.backend.apirest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prosubject.prosubject.backend.apirest.controller.AdministradorController;
import com.prosubject.prosubject.backend.apirest.controller.AlumnoController;
import com.prosubject.prosubject.backend.apirest.model.Administrador;
import com.prosubject.prosubject.backend.apirest.model.Alumno;
import com.prosubject.prosubject.backend.apirest.model.Asignatura;
import com.prosubject.prosubject.backend.apirest.model.Authority;
import com.prosubject.prosubject.backend.apirest.model.Curso;
import com.prosubject.prosubject.backend.apirest.model.DBFile;
import com.prosubject.prosubject.backend.apirest.model.DiaSemana;
import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.model.Facultad;
import com.prosubject.prosubject.backend.apirest.model.Foro;
import com.prosubject.prosubject.backend.apirest.model.Grado;
import com.prosubject.prosubject.backend.apirest.model.Horario;
import com.prosubject.prosubject.backend.apirest.model.Profesor;
import com.prosubject.prosubject.backend.apirest.model.Rango;
import com.prosubject.prosubject.backend.apirest.model.Respuesta;
import com.prosubject.prosubject.backend.apirest.model.Universidad;
import com.prosubject.prosubject.backend.apirest.model.UserAccount;
import com.prosubject.prosubject.backend.apirest.repository.AdministradorRepository;
import com.prosubject.prosubject.backend.apirest.repository.AlumnoRepository;
import com.prosubject.prosubject.backend.apirest.repository.AsignaturaRepository;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;




@RunWith(SpringRunner.class)
@SpringBootTest
class ProsubjectBackendApirestApplicationTests {
	
     @Autowired
     private AdministradorRepository adminRep;
     
	 @Autowired
	 private AdministradorController adminController;
	 
	 @Autowired
	 private AlumnoRepository alumRep;
	 
	 @Autowired
	 private AlumnoController alumController;
	 
	 @Autowired
	 private AsignaturaRepository asigRep;
	 
	 @Autowired
	 private EspacioRepository espRep;
	
	
	@Test
    public void adminControllerTest() {
		assertThat(adminController).isNotNull();
    }
	
	//Administrador
	@Test
	public void findAdministradorByUserAccountIdTest() {
		String nombre = "Antonio";
		Long id = (long) 1;
		Administrador a = adminRep.findAdministradorByUserAccountId(id);
		assertEquals(a.getNombre(), nombre);
		
	}	
	
	//Probando sus getters and setters
	@Test
	public void GetterAndSetterAdministradorTest() {

		Administrador administrador = new Administrador();
		UserAccount useraccount = new UserAccount();
		administrador.setApellido1("Romero");
		administrador.setApellido2("Caceres");
		administrador.setNombre("Ana");
		administrador.setDni("47546251F");
		administrador.setTelefono("955792206");
		administrador.setUserAccount(useraccount);
		administrador.setEmail("anaromcac@alum.us.es");
		assertEquals(administrador.getApellido1(), "Romero");
		assertEquals(administrador.getApellido2(),"Caceres");
		assertEquals(administrador.getNombre(),"Ana");
		assertEquals(administrador.getDni(),"47546251F");
		assertEquals(administrador.getTelefono(),"955792206");
		assertEquals(administrador.getUserAccount(),useraccount);
		assertEquals(administrador.getEmail(),"anaromcac@alum.us.es");
		
	}
	
	//Alumno
		@Test
		public void alumControllerTest() {
			assertThat(alumController).isNotNull();
		}
		
		@Test
		public void GetterAndSetterAlumnosTest() {

			Alumno alumno = new Alumno();
			UserAccount useraccount = new UserAccount();
			alumno.setNombre("Blas");
			alumno.setApellido1("Infante");
			alumno.setApellido2("Garcia");
			alumno.setDni("47546250Y");
			alumno.setEmail("blasinfantegarcia@gmail.com");
			alumno.setTelefono("603552740");
			alumno.setUserAccount(useraccount);
			assertEquals(alumno.getUserAccount(),useraccount);
			assertEquals(alumno.getNombre(), "Blas");
			assertEquals(alumno.getApellido1(),"Infante");
			assertEquals(alumno.getApellido2(),"Garcia");
			assertEquals(alumno.getDni(),"47546250Y");
			assertEquals(alumno.getEmail(),"blasinfantegarcia@gmail.com");
			assertEquals(alumno.getTelefono(),"603552740");
			

		}
		
		@Test
		public void findAlumnoByUserAccountIdTest() {
			String nombre = "Fernando";
			Long id = (long) 28;
			Alumno aux  = alumRep.findAlumnoByUserAccountId(id);
			assertEquals(aux.getNombre(), nombre);
		}
	
		
		//Asignatura
		@Test
		public void findListaAsignaturasTest() {
			String uni = "Universidad de Sevilla";
			String facultad = "Escuela Técnica Superior de Ingeniería Informática";
			String grado = "Ingeniería del Software";
			String curso = "PRIMERO";
			List<Asignatura> res = asigRep.findListaAsignaturas(uni, facultad, grado, curso);
			assertThat(res).isNotEmpty();
			assertEquals(res.get(0).getNombre(),"Fundamentos de programación");
		}
		
		@Test
		public void GetterAndSetterAsignaturasTest() {

			Asignatura asignatura = new Asignatura();
			asignatura.setNombre("Fundamentos de la programación II");
			assertEquals(asignatura.getNombre(),"Fundamentos de la programación II");
			
			
			

		}
		
		//Curso
		@Test
		public void GetterAndSetterCursoTest() {
			Curso curso = new Curso();
			curso.setNombre("PRIMERO");
			assertEquals(curso.getNombre(),"PRIMERO");
			

			

		}
		
		//Espacios

		@Test
		public void GetterAndSetterEspacioTest() {
			
			
			Asignatura asignatura = new Asignatura();
			Foro foro = new Foro();
			Profesor profesor = new Profesor();
			Espacio espacio = new Espacio();
			espacio.setAsignatura(asignatura);
			espacio.setForo(foro);
			espacio.setProfesor(profesor);
			espacio.setPrecio(12.0);
			espacio.setDraftMode(0);
			assertEquals(espacio.getAsignatura(),asignatura);
			assertEquals(espacio.getForo(),foro);
			assertEquals(espacio.getProfesor(), profesor);
			assertEquals(espacio.getPrecio(),12.0);
			assertEquals(espacio.getDraftMode(),0);
		}
		

		@Test 
		public void findDisponiblesTest() {
			String uni = "Universidad de Sevilla";
			String facultad = "Escuela Técnica Superior de Ingeniería Informática";
			String grado = "Ingeniería del Software";
			String curso = "PRIMERO";
			String asignatura ="Fundamentos de programación";
			List<Espacio> res = espRep.findDisponibles(uni, facultad, grado, curso, asignatura);
			assertThat(res).isNotNull();
		
		}

		
		//Facultad
		
		@Test
		public void GetterAndSetterFacultadTest() {
			
			
			Facultad facultad = new Facultad();
			Universidad universidad = new Universidad();
			universidad.setNombre("Universidad de Cordoba");
			facultad.setNombre("Prueba facultad de Cordoba");
			facultad.setUniversidad(universidad);
			
			assertEquals(facultad.getNombre(),"Prueba facultad de Cordoba");
			assertEquals(facultad.getUniversidad(),universidad);
			assertEquals(universidad.getNombre(),"Universidad de Cordoba");
			
			
		}
		//Foro
		@Test
		public void GetterAndSetterForoTest() {
			
			
			Foro foro = new Foro();
			Date date = new Date();
			foro.setTitulo("Foro Fundamentos de programacion");
			foro.setFechaCreacion(date);
			assertEquals(foro.getTitulo(),"Foro Fundamentos de programacion");
			assertEquals(foro.getFechaCreacion(),date);
			
		}
		
		//Grado
		@Test
		public void GetterAndSetterGradoTest() {
			
			Grado grado = new Grado();
			Facultad facultad = new Facultad();
			grado.setNombre("Ingenieria del Software");
			grado.setNumerocursos(1L);
			grado.setFacultad(facultad);
			assertEquals(grado.getNombre(),"Ingenieria del Software");
			assertEquals(grado.getNumerocursos(),1L);
			assertEquals(grado.getFacultad(),facultad);
			
			
		}
		//Horario
		@Test
		public void GetterAndSetterHorarioTest() {
			
			Horario horario = new Horario();
			Espacio espacio = new Espacio();
			Date date = new Date();
			Date date2 = new Date();
			date2.after(date);
			horario.setCapacidad(1L);
			horario.setDia(DiaSemana.Viernes);
			horario.setEspacio(espacio);
			horario.setHoraInicio(date);
			horario.setHoraFin(date2);

			assertEquals(horario.getCapacidad(),1L);
			assertEquals(horario.getDia(),DiaSemana.Viernes);
			assertEquals(horario.getEspacio(),espacio);
			assertEquals(horario.getHoraInicio(),date);
			assertEquals(horario.getHoraFin(),date2);
			
			
			
		}
		//Profesor
		@Test
		public void GetterAndSetterProfesorTest() {
			
			Profesor profesor = new Profesor();
			UserAccount userAccount = new UserAccount();
			DBFile expediente = new DBFile();
			
			profesor.setUserAccount(userAccount);
			profesor.setNombre("Rodrigo");
			profesor.setApellido1("Rojas");
			profesor.setApellido2("Gutierrez");
			profesor.setDni("47546231T");
			profesor.setEmail("rodrojgut@alum.us.es");
			profesor.setTelefono("123456789");
			profesor.setTarifaPremium(true);
			//profesor.setExpedienteValidado(true);
			profesor.setExpendiente(expediente);
			assertEquals(profesor.getUserAccount(),userAccount);
			assertEquals(profesor.getNombre(),"Rodrigo");
			assertEquals(profesor.getApellido1(),"Rojas");
			assertEquals(profesor.getApellido2(),"Gutierrez");
			assertEquals(profesor.getDni(),"47546231T");
			assertEquals(profesor.getEmail(),"rodrojgut@alum.us.es");
			assertEquals(profesor.getTelefono(),"123456789");
			assertEquals(profesor.getTarifaPremium(),true);
		//	assertEquals(profesor.getExpedienteValidado(),true);
			assertEquals(profesor.getExpendiente(),expediente);
			
			
			
		}
			//Rango
				@Test
				public void GetterAndSetterRangoTest() {
					
					Rango rango = new Rango();
					Horario horario = new Horario();
					Alumno alumno = new Alumno();
					
					Date fechaInicio = new Date();
					Date fechaFin = new Date();
					fechaFin.after(fechaInicio);
					
					rango.setAlumno(alumno);
					rango.setHorario(horario);

					assertEquals(rango.getAlumno(),alumno);
					assertEquals(rango.getHorario(),horario);


		
					
					
				}
				//Respuesta
				@Test
				public void GetterAndSetterRespuestaTest() {
					
					Respuesta respuesta = new Respuesta();
					UserAccount userAccount= new UserAccount();
					Foro foro = new Foro();
					
					respuesta.setUser(userAccount);
					respuesta.setForo(foro);
					respuesta.setContenido("Hola tengo una duda..");
					respuesta.setCreacionRespuesta(new Date());
					
					assertEquals(respuesta.getUser(),userAccount);
					assertEquals(respuesta.getForo(),foro);
					assertEquals(respuesta.getContenido(),"Hola tengo una duda..");
					assertEquals(respuesta.getCreacionRespuesta(),new Date());
					
					
					
					
				}
				
				//Universidad
				@Test
				public void GetterAndSetterUniversidadTest() {
					
					Universidad universidad = new Universidad();

					
					universidad.setNombre("Universidad Pablo de Olavide");
					assertEquals(universidad.getNombre(),"Universidad Pablo de Olavide");

					
					
					
					
				}
				
				//UserAccount
				@Test
				public void GetterAndSetterUserAccountTest() {
					
					UserAccount userAccount = new UserAccount();
				
					userAccount.setAutoridad(Authority.ALUMNO);
					userAccount.setPassword("darkme23123123");
					userAccount.setUsername("aurelio");
					
					
					assertEquals(userAccount.getAutoridad(),Authority.ALUMNO);
					assertEquals(userAccount.getPassword(),"darkme23123123");
					assertEquals(userAccount.getUsername(),"aurelio");

					
					
					
					
				}

}
