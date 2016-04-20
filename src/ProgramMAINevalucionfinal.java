import java.util.HashSet;
import java.util.Iterator;
public class ProgramMAINevalucionfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//se crean las personas
		
		System.out.println("Bienvenido a la tabla de registro y control de personal, negocio y actidodes de la empresa  ");
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		Persona p5 = new Persona();
		
		p1.setNombrep("Manuel Castro");
		p1.setTelefonop("3171236784");
		p1.setCorreoelectronicop("Manuelc@hotmail.com");
		
		p2.setNombrep("Ana Perez");
		p2.setTelefonop("6758934");
		p2.setCorreoelectronicop("Ana@hotmail.com");
		
		p3.setNombrep("Pepe Moreno");
		p3.setTelefonop("3134567892");
		p3.setCorreoelectronicop("pepeM@hotmail.com");
		
		p4.setNombrep("Julieta Mora");
		p4.setTelefonop("3156782345");
		p4.setCorreoelectronicop("julietamma@hotmail.com");
		
		p5.setNombrep("Julian Rios");
		p5.setTelefonop("5436789");
		p5.setCorreoelectronicop("julian.rios@hotmail.com");
		
		// se crean las organizaciones
				Organizacion o1 = new Organizacion();
				Organizacion o2 = new Organizacion();
				Organizacion o3 = new Organizacion();
				
				o1.setNombreo("Paz del rio");
				o1.setTelefonoo("317345678");
				o1.setDirecciono("Carrera 23 n 34-56");
				
				o2.setNombreo("Julio Nieto");
				o2.setTelefonoo("7653412");
				o2.setDirecciono("Carrera 23 n 34-56");
				
				o3.setNombreo("JVC");
				o3.setTelefonoo("3189875432");
				o3.setDirecciono("Carrera 27 n 38-36");
				
		//Se crean los negocios
				
		Negocio n1 = new Negocio();
		Negocio n2 = new Negocio();
		
		n1.setDescripcionnegocio(" Montaje de plataforma ");
		n1.setEstado(" Iniciado ");
		n1.setFechaestimadadecierre(" 24/ 04 / 2017 ");
		n1.setNombreo("Paz del rio");
		n1.setNombrep("Manuel Castro");
		n1.setvalor(300000);
		n1.setTitulo(" Movistar ");
		
		n2.setDescripcionnegocio(" Cambio de canal 3GSM");
		n2.setEstado(" Inicido ");
		n2.setFechaestimadadecierre(" 26/ 07 / 2018 ");
		n2.setNombreo("Julio Nieto");
		n2.setNombrep("Manuel Castro");
		n2.setvalor(444500000);
		n2.setTitulo(" Claro colombia ");
	
		//Se crean los negocios
		
		Actividad a1 = new Actividad ();
		
		a1.setDescripcionactividad(" Partido entre contabilidad y tesoreria ");
		a1.setDuracion(" 2 horas ");
		a1.setFechadeactividad(" 24/05/ 2016 ");
		a1.setHora(" 10 : 30 ");
		a1.setTipo(" Juego de futboll  ");
		a1.setNombreN(" Claro colombia ");
		a1.setNombreO(" Julio Nieto ");
		a1.setNombreP(" Manuel Castro ");
		
		//Aplicacion de HashSet para personas y organizaciones.
	
    HashSet<Persona>personas = new HashSet<Persona>();
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		
		
		System.out.println("Personas  registradas  " + personas.size());
		
		for(Iterator<Persona> it2 = personas.iterator(); it2.hasNext();){
		Persona p = it2.next();
		System.out.println(p.getNombrep() +"   " + p.getTelefonop()+"   "+p.getCorreoelectronicop());
		}
		
		HashSet<Organizacion> organizaciones = new HashSet<Organizacion>();

        organizaciones.add(o1);
        organizaciones.add(o2);
        organizaciones.add(o3);
        
		System.out.println("Organizaciones registradas  " + organizaciones.size());
		
		for(Iterator<Organizacion> it = organizaciones.iterator(); it.hasNext();){
		Organizacion o = it.next();
		System.out.println(o.getNombreo() +"   " + o.getTelefonoo()+"   "+o.getDirecciono());
		}
		// Se aplica HashSet para negocios.
		
      HashSet<Negocio>negocios = new HashSet<Negocio>();
		
      negocios.add(n1);
      negocios.add(n2);

		
		
		System.out.println("Los negocios  registrados son:   " + negocios.size());
		
		for(Iterator<Negocio> it3 = negocios.iterator(); it3.hasNext();){
			Negocio n = it3.next();
		System.out.println(n.getDescripcionnegocio() +"   " +n.getEstado()+
				"   "+n.getFechaestimadadecierre()+"   "+n.getNombreo()+"   "+n.getNombrep()+
				"   "+n.getTitulo()+"   "+n.getValor());
		}
		
		// Se aplica HashSet para Actividades.
		
		HashSet<Actividad>actividades = new HashSet<Actividad>();
		
		actividades.add(a1);
		

			
			
			System.out.println("Las Actividades  registrados son:   " + actividades.size());
			
			for(Iterator<Actividad> it4 = actividades.iterator(); it4.hasNext();){
				Actividad a = it4.next();
			System.out.println(a.getDescripcionactividad() +"    "+ a.getTipo() +"   "+ a.getDuracionr()+
					"   "+ a.getFechadeactividad()+ "   "+ a.getHora()+ "   "+ a.getNombreO()+
					"   "+ a.getNombreP()+ "   "+ a.getNombreN());
			}
		
	}

}
