@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Represents a Mapping Value.
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
 * .parameterMapping(new ParameterMapping().appendHeader("header2",
 * MappingValue.requestHeader("header1")).removeHeader("header1"))
 * .build())
 * .build();
 * ```
 */
public open class MappingValue(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.MappingValue,
) : CdkObject(cdkObject),
    IMappingValue {
  /**
   * Represents a Mapping Value.
   */
  public override fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val NONE: MappingValue =
        MappingValue.wrap(software.amazon.awscdk.services.apigatewayv2.MappingValue.NONE)

    public fun contextVariable(variableName: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.contextVariable(variableName).let(MappingValue::wrap)

    public fun custom(`value`: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.custom(`value`).let(MappingValue::wrap)

    public fun requestBody(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestBody(name).let(MappingValue::wrap)

    public fun requestHeader(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestHeader(name).let(MappingValue::wrap)

    public fun requestPath(): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestPath().let(MappingValue::wrap)

    public fun requestPathParam(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestPathParam(name).let(MappingValue::wrap)

    public fun requestQueryString(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestQueryString(name).let(MappingValue::wrap)

    public fun stageVariable(variableName: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.stageVariable(variableName).let(MappingValue::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.MappingValue):
        MappingValue = MappingValue(cdkObject)

    internal fun unwrap(wrapped: MappingValue):
        software.amazon.awscdk.services.apigatewayv2.MappingValue = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.MappingValue
  }
}
