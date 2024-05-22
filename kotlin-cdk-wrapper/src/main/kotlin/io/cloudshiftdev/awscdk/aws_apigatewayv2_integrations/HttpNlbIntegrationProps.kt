@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpMethod
import io.cloudshiftdev.awscdk.services.apigatewayv2.IVpcLink
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import kotlin.String
import kotlin.Unit

/**
 * Properties to initialize `HttpNlbIntegration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.*;
 * ParameterMapping parameterMapping;
 * VpcLink vpcLink;
 * HttpNlbIntegrationProps httpNlbIntegrationProps = HttpNlbIntegrationProps.builder()
 * .method(HttpMethod.ANY)
 * .parameterMapping(parameterMapping)
 * .secureServerName("secureServerName")
 * .vpcLink(vpcLink)
 * .build();
 * ```
 */
public interface HttpNlbIntegrationProps : HttpPrivateIntegrationOptions {
  /**
   * A builder for [HttpNlbIntegrationProps]
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
     * @param vpcLink The vpc link to be used for the private integration.
     */
    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps.builder()

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
     * @param vpcLink The vpc link to be used for the private integration.
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps,
  ) : CdkObject(cdkObject), HttpNlbIntegrationProps {
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
     * The vpc link to be used for the private integration.
     *
     * Default: - a new VpcLink is created
     */
    override fun vpcLink(): IVpcLink? = unwrap(this).getVpcLink()?.let(IVpcLink::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpNlbIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps):
        HttpNlbIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? HttpNlbIntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpNlbIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps
  }
}
