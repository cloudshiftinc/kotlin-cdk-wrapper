@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about an HTTP header condition.
 *
 * There is a set of standard HTTP header fields. You can also define custom HTTP header fields.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * HttpHeaderConfigProperty httpHeaderConfigProperty = HttpHeaderConfigProperty.builder()
 * .httpHeaderName("httpHeaderName")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html)
 */
@CdkDslMarker
public class CfnListenerRuleHttpHeaderConfigPropertyDsl {
  private val cdkBuilder: CfnListenerRule.HttpHeaderConfigProperty.Builder =
      CfnListenerRule.HttpHeaderConfigProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param httpHeaderName The name of the HTTP header field.
   * The maximum size is 40 characters. The header name is case insensitive. The allowed characters
   * are specified by RFC 7230. Wildcards are not supported.
   */
  public fun httpHeaderName(httpHeaderName: String) {
    cdkBuilder.httpHeaderName(httpHeaderName)
  }

  /**
   * @param values The strings to compare against the value of the HTTP header.
   * The maximum size of each string is 128 characters. The comparison strings are case insensitive.
   * The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
   * exactly 1 character).
   *
   * If the same header appears multiple times in the request, we search them in order until a match
   * is found.
   *
   * If you specify multiple strings, the condition is satisfied if one of the strings matches the
   * value of the HTTP header. To require that all of the strings are a match, create one condition per
   * string.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The strings to compare against the value of the HTTP header.
   * The maximum size of each string is 128 characters. The comparison strings are case insensitive.
   * The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
   * exactly 1 character).
   *
   * If the same header appears multiple times in the request, we search them in order until a match
   * is found.
   *
   * If you specify multiple strings, the condition is satisfied if one of the strings matches the
   * value of the HTTP header. To require that all of the strings are a match, create one condition per
   * string.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnListenerRule.HttpHeaderConfigProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
