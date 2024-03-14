package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface MultiNodeContainer {
  /**
   * The container that this node range will run.
   */
  public fun container(): IEcsContainerDefinition

  /**
   * The index of the last node to run this container.
   *
   * The container is run on all nodes in the range [startNode, endNode] (inclusive)
   */
  public fun endNode(): Number

  /**
   * The index of the first node to run this container.
   *
   * The container is run on all nodes in the range [startNode, endNode] (inclusive)
   */
  public fun startNode(): Number

  /**
   * A builder for [MultiNodeContainer]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param container The container that this node range will run. 
     */
    public fun container(container: IEcsContainerDefinition)

    /**
     * @param endNode The index of the last node to run this container. 
     * The container is run on all nodes in the range [startNode, endNode] (inclusive)
     */
    public fun endNode(endNode: Number)

    /**
     * @param startNode The index of the first node to run this container. 
     * The container is run on all nodes in the range [startNode, endNode] (inclusive)
     */
    public fun startNode(startNode: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.MultiNodeContainer.Builder =
        software.amazon.awscdk.services.batch.MultiNodeContainer.builder()

    /**
     * @param container The container that this node range will run. 
     */
    override fun container(container: IEcsContainerDefinition) {
      cdkBuilder.container(container.let(IEcsContainerDefinition::unwrap))
    }

    /**
     * @param endNode The index of the last node to run this container. 
     * The container is run on all nodes in the range [startNode, endNode] (inclusive)
     */
    override fun endNode(endNode: Number) {
      cdkBuilder.endNode(endNode)
    }

    /**
     * @param startNode The index of the first node to run this container. 
     * The container is run on all nodes in the range [startNode, endNode] (inclusive)
     */
    override fun startNode(startNode: Number) {
      cdkBuilder.startNode(startNode)
    }

    public fun build(): software.amazon.awscdk.services.batch.MultiNodeContainer =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.MultiNodeContainer,
  ) : MultiNodeContainer {
    /**
     * The container that this node range will run.
     */
    override fun container(): IEcsContainerDefinition =
        unwrap(this).getContainer().let(IEcsContainerDefinition::wrap)

    /**
     * The index of the last node to run this container.
     *
     * The container is run on all nodes in the range [startNode, endNode] (inclusive)
     */
    override fun endNode(): Number = unwrap(this).getEndNode()

    /**
     * The index of the first node to run this container.
     *
     * The container is run on all nodes in the range [startNode, endNode] (inclusive)
     */
    override fun startNode(): Number = unwrap(this).getStartNode()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MultiNodeContainer {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.MultiNodeContainer):
        MultiNodeContainer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultiNodeContainer):
        software.amazon.awscdk.services.batch.MultiNodeContainer = (wrapped as Wrapper).cdkObject
  }
}
