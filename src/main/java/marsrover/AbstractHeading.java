package marsrover;

public abstract class AbstractHeading implements Heading {
    @Override
    public boolean equals(Object obj) {
        return this.getClass().isInstance(obj);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
