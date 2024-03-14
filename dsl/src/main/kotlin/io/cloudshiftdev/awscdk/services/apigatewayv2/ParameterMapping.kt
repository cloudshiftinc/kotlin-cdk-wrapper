package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.collections.Map

public open class ParameterMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.ParameterMapping,
) {
  public open fun appendHeader(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).appendHeader(name, `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  public open fun appendQueryString(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).appendQueryString(name,
      `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  public open fun custom(key: String, `value`: String): ParameterMapping = unwrap(this).custom(key,
      `value`).let(ParameterMapping::wrap)

  public open fun mappings(): Map<String, String> = unwrap(this).getMappings() ?: emptyMap()

  public open fun overwriteHeader(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).overwriteHeader(name,
      `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  public open fun overwritePath(`value`: MappingValue): ParameterMapping =
      unwrap(this).overwritePath(`value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  public open fun overwriteQueryString(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).overwriteQueryString(name,
      `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  public open fun removeHeader(name: String): ParameterMapping =
      unwrap(this).removeHeader(name).let(ParameterMapping::wrap)

  public open fun removeQueryString(name: String): ParameterMapping =
      unwrap(this).removeQueryString(name).let(ParameterMapping::wrap)

  public companion object {
    public open fun fromObject(obj: Map<String, MappingValue>): ParameterMapping =
        software.amazon.awscdk.services.apigatewayv2.ParameterMapping.fromObject(obj.mapValues {
        MappingValue.unwrap(it.value)}).let(ParameterMapping::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ParameterMapping):
        ParameterMapping = ParameterMapping(cdkObject)

    internal fun unwrap(wrapped: ParameterMapping):
        software.amazon.awscdk.services.apigatewayv2.ParameterMapping = wrapped.cdkObject
  }
}
