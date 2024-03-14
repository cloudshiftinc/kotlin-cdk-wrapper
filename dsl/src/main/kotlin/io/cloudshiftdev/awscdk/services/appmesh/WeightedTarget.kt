package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit

public interface WeightedTarget {
  public fun port(): Number? = unwrap(this).getPort()

  public fun virtualNode(): IVirtualNode

  public fun weight(): Number? = unwrap(this).getWeight()

  public interface Builder {
    public fun port(port: Number)

    public fun virtualNode(virtualNode: IVirtualNode)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.WeightedTarget.Builder =
        software.amazon.awscdk.services.appmesh.WeightedTarget.builder()

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun virtualNode(virtualNode: IVirtualNode) {
      cdkBuilder.virtualNode(virtualNode.let(IVirtualNode::unwrap))
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.WeightedTarget = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.WeightedTarget,
  ) : WeightedTarget {
    override fun port(): Number? = unwrap(this).getPort()

    override fun virtualNode(): IVirtualNode = unwrap(this).getVirtualNode().let(IVirtualNode::wrap)

    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.WeightedTarget):
        WeightedTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WeightedTarget):
        software.amazon.awscdk.services.appmesh.WeightedTarget = (wrapped as Wrapper).cdkObject
  }
}
