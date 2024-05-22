@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigatewayv2.ContentHandling
import kotlin.Unit

/**
 * Props for Lambda type integration for a WebSocket Api.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.*;
 * WebSocketLambdaIntegrationProps webSocketLambdaIntegrationProps =
 * WebSocketLambdaIntegrationProps.builder()
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface WebSocketLambdaIntegrationProps {
  /**
   * Specifies how to handle response payload content type conversions.
   *
   * Default: - The response payload will be passed through from the integration response to
   * the route response or method response without modification.
   */
  public fun contentHandling(): ContentHandling? =
      unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

  /**
   * The maximum amount of time an integration will run before it returns without a response.
   *
   * Must be between 50 milliseconds and 29 seconds.
   *
   * Default: Duration.seconds(29)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [WebSocketLambdaIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentHandling Specifies how to handle response payload content type conversions.
     */
    public fun contentHandling(contentHandling: ContentHandling)

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * Must be between 50 milliseconds and 29 seconds.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegrationProps.Builder
        =
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegrationProps.builder()

    /**
     * @param contentHandling Specifies how to handle response payload content type conversions.
     */
    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling.Companion::unwrap))
    }

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * Must be between 50 milliseconds and 29 seconds.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegrationProps,
  ) : CdkObject(cdkObject), WebSocketLambdaIntegrationProps {
    /**
     * Specifies how to handle response payload content type conversions.
     *
     * Default: - The response payload will be passed through from the integration response to
     * the route response or method response without modification.
     */
    override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * Must be between 50 milliseconds and 29 seconds.
     *
     * Default: Duration.seconds(29)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketLambdaIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegrationProps):
        WebSocketLambdaIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as?
        WebSocketLambdaIntegrationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketLambdaIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegrationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegrationProps
  }
}
