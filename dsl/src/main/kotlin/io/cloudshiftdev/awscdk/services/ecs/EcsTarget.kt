package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface EcsTarget {
  public fun containerName(): String

  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  public fun listener(): ListenerConfig

  public fun newTargetGroupId(): String

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  public interface Builder {
    public fun containerName(containerName: String) {
    }

    public fun containerPort(containerPort: Number) {
    }

    public fun listener(listener: ListenerConfig) {
    }

    public fun newTargetGroupId(newTargetGroupId: String) {
    }

    public fun protocol(protocol: Protocol) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EcsTarget.Builder =
        software.amazon.awscdk.services.ecs.EcsTarget.builder()

    public override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    public override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    public override fun listener(listener: ListenerConfig) {
      cdkBuilder.listener(listener.let(ListenerConfig::unwrap))
    }

    public override fun newTargetGroupId(newTargetGroupId: String) {
      cdkBuilder.newTargetGroupId(newTargetGroupId)
    }

    public override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.EcsTarget = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.EcsTarget,
  ) : EcsTarget {
    public override fun containerName(): String = unwrap(this).getContainerName()

    public override fun containerPort(): Number? = unwrap(this).getContainerPort()

    public override fun listener(): ListenerConfig =
        unwrap(this).getListener().let(ListenerConfig::wrap)

    public override fun newTargetGroupId(): String = unwrap(this).getNewTargetGroupId()

    public override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EcsTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcsTarget): EcsTarget =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsTarget): software.amazon.awscdk.services.ecs.EcsTarget =
        (wrapped as Wrapper).cdkObject
  }
}
