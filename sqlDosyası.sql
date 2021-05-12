SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: kullanicilar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kullanicilar (
    "kullaniciAdi" character varying DEFAULT '20'::character varying,
    sifre character varying DEFAULT '20'::character varying,
    yetki boolean DEFAULT true NOT NULL
);


ALTER TABLE public.kullanicilar OWNER TO postgres;

--
-- Data for Name: kullanicilar; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.kullanicilar VALUES
	('enesvrdr16', '12345678', true),
	('saü', '12345', false),
	('bbf2', '123456', true),
	('admin', 'admin', true),
	('asd', 'asd', true);


--
-- Name: kullanicilar unique_kullanicilar_kullaniciAdi; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanicilar
    ADD CONSTRAINT "unique_kullanicilar_kullaniciAdi" UNIQUE ("kullaniciAdi");


--
-- PostgreSQL database dump complete
--

