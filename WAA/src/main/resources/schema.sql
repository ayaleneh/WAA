CREATE TABLE IF NOT EXISTS comment (
                                       id SERIAL PRIMARY KEY,
                                       name VARCHAR(255) NOT NULL
    );
CREATE TABLE IF NOT EXISTS post (
                                       id SERIAL PRIMARY KEY,
                                       title VARCHAR(255) NOT NULL,
                                       content VARCHAR(255) NOT NULL,
                                      author VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS userP (
                                       id SERIAL PRIMARY KEY,
                                       name VARCHAR(255) NOT NULL
    );

CREATE TABLE logger (
                        id SERIAL PRIMARY KEY,
                        transaction_id VARCHAR(255),
                        operation VARCHAR(255),
                        date DATE,
                        time TIME,
                        principle VARCHAR(255),
                        additional_info VARCHAR(255)
);
