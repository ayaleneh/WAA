-- Insert sample data for User entity
INSERT INTO user (id, name) VALUES (1, 'John Doe');
INSERT INTO user (id, name) VALUES (2, 'Jane Doe');

-- Insert sample data for Post entity
INSERT INTO post (id, title, author, content, user_id) VALUES (1, 'First Post', 'John Doe', 'This is my first post.', 1);
INSERT INTO post (id, title, author, content, user_id) VALUES (2, 'Second Post', 'Jane Doe', 'This is my second post.', 2);
INSERT INTO post (id, title, author, content, user_id) VALUES (3, 'Third Post', 'John Doe', 'This is my third post.', 1);

-- Insert sample data for Comment entity
INSERT INTO comment (id, name) VALUES (1, 'Comment 1');
INSERT INTO comment (id, name) VALUES (2, 'Comment 2');
INSERT INTO comment (id, name) VALUES (3, 'Comment 3');

-- Create a relation between Post and Comment entities
INSERT INTO post_comment (post_id, comment_id) VALUES (1, 1);
INSERT INTO post_comment (post_id, comment_id) VALUES (2, 2);
INSERT INTO post_comment (post_id, comment_id) VALUES (3, 3);
