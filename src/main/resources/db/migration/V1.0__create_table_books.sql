CREATE TABLE books (
	id BIGSERIAL PRIMARY KEY,
	description CHARACTER VARYING(255) NOT NULL,
	title CHARACTER VARYING(100) NOT NULL
);