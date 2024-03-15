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
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationListener as CloudshiftdevAwscdkServicesElasticloadbalancingv2IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener as AmazonAwscdkServicesElasticloadbalancingv2IApplicationListener

public open class HttpAlbIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration,
) : HttpRouteIntegration(cdkObject) {
  public override fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun method(method: HttpMethod)

    public fun parameterMapping(parameterMapping: ParameterMapping)

    public fun secureServerName(secureServerName: String)

    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl(
    id: String,
    listener: AmazonAwscdkServicesElasticloadbalancingv2IApplicationListener,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration.Builder.create(id,
        listener)

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

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      listener: CloudshiftdevAwscdkServicesElasticloadbalancingv2IApplicationListener,
      block: Builder.() -> Unit = {},
    ): HttpAlbIntegration {
      val builderImpl = BuilderImpl(id,
          CloudshiftdevAwscdkServicesElasticloadbalancingv2IApplicationListener.unwrap(listener))
      return HttpAlbIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration):
        HttpAlbIntegration = HttpAlbIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpAlbIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration = wrapped.cdkObject
  }
}
