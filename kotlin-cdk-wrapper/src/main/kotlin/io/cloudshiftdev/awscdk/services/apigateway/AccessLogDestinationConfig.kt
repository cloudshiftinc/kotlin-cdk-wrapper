@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options when binding a log destination to a RestApi Stage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * AccessLogDestinationConfig accessLogDestinationConfig = AccessLogDestinationConfig.builder()
 * .destinationArn("destinationArn")
 * .build();
 * ```
 */
public interface AccessLogDestinationConfig {
  /**
   * The Amazon Resource Name (ARN) of the destination resource.
   */
  public fun destinationArn(): String

  /**
   * A builder for [AccessLogDestinationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination resource. 
     */
    public fun destinationArn(destinationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.Builder =
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig.builder()

    /**
     * @param destinationArn The Amazon Resource Name (ARN) of the destination resource. 
     */
    override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig,
  ) : CdkObject(cdkObject), AccessLogDestinationConfig {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     */
    override fun destinationArn(): String = unwrap(this).getDestinationArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig):
        AccessLogDestinationConfig = CdkObjectWrappers.wrap(cdkObject) as?
        AccessLogDestinationConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessLogDestinationConfig):
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig
  }
}
