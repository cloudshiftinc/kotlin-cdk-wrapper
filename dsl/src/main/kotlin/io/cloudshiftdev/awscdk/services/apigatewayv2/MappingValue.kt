package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String

public open class MappingValue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.MappingValue,
) : IMappingValue {
  public override fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public open fun contextVariable(variableName: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.contextVariable(variableName).let(MappingValue::wrap)

    public open fun custom(`value`: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.custom(`value`).let(MappingValue::wrap)

    public open fun requestBody(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestBody(name).let(MappingValue::wrap)

    public open fun requestHeader(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestHeader(name).let(MappingValue::wrap)

    public open fun requestPath(): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestPath().let(MappingValue::wrap)

    public open fun requestPathParam(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestPathParam(name).let(MappingValue::wrap)

    public open fun requestQueryString(name: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.requestQueryString(name).let(MappingValue::wrap)

    public open fun stageVariable(variableName: String): MappingValue =
        software.amazon.awscdk.services.apigatewayv2.MappingValue.stageVariable(variableName).let(MappingValue::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.MappingValue):
        MappingValue = MappingValue(cdkObject)

    internal fun unwrap(wrapped: MappingValue):
        software.amazon.awscdk.services.apigatewayv2.MappingValue = wrapped.cdkObject
  }
}
