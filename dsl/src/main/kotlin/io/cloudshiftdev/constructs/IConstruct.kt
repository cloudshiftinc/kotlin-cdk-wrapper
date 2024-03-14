package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.CdkObject

public interface IConstruct : IDependable {
  public fun node(): Node

  private class Wrapper(
    override val cdkObject: software.constructs.IConstruct,
  ) : CdkObject(cdkObject), IConstruct {
    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.constructs.IConstruct): IConstruct = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConstruct): software.constructs.IConstruct = (wrapped as
        CdkObject).cdkObject as software.constructs.IConstruct
  }
}
