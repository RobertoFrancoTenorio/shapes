class Casa
{
    //Variables de Instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    Circle ventana2;
    Triangle techo2;
    Square pared2;
    Square puerta2;
    //Constructor
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
    }
    
    void dibujate()
    {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
    }
    
    void acomodate()
    {
        //colocar los objetos en la posicion
        // que les corresponde
        techo.changeSize(100,120);
        techo.moveHorizontal(90);
        techo.changeColor("black");
        
        ventana.changeSize(40);
        ventana.moveHorizontal(100);
      
        pared.changeSize(100);
        pared.moveVertical(65);
        pared.moveHorizontal(32);
        pared.changeColor("green");
        
        puerta.changeSize(45);
        puerta.moveVertical(120);
        puerta.moveHorizontal(60);
        puerta.changeColor("red");
    }
}