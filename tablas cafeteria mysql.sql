CREATE TABLE `Categorias` (
  `id` integer PRIMARY KEY,
  `nombre` varchar(100)
);

CREATE TABLE `Productos` (
  `id` integer PRIMARY KEY,
  `nombre` varchar(100),
  `precio` decimal(6,2),
  `Categorias_id` integer
);

ALTER TABLE `Productos` ADD FOREIGN KEY (`Categorias_id`) REFERENCES `Categorias` (`id`);
