package gals;

public interface ParserConstants {
  int FIRST_SEMANTIC_ACTION = 21;

  int SHIFT = 0;
  int REDUCE = 1;
  int ACTION = 2;
  int ACCEPT = 3;
  int GO_TO = 4;
  int ERROR = 5;

  int[][][] PARSER_TABLE = new t().tabela;

  public class t {
    int SHIFT = 0;
    int REDUCE = 1;
    int ACTION = 2;
    int ACCEPT = 3;
    int GO_TO = 4;
    int ERROR = 5;
    int tabela[][][] = new int[50][30][2];

    public class ca0 {
      int a0[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 3 }, { SHIFT, 4 },
          { GO_TO, 1 }, { GO_TO, 2 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca1 {
      int a1[][] = { { ACCEPT, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca2 {
      int a2[][] = { { REDUCE, 1 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 3 }, { SHIFT, 4 },
          { GO_TO, 5 }, { GO_TO, 2 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca3 {
      int a3[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 6 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca4 {
      int a4[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ACTION, 2 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { GO_TO, 7 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca5 {
      int a5[][] = { { REDUCE, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca6 {
      int a6[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 8 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca7 {
      int a7[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { SHIFT, 9 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca8 {
      int a8[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 10 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca9 {
      int a9[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 11 }, { ERROR, 0 }, { GO_TO, 12 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca10 {
      int a10[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 18 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca11 {
      int a11[][] = { { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 21 }, { SHIFT, 22 }, { SHIFT, 23 }, { SHIFT, 24 },
          { SHIFT, 25 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 19 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 20 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca12 {
      int a12[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 5 }, { REDUCE, 5 }, { REDUCE, 5 }, { REDUCE, 5 },
          { REDUCE, 5 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 5 }, { ERROR, 0 }, { REDUCE, 5 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca13 {
      int a13[][] = { { ERROR, 0 }, { ERROR, 0 }, { ACTION, 5 }, { ACTION, 5 }, { ACTION, 5 }, { ACTION, 5 },
          { ACTION, 5 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 5 }, { ERROR, 0 }, { ACTION, 5 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 26 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca14 {
      int a14[][] = { { ERROR, 0 }, { ERROR, 0 }, { ACTION, 6 }, { ACTION, 6 }, { ACTION, 6 }, { ACTION, 6 },
          { ACTION, 6 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 6 }, { ERROR, 0 }, { ACTION, 6 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 27 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca15 {
      int a15[][] = { { ERROR, 0 }, { ACTION, 7 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 7 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 7 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 7 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 28 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca16 {
      int a16[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 15 }, { REDUCE, 15 }, { REDUCE, 15 }, { REDUCE, 15 },
          { REDUCE, 15 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 15 }, { ERROR, 0 }, { REDUCE, 15 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca17 {
      int a17[][] = { { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 29 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca18 {
      int a18[][] = { { ACTION, 1 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 1 }, { ACTION, 1 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { GO_TO, 30 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca19 {
      int a19[][] = { { ACTION, 3 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 3 }, { ACTION, 3 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 31 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca20 {
      int a20[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 4 }, { REDUCE, 4 }, { REDUCE, 4 }, { REDUCE, 4 },
          { REDUCE, 4 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 4 }, { ERROR, 0 }, { REDUCE, 4 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca21 {
      int a21[][] = { { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 32 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca22 {
      int a22[][] = { { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 33 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca23 {
      int a23[][] = { { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 34 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca24 {
      int a24[][] = { { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 35 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca25 {
      int a25[][] = { { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 4 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 36 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca26 {
      int a26[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 12 }, { REDUCE, 12 }, { REDUCE, 12 }, { REDUCE, 12 },
          { REDUCE, 12 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 12 }, { ERROR, 0 }, { REDUCE, 12 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca27 {
      int a27[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 13 }, { REDUCE, 13 }, { REDUCE, 13 }, { REDUCE, 13 },
          { REDUCE, 13 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 13 }, { ERROR, 0 }, { REDUCE, 13 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca28 {
      int a28[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 37 }, { ERROR, 0 }, { GO_TO, 12 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca29 {
      int a29[][] = { { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 38 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca30 {
      int a30[][] = { { REDUCE, 2 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 2 }, { REDUCE, 2 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca31 {
      int a31[][] = { { REDUCE, 3 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 3 }, { REDUCE, 3 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca32 {
      int a32[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 39 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca33 {
      int a33[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 40 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca34 {
      int a34[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 41 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca35 {
      int a35[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 42 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca36 {
      int a36[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 43 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca37 {
      int a37[][] = { { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 21 }, { SHIFT, 22 }, { SHIFT, 23 }, { SHIFT, 24 },
          { SHIFT, 25 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 44 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 20 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca38 {
      int a38[][] = { { ERROR, 0 }, { ACTION, 7 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ACTION, 7 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 7 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 7 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 45 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca39 {
      int a39[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 6 }, { REDUCE, 6 }, { REDUCE, 6 }, { REDUCE, 6 },
          { REDUCE, 6 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 6 }, { ERROR, 0 }, { REDUCE, 6 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca40 {
      int a40[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 7 }, { REDUCE, 7 }, { REDUCE, 7 }, { REDUCE, 7 },
          { REDUCE, 7 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 7 }, { ERROR, 0 }, { REDUCE, 7 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca41 {
      int a41[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 8 }, { REDUCE, 8 }, { REDUCE, 8 }, { REDUCE, 8 },
          { REDUCE, 8 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 8 }, { ERROR, 0 }, { REDUCE, 8 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca42 {
      int a42[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 9 }, { REDUCE, 9 }, { REDUCE, 9 }, { REDUCE, 9 },
          { REDUCE, 9 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 9 }, { ERROR, 0 }, { REDUCE, 9 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca43 {
      int a43[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 10 }, { REDUCE, 10 }, { REDUCE, 10 }, { REDUCE, 10 },
          { REDUCE, 10 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 10 }, { ERROR, 0 }, { REDUCE, 10 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca44 {
      int a44[][] = { { ERROR, 0 }, { ERROR, 0 }, { ACTION, 8 }, { ACTION, 8 }, { ACTION, 8 }, { ACTION, 8 },
          { ACTION, 8 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 8 }, { ERROR, 0 }, { ACTION, 8 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { GO_TO, 46 }, { ERROR, 0 } };
    };

    public class ca45 {
      int a45[][] = { { ERROR, 0 }, { SHIFT, 13 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { SHIFT, 17 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 15 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 14 },
          { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 47 }, { ERROR, 0 }, { GO_TO, 12 }, { GO_TO, 16 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca46 {
      int a46[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 14 }, { REDUCE, 14 }, { REDUCE, 14 }, { REDUCE, 14 },
          { REDUCE, 14 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 14 }, { ERROR, 0 }, { REDUCE, 14 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca47 {
      int a47[][] = { { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 21 }, { SHIFT, 22 }, { SHIFT, 23 }, { SHIFT, 24 },
          { SHIFT, 25 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { SHIFT, 48 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { GO_TO, 20 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public class ca48 {
      int a48[][] = { { ERROR, 0 }, { ERROR, 0 }, { ACTION, 8 }, { ACTION, 8 }, { ACTION, 8 }, { ACTION, 8 },
          { ACTION, 8 }, { ERROR, 0 }, { ERROR, 0 }, { ACTION, 8 }, { ERROR, 0 }, { ACTION, 8 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { GO_TO, 49 }, { ERROR, 0 } };
    };

    public class ca49 {
      int a49[][] = { { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 11 }, { REDUCE, 11 }, { REDUCE, 11 }, { REDUCE, 11 },
          { REDUCE, 11 }, { ERROR, 0 }, { ERROR, 0 }, { REDUCE, 11 }, { ERROR, 0 }, { REDUCE, 11 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 },
          { ERROR, 0 }, { ERROR, 0 }, { ERROR, 0 } };
    };

    public t() {
      tabela[0] = new ca0().a0;
      tabela[1] = new ca1().a1;
      tabela[2] = new ca2().a2;
      tabela[3] = new ca3().a3;
      tabela[4] = new ca4().a4;
      tabela[5] = new ca5().a5;
      tabela[6] = new ca6().a6;
      tabela[7] = new ca7().a7;
      tabela[8] = new ca8().a8;
      tabela[9] = new ca9().a9;
      tabela[10] = new ca10().a10;
      tabela[11] = new ca11().a11;
      tabela[12] = new ca12().a12;
      tabela[13] = new ca13().a13;
      tabela[14] = new ca14().a14;
      tabela[15] = new ca15().a15;
      tabela[16] = new ca16().a16;
      tabela[17] = new ca17().a17;
      tabela[18] = new ca18().a18;
      tabela[19] = new ca19().a19;
      tabela[20] = new ca20().a20;
      tabela[21] = new ca21().a21;
      tabela[22] = new ca22().a22;
      tabela[23] = new ca23().a23;
      tabela[24] = new ca24().a24;
      tabela[25] = new ca25().a25;
      tabela[26] = new ca26().a26;
      tabela[27] = new ca27().a27;
      tabela[28] = new ca28().a28;
      tabela[29] = new ca29().a29;
      tabela[30] = new ca30().a30;
      tabela[31] = new ca31().a31;
      tabela[32] = new ca32().a32;
      tabela[33] = new ca33().a33;
      tabela[34] = new ca34().a34;
      tabela[35] = new ca35().a35;
      tabela[36] = new ca36().a36;
      tabela[37] = new ca37().a37;
      tabela[38] = new ca38().a38;
      tabela[39] = new ca39().a39;
      tabela[40] = new ca40().a40;
      tabela[41] = new ca41().a41;
      tabela[42] = new ca42().a42;
      tabela[43] = new ca43().a43;
      tabela[44] = new ca44().a44;
      tabela[45] = new ca45().a45;
      tabela[46] = new ca46().a46;
      tabela[47] = new ca47().a47;
      tabela[48] = new ca48().a48;
      tabela[49] = new ca49().a49;
    }
  }

  int[][] PRODUCTIONS = {
      { 15, 2 },
      { 15, 1 },
      { 16, 6 },
      { 16, 6 },
      { 17, 2 },
      { 17, 1 },
      { 18, 3 },
      { 18, 3 },
      { 18, 3 },
      { 18, 3 },
      { 18, 3 },
      { 20, 7 },
      { 19, 2 },
      { 19, 2 },
      { 19, 5 },
      { 19, 1 }
  };

  String[] PARSER_ERROR = {
      "Erro estado 0",
      "Erro estado 1",
      "Erro estado 2",
      "Erro estado 3",
      "Erro estado 4",
      "Erro estado 5",
      "Erro estado 6",
      "Erro estado 7",
      "Erro estado 8",
      "Erro estado 9",
      "Erro estado 10",
      "Erro estado 11",
      "Erro estado 12",
      "Erro estado 13",
      "Erro estado 14",
      "Erro estado 15",
      "Erro estado 16",
      "Erro estado 17",
      "Erro estado 18",
      "Erro estado 19",
      "Erro estado 20",
      "Erro estado 21",
      "Erro estado 22",
      "Erro estado 23",
      "Erro estado 24",
      "Erro estado 25",
      "Erro estado 26",
      "Erro estado 27",
      "Erro estado 28",
      "Erro estado 29",
      "Erro estado 30",
      "Erro estado 31",
      "Erro estado 32",
      "Erro estado 33",
      "Erro estado 34",
      "Erro estado 35",
      "Erro estado 36",
      "Erro estado 37",
      "Erro estado 38",
      "Erro estado 39",
      "Erro estado 40",
      "Erro estado 41",
      "Erro estado 42",
      "Erro estado 43",
      "Erro estado 44",
      "Erro estado 45",
      "Erro estado 46",
      "Erro estado 47",
      "Erro estado 48",
      "Erro estado 49"
  };
}
