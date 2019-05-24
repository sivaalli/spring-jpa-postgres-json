CREATE TABLE public.name
(
    id integer NOT NULL,
    node json,
    CONSTRAINT name_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;