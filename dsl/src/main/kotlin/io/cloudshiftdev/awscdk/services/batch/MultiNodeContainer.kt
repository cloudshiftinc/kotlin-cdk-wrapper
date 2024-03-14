package io.cloudshiftdev.awscdk.services.batch

import kotlin.Number
import kotlin.Unit

public interface MultiNodeContainer {
  public fun container(): IEcsContainerDefinition

  public fun endNode(): Number

  public fun startNode(): Number

  public interface Builder {
    public fun container(container: IEcsContainerDefinition) {
    }

    public fun endNode(endNode: Number) {
    }

    public fun startNode(startNode: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.MultiNodeContainer.Builder =
        software.amazon.awscdk.services.batch.MultiNodeContainer.builder()

    public override fun container(container: IEcsContainerDefinition) {
      cdkBuilder.container(container.let(IEcsContainerDefinition::unwrap))
    }

    public override fun endNode(endNode: Number) {
      cdkBuilder.endNode(endNode)
    }

    public override fun startNode(startNode: Number) {
      cdkBuilder.startNode(startNode)
    }

    public fun build(): software.amazon.awscdk.services.batch.MultiNodeContainer =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.MultiNodeContainer,
  ) : MultiNodeContainer {
    public override fun container(): IEcsContainerDefinition =
        unwrap(this).getContainer().let(IEcsContainerDefinition::wrap)

    public override fun endNode(): Number = unwrap(this).getEndNode()

    public override fun startNode(): Number = unwrap(this).getStartNode()
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
