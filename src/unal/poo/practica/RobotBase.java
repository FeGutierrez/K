package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
        public static void halfRound(){
            for(int i=0; i<2; i++){
                estudiante.turnLeft();
            }
        }
        public static void turnRight(){
            for(int i=0; i<3; i++){
                estudiante.turnLeft();
            }
        }
        
        public static void sprint(int x){
            for (int i=0 ; i<x ; i++){
                estudiante.move();
            }
        }
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            
        
                     
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,10);
            
            //Movimiento del robot para rodear el muro cuadrado y retornar a su posicion inicial
            /*estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();*/
            
            
            //Movimiento del robot para recoger el periódico
            /*boolean puedeTomar = estudiante.canPickThing();
            if(puedeTomar == true)
               estudiante.pickThing();
            turnRight();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.pickThing();
            halfRound();
            estudiante.move();
            turnRight();
            estudiante.move();
            turnRight();
            estudiante.move();
            turnRight();*/
            
            //Movimiento Espiral del robot
            sprint(5);
            turnRight();
            sprint(5);
            turnRight();
            
            sprint(4);
            turnRight();
            sprint(4);            
            turnRight();
            
            sprint(3);
            turnRight();
            sprint(3);            
            turnRight();
            
            sprint(2);
            turnRight();
            sprint(2);
            turnRight();
            
            estudiante.move();
            turnRight();
            estudiante.move();
            
            
            
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            
            //estudiante.move();
            
            //Girar a la izquierda
            //estudiante.turnLeft();
            
            //Tomando decisiones, Si puedo tomar un Thing
            //boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            /*if(puedeTomar == true)
               estudiante.pickThing();*/
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            //int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            //estudiante.putThing();
                       
            //Si el frente esta libre de Wall
            //estudiante.frontIsClear();
            
            //Invocando una funcion
            //creacionFuncion(4);
            
            //Toman un Thing
            //estudiante.pickThing();
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

