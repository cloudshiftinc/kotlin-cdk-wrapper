@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpMethod
import io.cloudshiftdev.awscdk.services.apigatewayv2.IVpcLink
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import kotlin.String
import kotlin.Unit

/**
 * Properties to initialize `HttpAlbIntegration`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
 * ApplicationLoadBalancer lb;
 * ApplicationListener listener = lb.addListener("listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * listener.addTargets("target", AddApplicationTargetsProps.builder()
 * .port(80)
 * .build());
 * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
 * .defaultIntegration(HttpAlbIntegration.Builder.create("DefaultIntegration", listener)
 * .parameterMapping(new ParameterMapping().custom("myKey", "myValue"))
 * .build())
 * .build();
 * ```
 */
public interface HttpAlbIntegrationProps : HttpPrivateIntegrationOptions {
  /**
   * A builder for [HttpAlbIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy.
     */
    public fun method(method: HttpMethod)

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration.
     */
    public fun secureServerName(secureServerName: String)

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * Must be between 50 milliseconds and 29 seconds.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param vpcLink The vpc link to be used for the private integration.
     */
    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps.builder()

    /**
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy.
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod.Companion::unwrap))
    }

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping.Companion::unwrap))
    }

    /**
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration.
     */
    override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * Must be between 50 milliseconds and 29 seconds.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param vpcLink The vpc link to be used for the private integration.
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps,
  ) : CdkObject(cdkObject),
      HttpAlbIntegrationProps {
    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     */
    override fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

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
     * Specifies the server name to verified by HTTPS when calling the backend integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     */
    override fun secureServerName(): String? = unwrap(this).getSecureServerName()

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * Must be between 50 milliseconds and 29 seconds.
     *
     * Default: Duration.seconds(29)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The vpc link to be used for the private integration.
     *
     * Default: - a new VpcLink is created
     */
    override fun vpcLink(): IVpcLink? = unwrap(this).getVpcLink()?.let(IVpcLink::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpAlbIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps):
        HttpAlbIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? HttpAlbIntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpAlbIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps
  }
}
