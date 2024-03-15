@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface EcsTarget {
  public fun containerName(): String

  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  public fun listener(): ListenerConfig

  public fun newTargetGroupId(): String

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun containerName(containerName: String)

    public fun containerPort(containerPort: Number)

    public fun listener(listener: ListenerConfig)

    public fun newTargetGroupId(newTargetGroupId: String)

    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EcsTarget.Builder =
        software.amazon.awscdk.services.ecs.EcsTarget.builder()

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    override fun listener(listener: ListenerConfig) {
      cdkBuilder.listener(listener.let(ListenerConfig::unwrap))
    }

    override fun newTargetGroupId(newTargetGroupId: String) {
      cdkBuilder.newTargetGroupId(newTargetGroupId)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.EcsTarget = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.EcsTarget,
  ) : CdkObject(cdkObject), EcsTarget {
    override fun containerName(): String = unwrap(this).getContainerName()

    override fun containerPort(): Number? = unwrap(this).getContainerPort()

    override fun listener(): ListenerConfig = unwrap(this).getListener().let(ListenerConfig::wrap)

    override fun newTargetGroupId(): String = unwrap(this).getNewTargetGroupId()

    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcsTarget): EcsTarget =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsTarget): software.amazon.awscdk.services.ecs.EcsTarget =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.EcsTarget
  }
}
