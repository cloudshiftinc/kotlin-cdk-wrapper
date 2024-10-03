@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.apigatewayv2.PayloadFormatVersion
import kotlin.Unit

/**
 * Lambda Proxy integration properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.*;
 * ParameterMapping parameterMapping;
 * PayloadFormatVersion payloadFormatVersion;
 * HttpLambdaIntegrationProps httpLambdaIntegrationProps = HttpLambdaIntegrationProps.builder()
 * .parameterMapping(parameterMapping)
 * .payloadFormatVersion(payloadFormatVersion)
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface HttpLambdaIntegrationProps {
  /**
   * Specifies how to transform HTTP requests before sending them to the backend.
   *
   * Default: undefined requests are sent to the backend unmodified
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   */
  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  /**
   * Version of the payload sent to the lambda handler.
   *
   * Default: PayloadFormatVersion.VERSION_2_0
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
   */
  public fun payloadFormatVersion(): PayloadFormatVersion? =
      unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)

  /**
   * The maximum amount of time an integration will run before it returns without a response.
   *
   * Must be between 50 milliseconds and 29 seconds.
   *
   * Default: Duration.seconds(29)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [HttpLambdaIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * @param payloadFormatVersion Version of the payload sent to the lambda handler.
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * Must be between 50 milliseconds and 29 seconds.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps.builder()

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping.Companion::unwrap))
    }

    /**
     * @param payloadFormatVersion Version of the payload sent to the lambda handler.
     */
    override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion.Companion::unwrap))
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
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps,
  ) : CdkObject(cdkObject),
      HttpLambdaIntegrationProps {
    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     */
    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    /**
     * Version of the payload sent to the lambda handler.
     *
     * Default: PayloadFormatVersion.VERSION_2_0
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     */
    override fun payloadFormatVersion(): PayloadFormatVersion? =
        unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpLambdaIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps):
        HttpLambdaIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as?
        HttpLambdaIntegrationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpLambdaIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps
  }
}
