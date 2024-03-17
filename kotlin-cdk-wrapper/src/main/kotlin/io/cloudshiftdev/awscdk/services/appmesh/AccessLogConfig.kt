@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * All Properties for Envoy Access logs for mesh endpoints.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * AccessLogConfig accessLogConfig = AccessLogConfig.builder()
 * .virtualGatewayAccessLog(VirtualGatewayAccessLogProperty.builder()
 * .file(VirtualGatewayFileAccessLogProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .format(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build())
 * .build())
 * .virtualNodeAccessLog(AccessLogProperty.builder()
 * .file(FileAccessLogProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .format(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface AccessLogConfig {
  /**
   * VirtualGateway CFN configuration for Access Logging.
   *
   * Default: - no access logging
   */
  public fun virtualGatewayAccessLog(): CfnVirtualGateway.VirtualGatewayAccessLogProperty? =
      unwrap(this).getVirtualGatewayAccessLog()?.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::wrap)

  /**
   * VirtualNode CFN configuration for Access Logging.
   *
   * Default: - no access logging
   */
  public fun virtualNodeAccessLog(): CfnVirtualNode.AccessLogProperty? =
      unwrap(this).getVirtualNodeAccessLog()?.let(CfnVirtualNode.AccessLogProperty::wrap)

  /**
   * A builder for [AccessLogConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging.
     */
    public
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty)

    /**
     * @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31692470dacc90bc3e527d462b2d0309a24a4027b21c724a359ea1bcb8389855")
    public
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder.() -> Unit)

    /**
     * @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging.
     */
    public fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty)

    /**
     * @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c8911635fcfe0190553a5f9e21ab70e568d572b85c98c968563bc77ca18cbd9")
    public
        fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.AccessLogConfig.Builder =
        software.amazon.awscdk.services.appmesh.AccessLogConfig.builder()

    /**
     * @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging.
     */
    override
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
      cdkBuilder.virtualGatewayAccessLog(virtualGatewayAccessLog.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::unwrap))
    }

    /**
     * @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31692470dacc90bc3e527d462b2d0309a24a4027b21c724a359ea1bcb8389855")
    override
        fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder.() -> Unit):
        Unit =
        virtualGatewayAccessLog(CfnVirtualGateway.VirtualGatewayAccessLogProperty(virtualGatewayAccessLog))

    /**
     * @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging.
     */
    override fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty) {
      cdkBuilder.virtualNodeAccessLog(virtualNodeAccessLog.let(CfnVirtualNode.AccessLogProperty::unwrap))
    }

    /**
     * @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging.
     */
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
    /**
     * VirtualGateway CFN configuration for Access Logging.
     *
     * Default: - no access logging
     */
    override fun virtualGatewayAccessLog(): CfnVirtualGateway.VirtualGatewayAccessLogProperty? =
        unwrap(this).getVirtualGatewayAccessLog()?.let(CfnVirtualGateway.VirtualGatewayAccessLogProperty::wrap)

    /**
     * VirtualNode CFN configuration for Access Logging.
     *
     * Default: - no access logging
     */
    override fun virtualNodeAccessLog(): CfnVirtualNode.AccessLogProperty? =
        unwrap(this).getVirtualNodeAccessLog()?.let(CfnVirtualNode.AccessLogProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.AccessLogConfig):
        AccessLogConfig = CdkObjectWrappers.wrap(cdkObject) as? AccessLogConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLogConfig):
        software.amazon.awscdk.services.appmesh.AccessLogConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.AccessLogConfig
  }
}
