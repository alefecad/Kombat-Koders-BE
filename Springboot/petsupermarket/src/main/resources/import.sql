INSERT INTO rol (nombre,descripcion) VALUES ("admin","cliente");
INSERT INTO rol (nombre,descripcion) VALUES ("usuario","integrantes_kk");

INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Olivia Rivas", "Av. Insurgentes Sur 1234, Col. Del Valle", "123456789", "olivia@gmail.com", "contraseña1", "2000-01-01", "CDMX", "54909", 1,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Cynthia Rosales", "Av. Paseo de la Reforma 567, Col. Juárez", "123456780", "cynthia@hotmail.com", "contraseña2", "1999-02-02", "CDMX", "54909", 1,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Brayan Hernández", "Calle Durango 89, Col. Roma", "123456781", "brayan@gmail.com", "contraseña3", "1998-03-03", "CDMX", "54909", 1,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Mario Mata", "Av. Álvaro Obregón 456, Col. Condesa", "123456782", "mario@hotmail.com", "contraseña4", "1997-04-04", "CDMX", "54909", 1,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Miguel Ortega", "Calle Tamaulipas 678, Col. Hipódromo", "123456783", "miguel@gmail.com", "contraseña5", "1996-05-05", "CDMX", "54909", 1,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Alejandro Flores", "Av. Álvaro Obregón 789, Col. Roma Norte", "123456784", "alejandro@hotmail.com", "contraseña6", "1995-06-06", "CDMX", "54909", 1,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("María Pérez", "Av. Insurgentes Sur 2468, Col. Del Valle", "123456785", "maria@gmail.com", "contraseña7", "1994-07-07", "CDMX", "54909", 1,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Juan González", "Av. Universidad 345, Col. Narvarte", "123456786", "juan@hotmail.com", "contraseña8", "1993-08-08", "CDMX", "54909", 2,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Laura Martínez", "Calle Guadalajara 567, Col. Roma", "123456787", "laura@gmail.com", "contraseña9", "1992-09-09", "CDMX", "54909", 2,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Pedro Sánchez", "Av. Cuauhtémoc 456, Col. Roma Norte", "123456788", "pedro@hotmail.com", "contraseña10", "1991-10-10", "CDMX", "54909", 2,1);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Ana López", "Av. Chapultepec 1234, Col. Condesa", "123456789", "ana@gmail.com", "contraseña11", "1990-11-11", "CDMX", "54909", 2,0);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Diego Rodríguez", "Av. Álvaro Obregón 567, Col. Roma Norte", "123456790", "diego@hotmail.com", "contraseña12", "1989-12-12", "CDMX", "54909", 2,0);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Fernanda García", "Av. Insurgentes Sur 2468, Col. Del Valle", "123456791", "fernanda@gmail.com", "contraseña13", "1988-01-01", "CDMX", "54909", 2,0);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Carlos Martínez", "Av. Universidad 345, Col. Narvarte", "123456792", "carlos@hotmail.com", "contraseña14", "1987-02-02", "CDMX", "54909", 2,0);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Diana Rodríguez", "Calle Guadalajara 567, Col. Roma", "123456793", "diana@gmail.com", "contraseña15", "1986-03-03", "CDMX", "54909", 2,0);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Javier Sánchez", "Av. Cuauhtémoc 789, Col. Doctores", "123456794", "javier@hotmail.com", "contraseña16", "1985-04-04", "CDMX", "54909", 2,0);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Isabela Pérez", "Av. Chapultepec 1234, Col. Condesa", "123456795", "isabela@gmail.com", "contraseña17", "1984-05-05", "CDMX", "54909", 2,0);
INSERT INTO usuario (nombre, direccion, telefono, email, contraseña, fecha_nacimiento, ciudad, cp, rol_id,activo) VALUES ("Rodrigo García", "Av. Álvaro Obregón 567, Col. Roma Norte", "123456796", "rodrigo@hotmail.com", "contraseña18", "1983-06-06", "CDMX", "54909", 2,0);


