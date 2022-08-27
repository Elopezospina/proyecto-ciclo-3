CREATE TABLE `inmueble` (
	`id_inmueble` INT(11) NOT NULL,
	`tipo_inmueble` VARCHAR(100) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`costo_alquiler` INT(13) NOT NULL,
	`ciudad_i` VARCHAR(100) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`comuna` VARCHAR(100) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	PRIMARY KEY (`id_inmueble`) USING BTREE,
	CONSTRAINT `FK_arrendatario` FOREIGN KEY (`id_inmueble`) REFERENCES `inmueble_alquiler`.`arrendatario` (`id_arrendatario`) ON UPDATE RESTRICT ON DELETE RESTRICT,
	CONSTRAINT `FK_cliente` FOREIGN KEY (`id_inmueble`) REFERENCES `inmueble_alquiler`.`cliente` (`id_cliente`) ON UPDATE RESTRICT ON DELETE RESTRICT
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
