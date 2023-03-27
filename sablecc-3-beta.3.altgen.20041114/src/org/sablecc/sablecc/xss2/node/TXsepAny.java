/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import org.sablecc.sablecc.xss2.analysis.*;

public final class TXsepAny extends Token
{
    public TXsepAny()
    {
        super.setText("//");
    }

    public TXsepAny(int line, int pos)
    {
        super.setText("//");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TXsepAny(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTXsepAny(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TXsepAny text.");
    }
}
