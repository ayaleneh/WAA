-- Insert sample data for User entity

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');
INSERT INTO users (id, email, firstname, lastname, password)
VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');
INSERT INTO users (id, email, firstname, lastname, password)
VALUES (3, 'dean@miu.edu', 'Dean', 'Altarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO roles (id, role)
VALUES (1, 'ADMIN');
INSERT INTO roles (id, role)
VALUES (2, 'CLIENT');

-- Insert sample data for Post entity
-- INSERT INTO "post" (id, title, author, content) VALUES (1, 'First Post', 'John Doe', 'This is my first post.');
-- INSERT INTO "post" (id, title, author, content) VALUES (2, 'Second Post', 'John Doe', 'This is my second post.');
-- INSERT INTO "post" (id, title, author, content) VALUES (3, 'Third Post', 'John Doe', 'This is my third post.');

INSERT INTO post (id, title, author, content) VALUES (1, 'First Post', 'John Doe', 'This is my first post.');
INSERT INTO post (id, title, author, content) VALUES (2, 'Second Post', 'John Doe', 'This is my second post.');
INSERT INTO post (id, title, author, content) VALUES (3, 'Third Post', 'John Doe', 'This is my third post.');


-- Insert sample data for Comment entity
-- INSERT INTO "comment" (id, name) VALUES (1, 'Comment 1');
-- INSERT INTO "comment" (id, name) VALUES (2, 'Comment 2');
-- INSERT INTO "comment" (id, name) VALUES (3, 'Comment 3');

INSERT INTO comment (id, name) VALUES (1, 'Comment 1');
INSERT INTO comment (id, name) VALUES (2, 'Comment 2');
INSERT INTO comment (id, name) VALUES (3, 'Comment 3');
