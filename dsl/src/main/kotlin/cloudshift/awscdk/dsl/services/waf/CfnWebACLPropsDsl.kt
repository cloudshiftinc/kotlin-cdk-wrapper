@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnWebACL
import software.amazon.awscdk.services.waf.CfnWebACLProps

@CdkDslMarker
public class CfnWebACLPropsDsl {
  private val cdkBuilder: CfnWebACLProps.Builder = CfnWebACLProps.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  public fun defaultAction(defaultAction: IResolvable) {
    cdkBuilder.defaultAction(defaultAction)
  }

  public fun defaultAction(defaultAction: CfnWebACL.WafActionProperty) {
    cdkBuilder.defaultAction(defaultAction)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnWebACLProps {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
