insert into localidad(denominacion) VALUES
 ('Guaymallen'),
 ('Godoy Cruz'),
 ('Maipu'),
 ('Mendoza Capital');

insert into domicilio(calle, numero, fk_localidad) VALUES
 ('Bolivia', 750, 1),
 ('Gomensoro', 1290, 1),
 ('Palma', 170, 3),
 ('Tucuman', 653, 2),
 ('Rodriguez', 1330, 4);

insert into cliente (apellido, dni, email, nombre, domicilio_id) values
    ('Valente', 43879642, 'ignavalente@gmail.com', 'Ignacio', 1),
    ('Lucero', 42758691, 'faculu0@gmail.com', 'Facundo', 4),
    ('Rojas', 43560177, 'junrojaas@gmail.com', 'Juan', 3),
    ('Yanzon', 43669820, 'jsonfacu@gmail.com', 'Facundo', 5),
    ('Lopez', 43119072, 'gonzalopez@gmail.com', 'Gonzalo', 2);

insert into categoria(descripcion, nombre) VALUES
 ('Para mantener el agua caliente', 'Termo'),
 ('Recipiente donde se preparan los amargos', 'Mate'),
 ('Recipiente para Azucar, Yerba, y otras especias', 'Frasco'),
 ('Para eliminar el Polvo antes de preparar el Mate', 'Despolvillador'),
 ('Tubito de metal o cañita utilizada para beber la infusión denominada mate', 'Bombilla'),
 ('Especie de Mochila para transportar todos los elementos para preparar unos ricos Mateicos', 'Matera');

insert into producto(cantidad, descripcion, nombre, precio, fk_categoria) VALUES
 (3, 'Mate de madera boca chica', 'Poronguito Alamo', 600, 2),
 (2, 'Mate de plástico verde boca chica', 'Poronguito verde plástico', 450, 2),
 (3, 'Mate de plástico negro boca chica', 'Poronguito negro plástico', 475, 2),
 (5, 'Termo de Aluminio L', 'Aluminium', 1400, 1),
 (1, 'Termo de Aluminio M', 'Aluminium Medio', 1200, 1),
 (6, 'Despolvillador de Plástico rojo',' Despolvillador rojo', 450, 4),
 (2, 'Matera de cuero, con refuerzo en las manijas', 'Cuero Matera', 2500, 6),
 (8, 'Bombilla de acero inoxidable, con boca chata', 'Bombilla Boca Chata', 300, 5),
 (1, 'Frasco de vidrio Durex', 'Yerbero vidrio', 1100, 3);