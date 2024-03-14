package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface WeightedTarget {
  /**
   * The port to match from the request.
   *
   * Default: - do not match on port
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The VirtualNode the route points to.
   */
  public fun virtualNode(): IVirtualNode

  /**
   * The weight for the target.
   *
   * Default: 1
   */
  public fun weight(): Number? = unwrap(this).getWeight()

  /**
   * A builder for [WeightedTarget]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param port The port to match from the request.
     */
    public fun port(port: Number)

    /**
     * @param virtualNode The VirtualNode the route points to. 
     */
    public fun virtualNode(virtualNode: IVirtualNode)

    /**
     * @param weight The weight for the target.
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.WeightedTarget.Builder =
        software.amazon.awscdk.services.appmesh.WeightedTarget.builder()

    /**
     * @param port The port to match from the request.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param virtualNode The VirtualNode the route points to. 
     */
    override fun virtualNode(virtualNode: IVirtualNode) {
      cdkBuilder.virtualNode(virtualNode.let(IVirtualNode::unwrap))
    }

    /**
     * @param weight The weight for the target.
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.WeightedTarget = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.WeightedTarget,
  ) : CdkObject(cdkObject), WeightedTarget {
    /**
     * The port to match from the request.
     *
     * Default: - do not match on port
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The VirtualNode the route points to.
     */
    override fun virtualNode(): IVirtualNode = unwrap(this).getVirtualNode().let(IVirtualNode::wrap)

    /**
     * The weight for the target.
     *
     * Default: 1
     */
    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.WeightedTarget):
        WeightedTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WeightedTarget):
        software.amazon.awscdk.services.appmesh.WeightedTarget = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.WeightedTarget
  }
}
