/* Generated By:JavaCC: Do not edit this line. UQLParserTokenManager.java */
package org.wonderdb.parser;

/** Token Manager. */
public class UQLParserTokenManager implements UQLParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xffefff0007fe0L) != 0L)
         {
            jjmatchedKind = 56;
            return 11;
         }
         if ((active0 & 0x200000000000000L) != 0L)
            return 4;
         if ((active0 & 0x4000000L) != 0L)
            return 12;
         return -1;
      case 1:
         if ((active0 & 0x7deeff0007fe0L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 1;
            return 11;
         }
         if ((active0 & 0x8201000000000L) != 0L)
            return 11;
         return -1;
      case 2:
         if ((active0 & 0x80000000000L) != 0L)
         {
            if (jjmatchedPos < 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return -1;
         }
         if ((active0 & 0x900010002c00L) != 0L)
            return 11;
         if ((active0 & 0x746efe00053e0L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 2;
            }
            return 11;
         }
         return -1;
      case 3:
         if ((active0 & 0x80000000000L) != 0L)
         {
            if (jjmatchedPos < 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return -1;
         }
         if ((active0 & 0x1024020004800L) != 0L)
            return 11;
         if ((active0 & 0x644afc00013e0L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 3;
            return 11;
         }
         return -1;
      case 4:
         if ((active0 & 0x80000000000L) != 0L)
         {
            if (jjmatchedPos < 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return -1;
         }
         if ((active0 & 0x4048b400011e0L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 4;
            return 11;
         }
         if ((active0 & 0x2402480000200L) != 0L)
            return 11;
         return -1;
      case 5:
         if ((active0 & 0x80000000000L) != 0L)
         {
            if (jjmatchedPos < 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return -1;
         }
         if ((active0 & 0x4040000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 5;
            return 11;
         }
         if ((active0 & 0x8b400011e0L) != 0L)
            return 11;
         return -1;
      case 6:
         if ((active0 & 0x80000000000L) != 0L)
         {
            if (jjmatchedPos < 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return -1;
         }
         if ((active0 & 0x40000000000L) != 0L)
            return 11;
         if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 6;
            return 11;
         }
         return -1;
      case 7:
         if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 7;
            return 11;
         }
         if ((active0 & 0x80000000000L) != 0L)
         {
            if (jjmatchedPos < 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x80000000000L) != 0L)
         {
            if (jjmatchedPos < 1)
            {
               jjmatchedKind = 56;
               jjmatchedPos = 1;
            }
            return -1;
         }
         if ((active0 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 56;
            jjmatchedPos = 8;
            return 11;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStartNfaWithStates_0(0, 57, 4);
      case 40:
         return jjStopAtPos(0, 16);
      case 41:
         return jjStopAtPos(0, 17);
      case 42:
         return jjStopAtPos(0, 27);
      case 43:
         return jjStopAtPos(0, 24);
      case 44:
         return jjStopAtPos(0, 15);
      case 45:
         return jjStopAtPos(0, 25);
      case 46:
         return jjStopAtPos(0, 58);
      case 47:
         return jjStartNfaWithStates_0(0, 26, 12);
      case 60:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x880000L);
      case 61:
         return jjStopAtPos(0, 18);
      case 62:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 63:
         return jjStopAtPos(0, 40);
      case 97:
         return jjMoveStringLiteralDfa1_0(0xc00000002000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000080L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80004000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80410000820L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20020000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x1200000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x204c100000440L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x8002000000000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x800000100L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 121:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      case 62:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000001000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x41000000004c0L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2004000000200L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x400080000000L);
      case 110:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 36, 11);
         return jjMoveStringLiteralDfa2_0(active0, 0xc10002820L);
      case 111:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 45, 11);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 51, 11);
         return jjMoveStringLiteralDfa2_0(active0, 0x60000000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x200004000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x40100000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 100:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 11);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 47, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x400000100L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000200L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 107:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000010c0L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x44080004000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 115:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 11);
         else if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000800L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x280000100L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      case 101:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 11);
         return jjMoveStringLiteralDfa4_0(active0, 0x4084000000e0L);
      case 103:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 11);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 108:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 48, 11);
         return jjMoveStringLiteralDfa4_0(active0, 0x4002000000000L);
      case 109:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 11);
         break;
      case 111:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 11);
         break;
      case 113:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x2040000000200L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 119:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 100:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 49, 11);
         break;
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 11);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 37, 11);
         return jjMoveStringLiteralDfa5_0(active0, 0x80000001000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L);
      case 114:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 46, 11);
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 116:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 11);
         return jjMoveStringLiteralDfa5_0(active0, 0x200000180L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      case 120:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 34, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 39, 11);
         break;
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000000L);
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 11);
         else if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 11);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 11);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 33, 11);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(5, 35, 11);
         break;
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 103:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 11);
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 115:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 11);
         break;
      case 116:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 11);
         else if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(5, 6, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x4080000000000L);
      case 101:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 42, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000000000L);
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000000000000L);
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(9, 43);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 50, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 12;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAdd(5);
                  else if (curChar == 34)
                  {
                     if (kind > 53)
                        kind = 53;
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     jjCheckNAdd(9);
                  }
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(7, 8);
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(4, 5);
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 12:
                  if ((0x27ffc38000000000L & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  if (curChar == 47)
                  {
                     if (kind > 52)
                        kind = 52;
                  }
                  break;
               case 1:
                  if ((0x27ffc38000000000L & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 47 && kind > 52)
                     kind = 52;
                  break;
               case 3:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 5:
                  if (curChar == 34 && kind > 53)
                     kind = 53;
                  break;
               case 6:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 7:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar == 39 && kind > 54)
                     kind = 54;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(9);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  jjstateSet[jjnewStateCnt++] = 11;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 0:
               case 11:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 56)
                     kind = 56;
                  jjCheckNAdd(11);
                  break;
               case 12:
               case 1:
                  if ((0x7fffffe2fffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 7:
                  jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 12 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   7, 8, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\151\156\163\145\162\164", 
"\163\145\154\145\143\164", "\144\145\154\145\164\145", "\165\160\144\141\164\145", 
"\167\150\145\162\145", "\163\145\164", "\151\156\164\157", "\166\141\154\165\145\163", 
"\141\156\144", "\146\162\157\155", "\54", "\50", "\51", "\75", "\74\76", "\76", "\74", 
"\76\75", "\74\75", "\53", "\55", "\57", "\52", "\151\156\164", "\154\157\156\147", 
"\144\157\165\142\154\145", "\146\154\157\141\164", "\163\164\162\151\156\147", 
"\143\162\145\141\164\145", "\151\156\144\145\170", "\165\156\151\161\165\145", "\157\156", 
"\164\141\142\154\145", "\163\150\157\167", "\163\143\150\145\155\141", "\77", "\154\151\153\145", 
"\163\164\157\162\141\147\145", "\151\163\137\144\145\146\141\165\154\164", "\171\145\163", "\156\157", 
"\141\154\164\145\162", "\141\144\144", "\156\165\154\154", "\163\150\141\162\144", 
"\162\145\160\154\151\143\141\163\145\164", "\164\157", null, null, null, null, null, "\42", "\56", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7ffffffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[12];
private final int[] jjstateSet = new int[24];
protected char curChar;
/** Constructor. */
public UQLParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public UQLParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 12; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}