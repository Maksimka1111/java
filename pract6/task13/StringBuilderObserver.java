package task13;

public class StringBuilderObserver {
    interface Listener{
        void change(StringBuilderObserver Observer);
    }
    private Listener listener;
    private StringBuilder stringBuilder;
    public void setListener(Listener Listener)
    {
        this.listener = Listener;
    }
    public StringBuilderObserver()
    {
        stringBuilder = new StringBuilder();
    }
    public void notifyListener()
    {
        if (listener != null)
            listener.change(this);
    }
    public StringBuilderObserver append(Integer i) {
        stringBuilder.append(i);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(Character c) {
        stringBuilder.append(c);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(Float f) {
        stringBuilder.append(f);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(Double d) {
        stringBuilder.append(d);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(String s) {
        stringBuilder.append(s);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(char[] chars) {
        stringBuilder.append(chars);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(Boolean b) {
        stringBuilder.append(b);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(Long l) {
        stringBuilder.append(l);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(CharSequence charSequence) {
        stringBuilder.append(charSequence);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(StringBuffer stringBuffer) {
        stringBuilder.append(stringBuffer);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(CharSequence charSequence, int start, int end) {
        stringBuilder.append(charSequence);
        notifyListener();
        return this;
    }

    public StringBuilderObserver append(StringBuffer stringBuffer, int start, int end) {
        stringBuilder.append(stringBuffer);
        notifyListener();
        return this;
    }

    public StringBuilderObserver appendCodePoint(int codePoint) {
        stringBuilder.appendCodePoint(codePoint);
        notifyListener();
        return this;
    }

    public StringBuilderObserver delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyListener();
        return this;
    }

    public StringBuilderObserver deleteCharAt(int index)
    {
        stringBuilder.deleteCharAt(index);
        notifyListener();
        return this;
    }
    public StringBuilderObserver replace(int start, int end, String str)
    {
        stringBuilder.replace(start,end,str);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,char c)
    {
        stringBuilder.insert(index, c);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,Integer i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,Double d)
    {
        stringBuilder.insert(index, d);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,Float i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,Boolean i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,char[] i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,String i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,Object i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;

    }
    public StringBuilderObserver insert(int index,Long i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index, CharSequence i)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public StringBuilderObserver insert(int index,CharSequence i, int start, int end)
    {
        stringBuilder.insert(index, i);
        notifyListener();
        return this;
    }
    public String toString() {
        return stringBuilder.toString();
    }
    public static class MyListener implements Listener {
        public void change(StringBuilderObserver stringBuilder) {
            System.out.println("CHANGED: " + stringBuilder.toString());
        }
    }
}
