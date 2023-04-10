-- Insert sample data for User entity
INSERT INTO userP (id, name) VALUES (1, 'John Doe');
INSERT INTO userP (id, name) VALUES (2, 'Jane Doe');

-- Insert sample data for Post entity
INSERT INTO "post" (id, title, author, content) VALUES (1, 'First Post', 'John Doe', 'This is my first post.');
INSERT INTO "post" (id, title, author, content) VALUES (2, 'Second Post', 'John Doe', 'This is my second post.');
INSERT INTO "post" (id, title, author, content) VALUES (3, 'Third Post', 'John Doe', 'This is my third post.');

-- Insert sample data for Comment entity
INSERT INTO "comment" (id, name) VALUES (1, 'Comment 1');
INSERT INTO "comment" (id, name) VALUES (2, 'Comment 2');
INSERT INTO "comment" (id, name) VALUES (3, 'Comment 3');
