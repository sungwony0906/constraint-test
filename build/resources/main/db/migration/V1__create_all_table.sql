CREATE TABLE test.category_manager (
                                    `category_manager_id` bigint NOT NULL AUTO_INCREMENT,
                                    `name` varchar(255) NOT NULL,
                                    `phone_number` varchar(255) NOT NULL,
                                    PRIMARY KEY (`category_manager_id`)
);

CREATE TABLE test.member (
                          `member_id` bigint NOT NULL AUTO_INCREMENT,
                          `address` varchar(255) NOT NULL,
                          `name` varchar(255) NOT NULL,
                          PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE test.product_category (
                                    `product_category_id` bigint NOT NULL AUTO_INCREMENT,
                                    `name` varchar(255) NOT NULL,
                                    `category_manager_id` bigint NOT NULL,
                                    PRIMARY KEY (`product_category_id`),
                                    KEY `fk_pc_cmi` (`category_manager_id`),
                                    CONSTRAINT `fk_pc_cmi` FOREIGN KEY (`category_manager_id`) REFERENCES `category_manager` (`category_manager_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE test.product (
                           `product_id` bigint NOT NULL AUTO_INCREMENT,
                           `name` varchar(255) NOT NULL,
                           `price` double NOT NULL,
                           `product_category_id` bigint NOT NULL,
                           PRIMARY KEY (`product_id`),
                           KEY `fk_pd_pci` (`product_category_id`),
                           CONSTRAINT `fk_pd_pci` FOREIGN KEY (`product_category_id`) REFERENCES `product_category` (`product_category_id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE test.order_info (
                         `order_info_id` bigint NOT NULL AUTO_INCREMENT,
                         `member_id` bigint NOT NUll NULL,
                         `product_id` bigint NOT NUll NULL,
                         `amount` int NOT NULl NULL,
                         `total_order_amount` double NOT NULL,
                         PRIMARY KEY (`order_info_id`),
                         KEY `fk_pd_mi` (`member_id`),
                         CONSTRAINT `fk_pd_mi` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`),
                         KEY `fk_pd_pi` (`product_id`),
                         CONSTRAINT `fk_pd_pi` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;