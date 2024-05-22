@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * All Properties for Envoy Access Logging Format for mesh endpoints.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * LoggingFormatConfig loggingFormatConfig = LoggingFormatConfig.builder()
 * .formatConfig(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build();
 * ```
 */
public interface LoggingFormatConfig {
  /**
   * CFN configuration for Access Logging Format.
   *
   * Default: - no access logging format
   */
  public fun formatConfig(): CfnVirtualNode.LoggingFormatProperty? =
      unwrap(this).getFormatConfig()?.let(CfnVirtualNode.LoggingFormatProperty::wrap)

  /**
   * A builder for [LoggingFormatConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param formatConfig CFN configuration for Access Logging Format.
     */
    public fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty)

    /**
     * @param formatConfig CFN configuration for Access Logging Format.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dcb7946dc2c6c875a6ccf78a9b9c848b63a6daabad21e3437766f6f7ca66181")
    public fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.LoggingFormatConfig.Builder =
        software.amazon.awscdk.services.appmesh.LoggingFormatConfig.builder()

    /**
     * @param formatConfig CFN configuration for Access Logging Format.
     */
    override fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty) {
      cdkBuilder.formatConfig(formatConfig.let(CfnVirtualNode.LoggingFormatProperty.Companion::unwrap))
    }

    /**
     * @param formatConfig CFN configuration for Access Logging Format.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dcb7946dc2c6c875a6ccf78a9b9c848b63a6daabad21e3437766f6f7ca66181")
    override
        fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty.Builder.() -> Unit):
        Unit = formatConfig(CfnVirtualNode.LoggingFormatProperty(formatConfig))

    public fun build(): software.amazon.awscdk.services.appmesh.LoggingFormatConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormatConfig,
  ) : CdkObject(cdkObject), LoggingFormatConfig {
    /**
     * CFN configuration for Access Logging Format.
     *
     * Default: - no access logging format
     */
    override fun formatConfig(): CfnVirtualNode.LoggingFormatProperty? =
        unwrap(this).getFormatConfig()?.let(CfnVirtualNode.LoggingFormatProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFormatConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormatConfig):
        LoggingFormatConfig = CdkObjectWrappers.wrap(cdkObject) as? LoggingFormatConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingFormatConfig):
        software.amazon.awscdk.services.appmesh.LoggingFormatConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.LoggingFormatConfig
  }
}
