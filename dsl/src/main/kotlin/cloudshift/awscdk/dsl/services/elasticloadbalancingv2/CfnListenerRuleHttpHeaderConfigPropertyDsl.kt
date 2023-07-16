@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@CdkDslMarker
public class CfnListenerRuleHttpHeaderConfigPropertyDsl {
  private val cdkBuilder: CfnListenerRule.HttpHeaderConfigProperty.Builder =
      CfnListenerRule.HttpHeaderConfigProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  public fun httpHeaderName(httpHeaderName: String) {
    cdkBuilder.httpHeaderName(httpHeaderName)
  }

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnListenerRule.HttpHeaderConfigProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
