DROP TABLE IF EXISTS cocktail_ingredient;
DROP TABLE IF EXISTS ingredient;
DROP TABLE IF EXISTS cocktail;
DROP TABLE IF EXISTS category;

CREATE TABLE category (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE cocktail (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    starred BIT(1) NOT NULL DEFAULT 0,
    category_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE ingredient (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE cocktail_ingredient (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cocktail_id BIGINT NOT NULL,
    ingredient_id BIGINT NOT NULL,
    FOREIGN KEY (cocktail_id) REFERENCES cocktail(id) ON DELETE CASCADE,
    FOREIGN KEY (ingredient_id) REFERENCES ingredient(id) ON DELETE CASCADE,
    UNIQUE (cocktail_id, ingredient_id)
);
