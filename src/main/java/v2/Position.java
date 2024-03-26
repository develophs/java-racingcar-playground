package v2;

import java.util.Objects;

public class Position {
    private final int position;

    public Position(final int position) {
        validatePosition(position);
        this.position = position;
    }

    public Position move(final int fuel) {
        if (fuel >= 4) {
            return new Position(position + 1);
        }
        return this;
    }

    private void validatePosition(final int position) {
        if (position < 0) {
            throw new IllegalArgumentException("0 이상의 상태를 가져야합니다.");
        }
    }

    public boolean isSame(final int position) {
        return this.position == position;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
