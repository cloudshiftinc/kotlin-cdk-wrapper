@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class PortMap internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.PortMap,
) : CdkObject(cdkObject) {
  public open fun networkmode(): NetworkMode = unwrap(this).getNetworkmode().let(NetworkMode::wrap)

  public open fun portmapping(): PortMapping = unwrap(this).getPortmapping().let(PortMapping::wrap)

  public open fun validate() {
    unwrap(this).validate()
  }

  @CdkDslMarker
  public interface Builder {
    public fun appProtocol(appProtocol: AppProtocol)

    public fun containerPort(containerPort: Number)

    public fun containerPortRange(containerPortRange: String)

    public fun hostPort(hostPort: Number)

    public fun name(name: String)

    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl(
    networkmode: software.amazon.awscdk.services.ecs.NetworkMode,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.PortMap.Builder =
        software.amazon.awscdk.services.ecs.PortMap.Builder.create(networkmode)

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

    public fun build(): software.amazon.awscdk.services.ecs.PortMap = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(networkmode: NetworkMode, block: Builder.() -> Unit = {}): PortMap {
      val builderImpl = BuilderImpl(NetworkMode.unwrap(networkmode))
      return PortMap(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PortMap): PortMap =
        PortMap(cdkObject)

    internal fun unwrap(wrapped: PortMap): software.amazon.awscdk.services.ecs.PortMap =
        wrapped.cdkObject
  }
}
