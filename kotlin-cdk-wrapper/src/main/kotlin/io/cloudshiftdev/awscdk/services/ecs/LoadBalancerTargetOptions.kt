@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface LoadBalancerTargetOptions {
  public fun containerName(): String

  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun containerName(containerName: String)

    public fun containerPort(containerPort: Number)

    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions.Builder =
        software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions.builder()

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions,
  ) : CdkObject(cdkObject), LoadBalancerTargetOptions {
    override fun containerName(): String = unwrap(this).getContainerName()

    override fun containerPort(): Number? = unwrap(this).getContainerPort()

    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerTargetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions):
        LoadBalancerTargetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerTargetOptions):
        software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions
  }
}
