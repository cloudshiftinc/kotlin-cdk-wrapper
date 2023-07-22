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

  /**
   * @param ipSets A list of IP addresses and address ranges, in CIDR notation.
   */
  public fun ipSets(ipSets: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(ipSets)
    cdkBuilder.ipSets(builder.map)
  }

  /**
   * @param ipSets A list of IP addresses and address ranges, in CIDR notation.
   */
  public fun ipSets(ipSets: Map<String, Any>) {
    cdkBuilder.ipSets(ipSets)
  }

  /**
   * @param ipSets A list of IP addresses and address ranges, in CIDR notation.
   */
  public fun ipSets(ipSets: IResolvable) {
    cdkBuilder.ipSets(ipSets)
  }

  /**
   * @param portSets A list of port ranges.
   */
  public fun portSets(portSets: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(portSets)
    cdkBuilder.portSets(builder.map)
  }

  /**
   * @param portSets A list of port ranges.
   */
  public fun portSets(portSets: Map<String, Any>) {
    cdkBuilder.portSets(portSets)
  }

  /**
   * @param portSets A list of port ranges.
   */
  public fun portSets(portSets: IResolvable) {
    cdkBuilder.portSets(portSets)
  }

  public fun build(): CfnRuleGroup.RuleVariablesProperty = cdkBuilder.build()
}
