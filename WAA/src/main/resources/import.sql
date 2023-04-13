-- Insert sample data for User entity
INSERT INTO "users" (id, name) VALUES (1, 'John Doe');
INSERT INTO "users" (id, name) VALUES (2, 'Jane Doe');

-- Insert sample data for Post entity
INSERT INTO "post" (id, title, author, content) VALUES (1, 'First Post', 'John Doe', 'This is my first post.');
INSERT INTO "post" (id, title, author, content) VALUES (2, 'Second Post', 'John Doe', 'This is my second post.');
INSERT INTO "post" (id, title, author, content) VALUES (3, 'Third Post', 'John Doe', 'This is my third post.');

-- Insert sample data for Comment entity
INSERT INTO "comment" (id, name) VALUES (1, 'Comment 1');
INSERT INTO "comment" (id, name) VALUES (2, 'Comment 2');
INSERT INTO "comment" (id, name) VALUES (3, 'Comment 3');



--Spring Security data--
-- INSERT INTO users (id, email, firstname, lastname, password)
-- VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
-- INSERT INTO users (id, email, firstname, lastname, password)
-- VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
-- INSERT INTO users (id, email, firstname, lastname, password)
-- VALUES (3, 'dean@miu.edu', 'Dean', 'Altarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
--
-- INSERT INTO role (id, role)
-- VALUES (1, 'ADMIN');
-- INSERT INTO role (id, role)
-- VALUES (2, 'CLIENT');
--
--
-- INSERT INTO users_roles (user_id, roles_id)
-- VALUES (1, 1);
-- INSERT INTO users_roles (user_id, roles_id)
-- VALUES (2, 1);
-- INSERT INTO users_roles (user_id, roles_id)
-- VALUES (3, 2);
--
-- INSERT INTO product (id, name, price, id_user)
-- VALUES (1, 'iPhone', 1200, 1);
-- INSERT INTO product (id, name, price, id_user)
-- VALUES (2, 'iPad', 900, 1);
-- INSERT INTO product (id, name, price, id_user)
-- VALUES (3, 'Pen', 5, 1);
