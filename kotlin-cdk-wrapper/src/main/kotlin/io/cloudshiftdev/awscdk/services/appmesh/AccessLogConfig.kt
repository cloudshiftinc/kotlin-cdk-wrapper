@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AccessLogConfig {
  public fun virtualGatewayAccessLog(): CfnVirtualGateway.VirtualGatewayAccessLogProperty? =
      unwrap(this).getVirtualGatewayAccessLog()?.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::wrap)

  public fun virtualNodeAccessLog(): CfnVirtualNode.AccessLogProperty? =
      unwrap(this).getVirtualNodeAccessLog()?.let(CfnVirtualNode.AccessLogProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31692470dacc90bc3e527d462b2d0309a24a4027b21c724a359ea1bcb8389855")
    public
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder.() -> Unit)

    public fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c8911635fcfe0190553a5f9e21ab70e568d572b85c98c968563bc77ca18cbd9")
    public
        fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.AccessLogConfig.Builder =
        software.amazon.awscdk.services.appmesh.AccessLogConfig.builder()

    override
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
      cdkBuilder.virtualGatewayAccessLog(virtualGatewayAccessLog.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31692470dacc90bc3e527d462b2d0309a24a4027b21c724a359ea1bcb8389855")
    override
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder.() -> Unit):
        Unit =
        virtualGatewayAccessLog(CfnVirtualGateway.VirtualGatewayAccessLogProperty(virtualGatewayAccessLog))

    override fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty) {
      cdkBuilder.virtualNodeAccessLog(virtualNodeAccessLog.let(CfnVirtualNode.AccessLogProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c8911635fcfe0190553a5f9e21ab70e568d572b85c98c968563bc77ca18cbd9")
    override
        fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty.Builder.() -> Unit):
        Unit = virtualNodeAccessLog(CfnVirtualNode.AccessLogProperty(virtualNodeAccessLog))

    public fun build(): software.amazon.awscdk.services.appmesh.AccessLogConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.AccessLogConfig,
  ) : CdkObject(cdkObject), AccessLogConfig {
    override fun virtualGatewayAccessLog(): CfnVirtualGateway.VirtualGatewayAccessLogProperty? =
        unwrap(this).getVirtualGatewayAccessLog()?.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::wrap)

    override fun virtualNodeAccessLog(): CfnVirtualNode.AccessLogProperty? =
        unwrap(this).getVirtualNodeAccessLog()?.let(CfnVirtualNode.AccessLogProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.AccessLogConfig):
        AccessLogConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLogConfig):
        software.amazon.awscdk.services.appmesh.AccessLogConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.AccessLogConfig
  }
}
