ALTER TABLE books ADD COLUMN start_creation TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW();
ALTER TABLE users ADD COLUMN start_creation TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW();