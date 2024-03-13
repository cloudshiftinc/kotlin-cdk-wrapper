package io.cloudshiftdev.constructs

import kotlin.Any
import kotlin.Boolean

public open class Construct internal constructor(
  private val cdkObject: software.constructs.Construct,
) : IConstruct {
  public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

  public companion object {
    public open fun isConstruct(x: Any): Boolean = software.constructs.Construct.isConstruct(x)

    internal fun wrap(cdkObject: software.constructs.Construct): Construct = Construct(cdkObject)

    internal fun unwrap(wrapped: Construct): software.constructs.Construct = wrapped.cdkObject
  }
}
