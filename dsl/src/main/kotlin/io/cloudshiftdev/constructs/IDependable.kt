package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.CdkObject

public interface IDependable {
  private class Wrapper(
    override val cdkObject: software.constructs.IDependable,
  ) : CdkObject(cdkObject), IDependable

  public companion object {
    internal fun wrap(cdkObject: software.constructs.IDependable): IDependable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDependable): software.constructs.IDependable = (wrapped as
        CdkObject).cdkObject as software.constructs.IDependable
  }
}