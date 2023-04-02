package com.github.vertical_blank.sqlformatter.core.util;

import java.util.Objects;

public class StringPair {

  private final String left;
  private final String right;

  public StringPair(String left, String right) {
    this.left = left;
    this.right = right;
  }

  public String getLeft() {
    return left;
  }

  public String getRight() {
    return right;
  }

  @Override
  public String toString() {
    return String.format("(%s, %s)", left, right);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    StringPair p = (StringPair) o;

    return Objects.equals(left, p.left) && Objects.equals(right, p.right);
  }

  @Override
  public int hashCode() {
    int r = 0;

    r = 31 * r + Objects.hashCode(left);
    r = 31 * r + Objects.hashCode(right);

    return r;
  }
}
