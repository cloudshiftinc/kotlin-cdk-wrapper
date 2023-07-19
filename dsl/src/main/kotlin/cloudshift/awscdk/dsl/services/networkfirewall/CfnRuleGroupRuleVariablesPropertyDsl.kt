@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupRuleVariablesPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RuleVariablesProperty.Builder =
      CfnRuleGroup.RuleVariablesProperty.builder()

  public fun ipSets(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.ipSets(builder.map)
  }

  public fun ipSets(ipSets: Map<String, Any>) {
    cdkBuilder.ipSets(ipSets)
  }

  public fun ipSets(ipSets: IResolvable) {
    cdkBuilder.ipSets(ipSets)
  }

  public fun portSets(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.portSets(builder.map)
  }

  public fun portSets(portSets: Map<String, Any>) {
    cdkBuilder.portSets(portSets)
  }

  public fun portSets(portSets: IResolvable) {
    cdkBuilder.portSets(portSets)
  }

  public fun build(): CfnRuleGroup.RuleVariablesProperty = cdkBuilder.build()
}
