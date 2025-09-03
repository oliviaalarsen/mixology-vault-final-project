-- Categories
INSERT INTO category (id, name) VALUES 
(1, 'Classics'),
(2, 'Modern');

-- Cocktails
INSERT INTO cocktail (id, name, description, category_id, starred) VALUES
(1, 'Old Fashioned', 'A classic bourbon cocktail with bitters and sugar.', 1, false),
(2, 'Margarita', 'Tequila, lime juice, and triple sec served over ice.', 1, false),
(3, 'Espresso Martini', 'Vodka, coffee liqueur, and espresso — shaken cold.', 2, false),
(4, 'Cosmopolitan', 'Vodka, triple sec, cranberry juice, and lime juice.', 2, false),
(5, 'French 75', 'Gin, Champagne, lemon juice, and sugar.', 1, false),
(6, 'Aperol Spritz', 'Aperol, Prosecco, and soda water served over ice.', 2, false),
(7, 'Moscow Mule', 'Vodka, ginger beer, and lime juice served in a copper mug.', 1, false);

-- Ingredients
INSERT INTO ingredient (id, name) VALUES
(1, 'Bourbon'),
(2, 'Bitters'),
(3, 'Sugar'),
(4, 'Tequila'),
(5, 'Lime Juice'),
(6, 'Triple Sec'),
(7, 'Vodka'),
(8, 'Coffee Liqueur'),
(9, 'Espresso'),
(10, 'Cranberry Juice'),
(11, 'Gin'),
(12, 'Champagne'),
(13, 'Aperol'),
(14, 'Prosecco'),
(15, 'Soda Water'),
(16, 'Ginger Beer');

-- Cocktail-Ingredient Links

-- Old Fashioned
INSERT INTO cocktail_ingredient (cocktail_id, ingredient_id) VALUES
(1, 1), (1, 2), (1, 3);

-- Margarita
INSERT INTO cocktail_ingredient (cocktail_id, ingredient_id) VALUES
(2, 4), (2, 5), (2, 6);

-- Espresso Martini
INSERT INTO cocktail_ingredient (cocktail_id, ingredient_id) VALUES
(3, 7), (3, 8), (3, 9);

-- Cosmopolitan
INSERT INTO cocktail_ingredient (cocktail_id, ingredient_id) VALUES
(4, 7), (4, 6), (4, 10), (4, 5);

-- French 75
INSERT INTO cocktail_ingredient (cocktail_id, ingredient_id) VALUES
(5, 11), (5, 12), (5, 5), (5, 3);

-- Aperol Spritz
INSERT INTO cocktail_ingredient (cocktail_id, ingredient_id) VALUES
(6, 13), (6, 14), (6, 15);

-- Moscow Mule
INSERT INTO cocktail_ingredient (cocktail_id, ingredient_id) VALUES
(7, 7), (7, 16), (7, 5);
