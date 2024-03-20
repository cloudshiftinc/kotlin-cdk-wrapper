@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpMethod
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.IVpcLink
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.servicediscovery.IService as CloudshiftdevAwscdkServicesServicediscoveryIService
import software.amazon.awscdk.services.servicediscovery.IService as AmazonAwscdkServicesServicediscoveryIService

/**
 * The Service Discovery integration resource for HTTP API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration;
 * Vpc vpc = new Vpc(this, "VPC");
 * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "Namespace")
 * .name("boobar.com")
 * .vpc(vpc)
 * .build();
 * Service service = namespace.createService("Service");
 * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
 * .defaultIntegration(HttpServiceDiscoveryIntegration.Builder.create("DefaultIntegration", service)
 * .vpcLink(vpcLink)
 * .build())
 * .build();
 * ```
 */
public open class HttpServiceDiscoveryIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration,
) : HttpRouteIntegration(cdkObject) {
  public constructor(id: String, service: CloudshiftdevAwscdkServicesServicediscoveryIService) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration(id,
      service.let(CloudshiftdevAwscdkServicesServicediscoveryIService::unwrap))
  )

  public constructor(
    id: String,
    service: CloudshiftdevAwscdkServicesServicediscoveryIService,
    props: HttpServiceDiscoveryIntegrationProps,
  ) : this(software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration(id,
      service.let(CloudshiftdevAwscdkServicesServicediscoveryIService::unwrap),
      props.let(HttpServiceDiscoveryIntegrationProps::unwrap))
  )

  public constructor(
    id: String,
    service: CloudshiftdevAwscdkServicesServicediscoveryIService,
    props: HttpServiceDiscoveryIntegrationProps.Builder.() -> Unit,
  ) : this(id, service, HttpServiceDiscoveryIntegrationProps(props)
  )

  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  public override fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy. 
     */
    public fun method(method: HttpMethod)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * Specifies the server name to verified by HTTPS when calling the backend integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration. 
     */
    public fun secureServerName(secureServerName: String)

    /**
     * The vpc link to be used for the private integration.
     *
     * Default: - a new VpcLink is created
     *
     * @param vpcLink The vpc link to be used for the private integration. 
     */
    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl(
    id: String,
    service: AmazonAwscdkServicesServicediscoveryIService,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration.Builder
        =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration.Builder.create(id,
        service)

    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    /**
     * Specifies the server name to verified by HTTPS when calling the backend integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration. 
     */
    override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

    /**
     * The vpc link to be used for the private integration.
     *
     * Default: - a new VpcLink is created
     *
     * @param vpcLink The vpc link to be used for the private integration. 
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      service: CloudshiftdevAwscdkServicesServicediscoveryIService,
      block: Builder.() -> Unit = {},
    ): HttpServiceDiscoveryIntegration {
      val builderImpl = BuilderImpl(id,
          CloudshiftdevAwscdkServicesServicediscoveryIService.unwrap(service))
      return HttpServiceDiscoveryIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration):
        HttpServiceDiscoveryIntegration = HttpServiceDiscoveryIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpServiceDiscoveryIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration =
        wrapped.cdkObject
  }
}
