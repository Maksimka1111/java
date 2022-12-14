package task12;

import java.util.Stack;

public class StringBuilder2 {
    private interface Action {
        void undo();
    }

    private StringBuilder stringBuilder = new StringBuilder();
    private Stack<Action> history = new Stack<>();

    private class DeleteAction implements Action {
        private int size;

        public DeleteAction(int size) {
            this.size = size;
        }

        @Override
        public void undo() {
            stringBuilder.delete(stringBuilder.length() - size, stringBuilder.length());
        }
    }

    public StringBuilder2(StringBuilder Stringbuilder) {
        stringBuilder = Stringbuilder;
    }

    public StringBuilder2 append(Integer i) {
        stringBuilder.append(i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - i.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(Character c) {
        stringBuilder.append(c);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - c.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(Float f) {
        stringBuilder.append(f);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - f.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(Double d) {
        stringBuilder.append(d);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - d.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(String s) {
        stringBuilder.append(s);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - s.length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(char[] chars) {
        stringBuilder.append(chars);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - chars.length, stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(Boolean b) {
        stringBuilder.append(b);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - b.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(Long l) {
        stringBuilder.append(l);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - l.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(CharSequence charSequence) {
        stringBuilder.append(charSequence);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - charSequence.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(StringBuffer stringBuffer) {
        stringBuilder.append(stringBuffer);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - stringBuffer.toString().length(), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(CharSequence charSequence, int start, int end) {
        stringBuilder.append(charSequence);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - (end - start), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 append(StringBuffer stringBuffer, int start, int end) {
        stringBuilder.append(stringBuffer);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - (end - start), stringBuilder.length());
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 appendCodePoint(int codePoint) {
        int len = stringBuilder.length();
        stringBuilder.appendCodePoint(codePoint);
        history.add(new DeleteAction(stringBuilder.length() - len));
        return this;
    }

    public StringBuilder2 delete(int start, int end) {
        String before = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.append(before);
            }
        };
        history.add(action);
        return this;
    }

    public StringBuilder2 deleteCharAt(int index)
    {
        char delete = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.insert(index,delete);
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 replace(int start, int end, String str)
    {
        String old_str = stringBuilder.substring(start,end);
        stringBuilder.replace(start,end,str);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.replace(start,end,old_str);
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,char c)
    {
        stringBuilder.insert(index, c);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.deleteCharAt(index);
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,Integer i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.toString().length());
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,Double d)
    {
        stringBuilder.insert(index, d);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + d.toString().length());
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,Float i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.toString().length());
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,Boolean i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.toString().length());
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,char[] i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.length);
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,String i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.length());
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,Object i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.toString().length());
            }
        };
        history.add(action);
        return this;

    }
    public StringBuilder2 insert(int index,Long i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.toString().length());
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index, CharSequence i)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + i.toString().length());
            }
        };
        history.add(action);
        return this;
    }
    public StringBuilder2 insert(int index,CharSequence i, int start, int end)
    {
        stringBuilder.insert(index, i);
        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(index, index + (end-start));
            }
        };
        history.add(action);
        return this;
    }
    public void undo(){
        if(!history.isEmpty()){
            history.pop().undo();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
