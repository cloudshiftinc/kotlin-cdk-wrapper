@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about an HTTP method condition.
 *
 * HTTP defines a set of request methods, also referred to as HTTP verbs. For more information, see
 * the [HTTP Method
 * Registry](https://docs.aws.amazon.com/https://www.iana.org/assignments/http-methods/http-methods.xhtml)
 * . You can also define custom HTTP methods.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * HttpRequestMethodConfigProperty httpRequestMethodConfigProperty =
 * HttpRequestMethodConfigProperty.builder()
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html)
 */
@CdkDslMarker
public class CfnListenerRuleHttpRequestMethodConfigPropertyDsl {
  private val cdkBuilder: CfnListenerRule.HttpRequestMethodConfigProperty.Builder =
      CfnListenerRule.HttpRequestMethodConfigProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param values The name of the request method.
   * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and underscore
   * (_). The comparison is case sensitive. Wildcards are not supported; therefore, the method name
   * must be an exact match.
   *
   * If you specify multiple strings, the condition is satisfied if one of the strings matches the
   * HTTP request method. We recommend that you route GET and HEAD requests in the same way, because
   * the response to a HEAD request may be cached.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The name of the request method.
   * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and underscore
   * (_). The comparison is case sensitive. Wildcards are not supported; therefore, the method name
   * must be an exact match.
   *
   * If you specify multiple strings, the condition is satisfied if one of the strings matches the
   * HTTP request method. We recommend that you route GET and HEAD requests in the same way, because
   * the response to a HEAD request may be cached.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnListenerRule.HttpRequestMethodConfigProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
