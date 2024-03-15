@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.apigatewayv2.PayloadFormatVersion
import kotlin.Unit

public interface HttpLambdaIntegrationProps {
  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  public fun payloadFormatVersion(): PayloadFormatVersion? =
      unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun parameterMapping(parameterMapping: ParameterMapping)

    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps.builder()

    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps,
  ) : CdkObject(cdkObject), HttpLambdaIntegrationProps {
    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    override fun payloadFormatVersion(): PayloadFormatVersion? =
        unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpLambdaIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps):
        HttpLambdaIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpLambdaIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps
  }
}
