package proyectos.hdp;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest {
    @Autowired RepositorioUsuario repo;

	@Test//por cada prueba se coloca esta anotación
	public void contextLoads() {
	}
        
        @Test
        public void Guardar(){
            Assert.assertEquals(4, 2+2);
            
            Usuario u=new Usuario();
            Posicion pos=new Posicion();
            Mensaje mensa=new Mensaje();
            
            //Generar un usuario con todos sus atributos, incluyendo un mensaje y una posición
            
        }
        
        @Test
        public void Actualizar(){
            Assert.assertEquals(4, 2+2);
        }
        
        @Test
        public void Borrar(){
            Assert.assertEquals(4, 2+2);
        }
        
        @Test
        public void BuscarTodos(){
            Assert.assertEquals(4, 2+2);
        }
        
        @Test
        public void BuscarPorId(){
            Assert.assertEquals(4, 2+2);
        }

}
