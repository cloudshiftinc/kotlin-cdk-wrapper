package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AccessLogConfig {
  public fun virtualGatewayAccessLog(): CfnVirtualGateway.VirtualGatewayAccessLogProperty? =
      unwrap(this).getVirtualGatewayAccessLog()?.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::wrap)

  public fun virtualNodeAccessLog(): CfnVirtualNode.AccessLogProperty? =
      unwrap(this).getVirtualNodeAccessLog()?.let(CfnVirtualNode.AccessLogProperty::wrap)

  public interface Builder {
    public
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31692470dacc90bc3e527d462b2d0309a24a4027b21c724a359ea1bcb8389855")
    public
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder.() -> Unit) {
    }

    public fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c8911635fcfe0190553a5f9e21ab70e568d572b85c98c968563bc77ca18cbd9")
    public
        fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.AccessLogConfig.Builder =
        software.amazon.awscdk.services.appmesh.AccessLogConfig.builder()

    public override
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
      cdkBuilder.virtualGatewayAccessLog(virtualGatewayAccessLog.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31692470dacc90bc3e527d462b2d0309a24a4027b21c724a359ea1bcb8389855")
    public override
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder.() -> Unit):
        Unit =
        virtualGatewayAccessLog(CfnVirtualGateway.VirtualGatewayAccessLogProperty(virtualGatewayAccessLog))

    public override
        fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty) {
      cdkBuilder.virtualNodeAccessLog(virtualNodeAccessLog.let(CfnVirtualNode.AccessLogProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c8911635fcfe0190553a5f9e21ab70e568d572b85c98c968563bc77ca18cbd9")
    public override
        fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty.Builder.() -> Unit):
        Unit = virtualNodeAccessLog(CfnVirtualNode.AccessLogProperty(virtualNodeAccessLog))

    public fun build(): software.amazon.awscdk.services.appmesh.AccessLogConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.AccessLogConfig,
  ) : AccessLogConfig {
    public override fun virtualGatewayAccessLog():
        CfnVirtualGateway.VirtualGatewayAccessLogProperty? =
        unwrap(this).getVirtualGatewayAccessLog()?.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::wrap)

    public override fun virtualNodeAccessLog(): CfnVirtualNode.AccessLogProperty? =
        unwrap(this).getVirtualNodeAccessLog()?.let(CfnVirtualNode.AccessLogProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.AccessLogConfig):
        AccessLogConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLogConfig):
        software.amazon.awscdk.services.appmesh.AccessLogConfig = (wrapped as Wrapper).cdkObject
  }
}
