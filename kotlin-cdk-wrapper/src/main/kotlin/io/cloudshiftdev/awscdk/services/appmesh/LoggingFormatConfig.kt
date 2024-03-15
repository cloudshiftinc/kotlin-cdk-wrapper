@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LoggingFormatConfig {
  public fun formatConfig(): CfnVirtualNode.LoggingFormatProperty? =
      unwrap(this).getFormatConfig()?.let(CfnVirtualNode.LoggingFormatProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dcb7946dc2c6c875a6ccf78a9b9c848b63a6daabad21e3437766f6f7ca66181")
    public fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.LoggingFormatConfig.Builder =
        software.amazon.awscdk.services.appmesh.LoggingFormatConfig.builder()

    override fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty) {
      cdkBuilder.formatConfig(formatConfig.let(CfnVirtualNode.LoggingFormatProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dcb7946dc2c6c875a6ccf78a9b9c848b63a6daabad21e3437766f6f7ca66181")
    override
        fun formatConfig(formatConfig: CfnVirtualNode.LoggingFormatProperty.Builder.() -> Unit):
        Unit = formatConfig(CfnVirtualNode.LoggingFormatProperty(formatConfig))

    public fun build(): software.amazon.awscdk.services.appmesh.LoggingFormatConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormatConfig,
  ) : CdkObject(cdkObject), LoggingFormatConfig {
    override fun formatConfig(): CfnVirtualNode.LoggingFormatProperty? =
        unwrap(this).getFormatConfig()?.let(CfnVirtualNode.LoggingFormatProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFormatConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.LoggingFormatConfig):
        LoggingFormatConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingFormatConfig):
        software.amazon.awscdk.services.appmesh.LoggingFormatConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.LoggingFormatConfig
  }
}
