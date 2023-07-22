@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

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
