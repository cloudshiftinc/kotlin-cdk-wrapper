@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@CdkDslMarker
public class CfnListenerRuleQueryStringConfigPropertyDsl {
  private val cdkBuilder: CfnListenerRule.QueryStringConfigProperty.Builder =
      CfnListenerRule.QueryStringConfigProperty.builder()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * @param values The key/value pairs or values to find in the query string.
   * The maximum size of each string is 128 characters. The comparison is case insensitive. The
   * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
   * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
   * escape these characters in `Values` using a '' character.
   *
   * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is
   * found in the query string.
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The key/value pairs or values to find in the query string.
   * The maximum size of each string is 128 characters. The comparison is case insensitive. The
   * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
   * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
   * escape these characters in `Values` using a '' character.
   *
   * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is
   * found in the query string.
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * @param values The key/value pairs or values to find in the query string.
   * The maximum size of each string is 128 characters. The comparison is case insensitive. The
   * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
   * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
   * escape these characters in `Values` using a '' character.
   *
   * If you specify multiple key/value pairs or values, the condition is satisfied if one of them is
   * found in the query string.
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnListenerRule.QueryStringConfigProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
