package io.cloudshiftdev.awscdk.services.ecs

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

  public interface Builder {
    public fun appProtocol(appProtocol: AppProtocol) {
    }

    public fun containerPort(containerPort: Number) {
    }

    public fun containerPortRange(containerPortRange: String) {
    }

    public fun hostPort(hostPort: Number) {
    }

    public fun name(name: String) {
    }

    public fun protocol(protocol: Protocol) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.PortMapping.Builder =
        software.amazon.awscdk.services.ecs.PortMapping.builder()

    public override fun appProtocol(appProtocol: AppProtocol) {
      cdkBuilder.appProtocol(appProtocol.let(AppProtocol::unwrap))
    }

    public override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    public override fun containerPortRange(containerPortRange: String) {
      cdkBuilder.containerPortRange(containerPortRange)
    }

    public override fun hostPort(hostPort: Number) {
      cdkBuilder.hostPort(hostPort)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.PortMapping = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.PortMapping,
  ) : PortMapping {
    public override fun appProtocol(): AppProtocol? =
        unwrap(this).getAppProtocol()?.let(AppProtocol::wrap)

    public override fun containerPort(): Number = unwrap(this).getContainerPort()

    public override fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

    public override fun hostPort(): Number? = unwrap(this).getHostPort()

    public override fun name(): String? = unwrap(this).getName()

    public override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PortMapping {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.PortMapping): PortMapping =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortMapping): software.amazon.awscdk.services.ecs.PortMapping =
        (wrapped as Wrapper).cdkObject
  }
}
