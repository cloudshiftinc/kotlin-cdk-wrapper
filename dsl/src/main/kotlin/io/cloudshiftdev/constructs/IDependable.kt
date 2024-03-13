package io.cloudshiftdev.constructs

public interface IDependable {
  private class Wrapper internal constructor(
    internal val cdkObject: software.constructs.IDependable,
  ) : IDependable

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.constructs.IDependable): IDependable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDependable): software.constructs.IDependable = (wrapped as
        Wrapper).cdkObject
  }
}
