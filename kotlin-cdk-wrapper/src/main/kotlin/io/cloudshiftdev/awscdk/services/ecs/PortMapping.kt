@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface PortMapping {
  public fun appProtocol(): AppProtocol? = unwrap(this).getAppProtocol()?.let(AppProtocol::wrap)

  public fun containerPort(): Number

  public fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

  public fun hostPort(): Number? = unwrap(this).getHostPort()

  public fun name(): String? = unwrap(this).getName()

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun appProtocol(appProtocol: AppProtocol)

    public fun containerPort(containerPort: Number)

    public fun containerPortRange(containerPortRange: String)

    public fun hostPort(hostPort: Number)

    public fun name(name: String)

    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.PortMapping.Builder =
        software.amazon.awscdk.services.ecs.PortMapping.builder()

    override fun appProtocol(appProtocol: AppProtocol) {
      cdkBuilder.appProtocol(appProtocol.let(AppProtocol::unwrap))
    }

    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    override fun containerPortRange(containerPortRange: String) {
      cdkBuilder.containerPortRange(containerPortRange)
    }

    override fun hostPort(hostPort: Number) {
      cdkBuilder.hostPort(hostPort)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.PortMapping = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.PortMapping,
  ) : CdkObject(cdkObject), PortMapping {
    override fun appProtocol(): AppProtocol? = unwrap(this).getAppProtocol()?.let(AppProtocol::wrap)

    override fun containerPort(): Number = unwrap(this).getContainerPort()

    override fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

    override fun hostPort(): Number? = unwrap(this).getHostPort()

    override fun name(): String? = unwrap(this).getName()

    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PortMapping): PortMapping =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortMapping): software.amazon.awscdk.services.ecs.PortMapping =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.PortMapping
  }
}
