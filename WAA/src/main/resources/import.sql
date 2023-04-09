CREATE TABLE "user" ( id int, name varchar(255) );
-- Insert sample data for User entity
INSERT INTO "user" (id, name) VALUES (1, 'John Doe');
INSERT INTO "user" (id, name) VALUES (2, 'Jane Doe');

CREATE TABLE "post" (
                         id int,
                         title varchar(255),
                         author varchar(255),
                         content varchar(255),
                         user_id varchar(255)
);
-- Insert sample data for Post entity"user"
INSERT INTO "post" (id, title, author, content, user_id) VALUES (1, 'First Post', 'John Doe', 'This is my first post.', 1);
INSERT INTO "post" (id, title, author, content, user_id) VALUES (2, 'Second Post', 'Jane Doe', 'This is my second post.', 2);
INSERT INTO "post" (id, title, author, content, user_id) VALUES (3, 'Third Post', 'John Doe', 'This is my third post.', 1);
CREATE TABLE "comment" ( id int, name varchar(255) );
-- Insert sample data for Comment entity
INSERT INTO "comment" (id, name) VALUES (1, 'Comment 1');
INSERT INTO "comment" (id, name) VALUES (2, 'Comment 2');
INSERT INTO "comment" (id, name) VALUES (3, 'Comment 3');

CREATE TABLE "post_comment" ( post_id int, comment_id varchar(255) );
-- Create a relation between Post and Comment entities
INSERT INTO post_comment (post_id, comment_id) VALUES (1, 1);
INSERT INTO post_comment (post_id, comment_id) VALUES (2, 2);
INSERT INTO post_comment (post_id, comment_id) VALUES (3, 3);
