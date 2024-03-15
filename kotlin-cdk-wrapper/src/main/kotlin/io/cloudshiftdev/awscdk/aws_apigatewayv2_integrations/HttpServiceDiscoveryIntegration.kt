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

public open class HttpServiceDiscoveryIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration,
) : HttpRouteIntegration(cdkObject) {
  public override fun bind(_options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(_options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(_options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(_options))

  @CdkDslMarker
  public interface Builder {
    public fun method(method: HttpMethod)

    public fun parameterMapping(parameterMapping: ParameterMapping)

    public fun secureServerName(secureServerName: String)

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

    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

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