INSERT INTO bolsa (fecha_compra, Usuario_id) VALUES ("2023-01-01", 1);
INSERT INTO bolsa (fecha_compra, Usuario_id) VALUES ("2023-01-01", 4);

INSERT INTO tipo_producto (tipo_producto) VALUES ("Alimento");
INSERT INTO tipo_producto (tipo_producto) VALUES ("Accesorios");
INSERT INTO tipo_producto (tipo_producto) VALUES ("Juguetes");

INSERT INTO categorias (nombre) VALUES ("Perro");
INSERT INTO categorias (nombre) VALUES ("Gato");

INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Science Diet Alimento para Perros", "Hills Science Diet Alimento para Perros Adultos con Receta de Harina de Cordero y Arroz Integral", "15 kg", 2000.00, 0, 5, "https://www.amazon.com.mx/Hills-Science-Diet-Advanced-alimento/dp/B009IXOFOC/ref=lp_12478588011_1_4?pf_rd_p=2e6393f5-b0da-469a-bb10-dff5f616611a&pf_rd_r=Z5M2DX71D9HT8FJYSPYA&pd_rd_r=ab274ca2-87b1-41f2-8b94-800f9dd2dd8d&pd_rd_wg=jfCz9&pd_rd_i=B009IXOFOC&psc=1&th=1", "Amazon", 1, 1);
INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Royal Canin", "Royal Canin Croquetas Para Razas Medianas, Medium Adult 25", "13.6 Kg", 1800.00, 10, 3, "https://www.amazon.com.mx/Royal-Croquetas-Medianas-Medium-empaque/dp/B00CITL9N8/ref=lp_12478588011_1_1?pf_rd_p=2e6393f5-b0da-469a-bb10-dff5f616611a&pf_rd_r=Z5M2DX71D9HT8FJYSPYA&pd_rd_r=ab274ca2-87b1-41f2-8b94-800f9dd2dd8d&pd_rd_wg=jfCz9&pd_rd_i=B00CITL9N8&psc=1&th=1", "Amazon", 1, 1);
INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Collar para gatos", "Airtag Collar para Gato, con Timbre y Hebilla de liberación automática de Seguridad", "1 unidad", 192.00, 0, 10, "https://m.media-amazon.com/images/I/61FtWMPLyCL._AC_SL1400_.jpg", "AZULDIMEN", 2, 2);
INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Collar para Gato con Moño 4", "Material suave y diseño elegante te permiten tener distintas opciones para vestir a tu gato según su personalidad.", "4 unidades", 179.00, 0, 8, "https://m.media-amazon.com/images/I/61drV7fBOpL._AC_.jpg", "Fastpet Collar", 2, 2);
INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Hills Science Diet Adult 1-6", "Alimento Premium para gatos", "7.2 kg", 1095.00, 0, 15, "https://m.media-amazon.com/images/I/817mX8hi-VL._AC_SL1500_.jpg", "Hills Science Diet", 1, 2);
INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Kisha", "Alimento Seco Gato Adulto, Natural", "12 Kg", 799.00, 0, 8, "https://m.media-amazon.com/images/I/41XmwctjaTL._AC_.jpg", "GrandPet", 1, 2);
INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Bola para gatos", "Juguete eléctrico para gatos es perfecto para que juegue tu gato.", "1 unidad", 152.00, 0, 18, "https://m.media-amazon.com/images/I/61LvVMGMgnL._AC_SL1500_.jpg", "Seasky", 3, 2);
INSERT INTO producto (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, tipo_producto_id, categorias_id) VALUES ("Juguete caña con ratón", "Juguete para gato en forma de caña de pescar elaborado con textiles naturales.", "1 unidad", 53.00, 0, 10, "https://m.media-amazon.com/images/I/71bGgo4QPSL._AC_SL1500_.jpg", "Seasky", 3, 2);


INSERT INTO bolsa_has_productos (cantidad,bolsa_id,producto_id) VALUES (1,1,1),(2,2,2);
