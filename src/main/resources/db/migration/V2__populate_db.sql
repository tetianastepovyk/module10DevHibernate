INSERT INTO Client (name)
VALUES
  ('Anna Moore'),
  ('Ben Williams'),
  ('David Jackson'),
  ('Emma Garcia'),
  ('Jon Lewis'),
  ('Robert King'),
  ('Bob Jackson'),
  ('JEmily Lopez'),
  ('Max Snow'),
  ('Bill Musk');

INSERT INTO Planet (id, name)
VALUES
  ('MARS', 'Mars'),
  ('VEN', 'Venus'),
  ('EAR', 'Earth'),
  ('JUP', 'Jupiter'),
  ('NEP', 'Neptune');

INSERT INTO Ticket (created_at, client_id, from_planet_id, to_planet_id)
VALUES
  ('2023-06-28T13:00:10Z', 1, 'MARS', 'NEP'),
  ('2023-06-27T12:30:10Z', 2, 'VEN', 'JUP'),
  ('2023-06-26T11:20:10Z', 3, 'EAR', 'MARS'),
  ('2023-06-25T11:10:10Z', 4, 'JUP', 'VEN'),
  ('2023-06-24T10:11:10Z', 5, 'NEP', 'EAR'),
  ('2023-06-23T09:06:10Z', 1, 'VEN', 'EAR'),
  ('2023-06-22T08:25:10Z', 2, 'NEP', 'JUP'),
  ('2023-06-21T08:04:10Z', 3, 'MARS', 'NEP'),
  ('2023-06-20T07:30:10Z', 4, 'EAR', 'VEN'),
  ('2023-06-19T06:10:10Z', 5, 'JUP', 'MARS');