package com.github.vertical_blank.sqlformatter.languages;

import com.github.vertical_blank.sqlformatter.core.AbstractFormatter;
import com.github.vertical_blank.sqlformatter.core.DialectConfig;
import com.github.vertical_blank.sqlformatter.core.FormatConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PostgreSqlFormatter extends AbstractFormatter {

  private static final List<String> reservedWords =
      Arrays.asList(
          "ABORT",
          "ABSOLUTE",
          "ACCESS",
          "ACTION",
          "ADD",
          "ADMIN",
          "AFTER",
          "AGGREGATE",
          "ALL",
          "ALSO",
          "ALTER",
          "ALWAYS",
          "ANALYSE",
          "ANALYZE",
          "AND",
          "ANY",
          "ARRAY",
          "AS",
          "ASC",
          "ASSERTION",
          "ASSIGNMENT",
          "ASYMMETRIC",
          "AT",
          "ATTACH",
          "ATTRIBUTE",
          "AUTHORIZATION",
          "BACKWARD",
          "BEFORE",
          "BEGIN",
          "BETWEEN",
          "BIGINT",
          "BINARY",
          "BIT",
          "BOOLEAN",
          "BOTH",
          "BY",
          "CACHE",
          "CALL",
          "CALLED",
          "CASCADE",
          "CASCADED",
          "CASE",
          "CAST",
          "CATALOG",
          "CHAIN",
          "CHAR",
          "CHARACTER",
          "CHARACTERISTICS",
          "CHECK",
          "CHECKPOINT",
          "CLASS",
          "CLOSE",
          "CLUSTER",
          "COALESCE",
          "COLLATE",
          "COLLATION",
          "COLUMN",
          "COLUMNS",
          "COMMENT",
          "COMMENTS",
          "COMMIT",
          "COMMITTED",
          "CONCURRENTLY",
          "CONFIGURATION",
          "CONFLICT",
          "CONNECTION",
          "CONSTRAINT",
          "CONSTRAINTS",
          "CONTENT",
          "CONTINUE",
          "CONVERSION",
          "COPY",
          "COST",
          "CREATE",
          "CROSS",
          "CSV",
          "CUBE",
          "CURRENT",
          "CURRENT_CATALOG",
          "CURRENT_DATE",
          "CURRENT_ROLE",
          "CURRENT_SCHEMA",
          "CURRENT_TIME",
          "CURRENT_TIMESTAMP",
          "CURRENT_USER",
          "CURSOR",
          "CYCLE",
          "DATA",
          "DATABASE",
          "DAY",
          "DEALLOCATE",
          "DEC",
          "DECIMAL",
          "DECLARE",
          "DEFAULT",
          "DEFAULTS",
          "DEFERRABLE",
          "DEFERRED",
          "DEFINER",
          "DELETE",
          "DELIMITER",
          "DELIMITERS",
          "DEPENDS",
          "DESC",
          "DETACH",
          "DICTIONARY",
          "DISABLE",
          "DISCARD",
          "DISTINCT",
          "DO",
          "DOCUMENT",
          "DOMAIN",
          "DOUBLE",
          "DROP",
          "EACH",
          "ELSE",
          "ENABLE",
          "ENCODING",
          "ENCRYPTED",
          "END",
          "ENUM",
          "ESCAPE",
          "EVENT",
          "EXCEPT",
          "EXCLUDE",
          "EXCLUDING",
          "EXCLUSIVE",
          "EXECUTE",
          "EXISTS",
          "EXPLAIN",
          "EXPRESSION",
          "EXTENSION",
          "EXTERNAL",
          "EXTRACT",
          "FALSE",
          "FAMILY",
          "FETCH",
          "FILTER",
          "FIRST",
          "FLOAT",
          "FOLLOWING",
          "FOR",
          "FORCE",
          "FOREIGN",
          "FORWARD",
          "FREEZE",
          "FROM",
          "FULL",
          "FUNCTION",
          "FUNCTIONS",
          "GENERATED",
          "GLOBAL",
          "GRANT",
          "GRANTED",
          "GREATEST",
          "GROUP",
          "GROUPING",
          "GROUPS",
          "HANDLER",
          "HAVING",
          "HEADER",
          "HOLD",
          "HOUR",
          "IDENTITY",
          "IF",
          "ILIKE",
          "IMMEDIATE",
          "IMMUTABLE",
          "IMPLICIT",
          "IMPORT",
          "IN",
          "INCLUDE",
          "INCLUDING",
          "INCREMENT",
          "INDEX",
          "INDEXES",
          "INHERIT",
          "INHERITS",
          "INITIALLY",
          "INLINE",
          "INNER",
          "INOUT",
          "INPUT",
          "INSENSITIVE",
          "INSERT",
          "INSTEAD",
          "INT",
          "INTEGER",
          "INTERSECT",
          "INTERVAL",
          "INTO",
          "INVOKER",
          "IS",
          "ISNULL",
          "ISOLATION",
          "JOIN",
          "KEY",
          "LABEL",
          "LANGUAGE",
          "LARGE",
          "LAST",
          "LATERAL",
          "LEADING",
          "LEAKPROOF",
          "LEAST",
          "LEFT",
          "LEVEL",
          "LIKE",
          "LIMIT",
          "LISTEN",
          "LOAD",
          "LOCAL",
          "LOCALTIME",
          "LOCALTIMESTAMP",
          "LOCATION",
          "LOCK",
          "LOCKED",
          "LOGGED",
          "MAPPING",
          "MATCH",
          "MATERIALIZED",
          "MAXVALUE",
          "METHOD",
          "MINUTE",
          "MINVALUE",
          "MODE",
          "MONTH",
          "MOVE",
          "NAME",
          "NAMES",
          "NATIONAL",
          "NATURAL",
          "NCHAR",
          "NEW",
          "NEXT",
          "NFC",
          "NFD",
          "NFKC",
          "NFKD",
          "NO",
          "NONE",
          "NORMALIZE",
          "NORMALIZED",
          "NOT",
          "NOTHING",
          "NOTIFY",
          "NOTNULL",
          "NOWAIT",
          "NULL",
          "NULLIF",
          "NULLS",
          "NUMERIC",
          "OBJECT",
          "OF",
          "OFF",
          "OFFSET",
          "OIDS",
          "OLD",
          "ON",
          "ONLY",
          "OPERATOR",
          "OPTION",
          "OPTIONS",
          "OR",
          "ORDER",
          "ORDINALITY",
          "OTHERS",
          "OUT",
          "OUTER",
          "OVER",
          "OVERLAPS",
          "OVERLAY",
          "OVERRIDING",
          "OWNED",
          "OWNER",
          "PARALLEL",
          "PARSER",
          "PARTIAL",
          "PARTITION",
          "PASSING",
          "PASSWORD",
          "PLACING",
          "PLANS",
          "POLICY",
          "POSITION",
          "PRECEDING",
          "PRECISION",
          "PREPARE",
          "PREPARED",
          "PRESERVE",
          "PRIMARY",
          "PRIOR",
          "PRIVILEGES",
          "PROCEDURAL",
          "PROCEDURE",
          "PROCEDURES",
          "PROGRAM",
          "PUBLICATION",
          "QUOTE",
          "RANGE",
          "READ",
          "REAL",
          "REASSIGN",
          "RECHECK",
          "RECURSIVE",
          "REF",
          "REFERENCES",
          "REFERENCING",
          "REFRESH",
          "REINDEX",
          "RELATIVE",
          "RELEASE",
          "RENAME",
          "REPEATABLE",
          "REPLACE",
          "REPLICA",
          "RESET",
          "RESTART",
          "RESTRICT",
          "RETURNING",
          "RETURNS",
          "REVOKE",
          "RIGHT",
          "ROLE",
          "ROLLBACK",
          "ROLLUP",
          "ROUTINE",
          "ROUTINES",
          "ROW",
          "ROWS",
          "RULE",
          "SAVEPOINT",
          "SCHEMA",
          "SCHEMAS",
          "SCROLL",
          "SEARCH",
          "SECOND",
          "SECURITY",
          "SELECT",
          "SEQUENCE",
          "SEQUENCES",
          "SERIALIZABLE",
          "SERVER",
          "SESSION",
          "SESSION_USER",
          "SET",
          "SETOF",
          "SETS",
          "SHARE",
          "SHOW",
          "SIMILAR",
          "SIMPLE",
          "SKIP",
          "SMALLINT",
          "SNAPSHOT",
          "SOME",
          "SQL",
          "STABLE",
          "STANDALONE",
          "START",
          "STATEMENT",
          "STATISTICS",
          "STDIN",
          "STDOUT",
          "STORAGE",
          "STORED",
          "STRICT",
          "STRIP",
          "SUBSCRIPTION",
          "SUBSTRING",
          "SUPPORT",
          "SYMMETRIC",
          "SYSID",
          "SYSTEM",
          "TABLE",
          "TABLES",
          "TABLESAMPLE",
          "TABLESPACE",
          "TEMP",
          "TEMPLATE",
          "TEMPORARY",
          "TEXT",
          "THEN",
          "TIES",
          "TIME",
          "TIMESTAMP",
          "TO",
          "TRAILING",
          "TRANSACTION",
          "TRANSFORM",
          "TREAT",
          "TRIGGER",
          "TRIM",
          "TRUE",
          "TRUNCATE",
          "TRUSTED",
          "TYPE",
          "TYPES",
          "UESCAPE",
          "UNBOUNDED",
          "UNCOMMITTED",
          "UNENCRYPTED",
          "UNION",
          "UNIQUE",
          "UNKNOWN",
          "UNLISTEN",
          "UNLOGGED",
          "UNTIL",
          "UPDATE",
          "USER",
          "USING",
          "VACUUM",
          "VALID",
          "VALIDATE",
          "VALIDATOR",
          "VALUE",
          "VALUES",
          "VARCHAR",
          "VARIADIC",
          "VARYING",
          "VERBOSE",
          "VERSION",
          "VIEW",
          "VIEWS",
          "VOLATILE",
          "WHEN",
          "WHERE",
          "WHITESPACE",
          "WINDOW",
          "WITH",
          "WITHIN",
          "WITHOUT",
          "WORK",
          "WRAPPER",
          "WRITE",
          "XML",
          "XMLATTRIBUTES",
          "XMLCONCAT",
          "XMLELEMENT",
          "XMLEXISTS",
          "XMLFOREST",
          "XMLNAMESPACES",
          "XMLPARSE",
          "XMLPI",
          "XMLROOT",
          "XMLSERIALIZE",
          "XMLTABLE",
          "YEAR",
          "YES",
          "ZONE");

  private static final List<String> reservedTopLevelWords =
      Arrays.asList(
          "ADD",
          "AFTER",
          "ALTER COLUMN",
          "ALTER TABLE",
          "CASE",
          "DELETE FROM",
          "END",
          "EXCEPT",
          "FETCH FIRST",
          "FROM",
          "GROUP BY",
          "HAVING",
          "INSERT INTO",
          "INSERT",
          "LIMIT",
          "ORDER BY",
          "SELECT",
          "SET CURRENT SCHEMA",
          "SET SCHEMA",
          "SET",
          "UPDATE",
          "VALUES",
          "WHERE");

  private static final List<String> reservedTopLevelWordsNoIndent =
      Arrays.asList("INTERSECT", "INTERSECT ALL", "UNION", "UNION ALL");

  private static final List<String> reservedNewlineWords =
      Arrays.asList(
          "AND",
          "ELSE",
          "OR",
          "WHEN",
          // joins
          "JOIN",
          "INNER JOIN",
          "LEFT JOIN",
          "LEFT OUTER JOIN",
          "RIGHT JOIN",
          "RIGHT OUTER JOIN",
          "FULL JOIN",
          "FULL OUTER JOIN",
          "CROSS JOIN",
          "NATURAL JOIN");

  @Override
  public DialectConfig dialectConfig() {
    return DialectConfig.builder()
        .reservedWords(reservedWords)
        .reservedTopLevelWords(reservedTopLevelWords)
        .reservedTopLevelWordsNoIndent(reservedTopLevelWordsNoIndent)
        .reservedNewlineWords(reservedNewlineWords)
        .stringTypes(
            Arrays.asList(
                StringLiteral.DOUBLE_QUOTE,
                StringLiteral.SINGLE_QUOTE,
                StringLiteral.U_DOUBLE_QUOTE,
                StringLiteral.U_SINGLE_QUOTE,
                StringLiteral.DOLLAR))
        .openParens(Arrays.asList("(", "CASE"))
        .closeParens(Arrays.asList(")", "END"))
        .indexedPlaceholderTypes(Collections.singletonList("$"))
        .namedPlaceholderTypes(Collections.singletonList(":"))
        .lineCommentTypes(Collections.singletonList("--"))
        .operators(
            Arrays.asList(
                "!=", "<<", ">>", "||/", "|/", "::", "->>", "->", "~~*", "~~", "!~~*", "!~~", "~*",
                "!~*", "!~", "!!", "@@", "@@@"))
        .build();
  }

  public PostgreSqlFormatter(FormatConfig cfg) {
    super(cfg);
  }
}
