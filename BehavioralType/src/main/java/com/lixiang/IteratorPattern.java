package com.lixiang;

public class IteratorPattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator nameIterator = nameRepository.getIterator();
        while (nameIterator.hasNext()) {
            String name = (String) nameIterator.next();
            System.out.println(name);
        }
    }
}

interface Iterator {
    boolean hasNext();

    Object next();
}

interface Container {
    Iterator getIterator();
}

class NameRepository implements Container {
    String[] names = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator(this);
    }

}

class NameIterator implements Iterator {

    private int idx;
    private NameRepository nameRepository;

    public NameIterator(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    @Override
    public boolean hasNext() {
        if (idx < nameRepository.names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return nameRepository.names[idx++];
        }
        return null;
    }
}


