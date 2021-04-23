DROP TABLE IF EXISTS bookstore;

CREATE TABLE bookstore (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(550) NOT NULL,
  author VARCHAR(50) NOT NULL,
  type VARCHAR(20) NOT NULL,
  price VARCHAR(250) NOT NULL,
  isbn VARCHAR(250) NOT NULL,
  promocode VARCHAR(150)
);

INSERT INTO bookstore VALUES
  (1, 'book1', 'book1', 'KPT', 0, '100', 'isbn-1', null);
