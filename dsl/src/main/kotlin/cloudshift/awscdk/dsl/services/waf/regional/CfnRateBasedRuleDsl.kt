@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
import software.constructs.Construct

@CdkDslMarker
public class CfnRateBasedRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRateBasedRule.Builder = CfnRateBasedRule.Builder.create(scope, id)

  private val _matchPredicates: MutableList<Any> = mutableListOf()

  public fun matchPredicates(vararg matchPredicates: Any) {
    _matchPredicates.addAll(listOf(*matchPredicates))
  }

  public fun matchPredicates(matchPredicates: Collection<Any>) {
    _matchPredicates.addAll(matchPredicates)
  }

  public fun matchPredicates(matchPredicates: IResolvable) {
    cdkBuilder.matchPredicates(matchPredicates)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun rateKey(rateKey: String) {
    cdkBuilder.rateKey(rateKey)
  }

  public fun rateLimit(rateLimit: Number) {
    cdkBuilder.rateLimit(rateLimit)
  }

  public fun build(): CfnRateBasedRule {
    if(_matchPredicates.isNotEmpty()) cdkBuilder.matchPredicates(_matchPredicates)
    return cdkBuilder.build()
  }
}
