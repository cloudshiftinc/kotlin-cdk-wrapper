@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.Map

/**
 * Represents a Parameter Mapping.
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
public open class ParameterMapping internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.ParameterMapping,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.apigatewayv2.ParameterMapping()
  )

  /**
   * Creates a mapping to append a header.
   *
   * @param name 
   * @param value 
   */
  public open fun appendHeader(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).appendHeader(name, `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  /**
   * Creates a mapping to append a query string.
   *
   * @param name 
   * @param value 
   */
  public open fun appendQueryString(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).appendQueryString(name,
      `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  /**
   * Creates a custom mapping.
   *
   * @param key 
   * @param value 
   */
  public open fun custom(key: String, `value`: String): ParameterMapping = unwrap(this).custom(key,
      `value`).let(ParameterMapping::wrap)

  /**
   * Represents all created parameter mappings.
   */
  public open fun mappings(): Map<String, String> = unwrap(this).getMappings() ?: emptyMap()

  /**
   * Creates a mapping to overwrite a header.
   *
   * @param name 
   * @param value 
   */
  public open fun overwriteHeader(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).overwriteHeader(name,
      `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  /**
   * Creates a mapping to overwrite a path.
   *
   * @param value 
   */
  public open fun overwritePath(`value`: MappingValue): ParameterMapping =
      unwrap(this).overwritePath(`value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  /**
   * Creates a mapping to overwrite a querystring.
   *
   * @param name 
   * @param value 
   */
  public open fun overwriteQueryString(name: String, `value`: MappingValue): ParameterMapping =
      unwrap(this).overwriteQueryString(name,
      `value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

  /**
   * Creates a mapping to remove a header.
   *
   * @param name 
   */
  public open fun removeHeader(name: String): ParameterMapping =
      unwrap(this).removeHeader(name).let(ParameterMapping::wrap)

  /**
   * Creates a mapping to remove a querystring.
   *
   * @param name 
   */
  public open fun removeQueryString(name: String): ParameterMapping =
      unwrap(this).removeQueryString(name).let(ParameterMapping::wrap)

  public companion object {
    public fun fromObject(obj: Map<String, MappingValue>): ParameterMapping =
        software.amazon.awscdk.services.apigatewayv2.ParameterMapping.fromObject(obj.mapValues{MappingValue.unwrap(it.value)}).let(ParameterMapping::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ParameterMapping):
        ParameterMapping = ParameterMapping(cdkObject)

    internal fun unwrap(wrapped: ParameterMapping):
        software.amazon.awscdk.services.apigatewayv2.ParameterMapping = wrapped.cdkObject
  }
}
