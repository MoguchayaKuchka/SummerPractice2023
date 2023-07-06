create table public.news
(
    id         bigint generated by default as identity
        constraint news_pk
            primary key,
    topic      varchar,
    heading    varchar,
    body       varchar,
    url        varchar,
    date       varchar,
    source_url varchar
);

create table public.comments
(
    id      bigint generated by default as identity
        constraint comments_pk
            primary key,
    author  varchar,
    body    varchar,
    news_id bigint
        constraint comments_news_id_fk
            references public.news
);