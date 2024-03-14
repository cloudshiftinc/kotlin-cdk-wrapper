package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node

public interface ITrigger : IConstruct {
  public fun executeAfter(arg0: Construct)

  public fun executeBefore(arg0: Construct)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.triggers.ITrigger,
  ) : ITrigger {
    public override fun executeAfter(arg0: Construct) {
      unwrap(this).executeAfter(arg0.let(Construct::unwrap))
    }

    public override fun executeBefore(arg0: Construct) {
      unwrap(this).executeBefore(arg0.let(Construct::unwrap))
    }

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.ITrigger): ITrigger =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITrigger): software.amazon.awscdk.triggers.ITrigger = (wrapped as
        Wrapper).cdkObject
  }
}
