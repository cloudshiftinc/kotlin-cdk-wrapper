@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@CdkDslMarker
public class CfnListenerRulePathPatternConfigPropertyDsl {
  private val cdkBuilder: CfnListenerRule.PathPatternConfigProperty.Builder =
      CfnListenerRule.PathPatternConfigProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param values The path patterns to compare against the request URL.
   * The maximum size of each string is 128 characters. The comparison is case sensitive. The
   * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
   * exactly 1 character).
   *
   * If you specify multiple strings, the condition is satisfied if one of them matches the request
   * URL. The path pattern is compared only to the path of the URL, not to its query string.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The path patterns to compare against the request URL.
   * The maximum size of each string is 128 characters. The comparison is case sensitive. The
   * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
   * exactly 1 character).
   *
   * If you specify multiple strings, the condition is satisfied if one of them matches the request
   * URL. The path pattern is compared only to the path of the URL, not to its query string.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnListenerRule.PathPatternConfigProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
