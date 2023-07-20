@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnRuleProps

@CdkDslMarker
public class CfnRulePropsDsl {
  private val cdkBuilder: CfnRuleProps.Builder = CfnRuleProps.builder()

  private val _predicates: MutableList<Any> = mutableListOf()

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun predicates(vararg predicates: Any) {
    _predicates.addAll(listOf(*predicates))
  }

  public fun predicates(predicates: Collection<Any>) {
    _predicates.addAll(predicates)
  }

  public fun predicates(predicates: IResolvable) {
    cdkBuilder.predicates(predicates)
  }

  public fun build(): CfnRuleProps {
    if(_predicates.isNotEmpty()) cdkBuilder.predicates(_predicates)
    return cdkBuilder.build()
  }
}
