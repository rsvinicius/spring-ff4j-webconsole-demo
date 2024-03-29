CREATE TABLE FF4J_AUDIT (
  EVT_UUID      VARCHAR(40)  NOT NULL,
  EVT_TIME      TIMESTAMP    NOT NULL,
  EVT_TYPE      VARCHAR(30)  NOT NULL,
  EVT_NAME      VARCHAR(100) NOT NULL,
  EVT_ACTION    VARCHAR(100) NOT NULL,
  EVT_HOSTNAME  VARCHAR(100) NOT NULL,
  EVT_SOURCE    VARCHAR(30)  NOT NULL,
  EVT_DURATION  INTEGER,
  EVT_USER      VARCHAR(30),
  EVT_VALUE     VARCHAR(100),
  EVT_KEYS      VARCHAR(255),
  PRIMARY KEY(EVT_UUID, EVT_TIME)
);
