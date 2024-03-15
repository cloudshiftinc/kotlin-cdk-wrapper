@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AccessLogDestinationConfig {
  public fun destinationArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun destinationArn(destinationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.Builder =
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.builder()

    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig,
  ) : CdkObject(cdkObject), AccessLogDestinationConfig {
    override fun destinationArn(): String = unwrap(this).getDestinationArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig):
        AccessLogDestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLogDestinationConfig):
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig
  }
}
