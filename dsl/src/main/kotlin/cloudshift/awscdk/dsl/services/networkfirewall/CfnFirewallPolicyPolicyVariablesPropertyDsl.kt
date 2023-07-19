@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyPolicyVariablesPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.PolicyVariablesProperty.Builder =
      CfnFirewallPolicy.PolicyVariablesProperty.builder()

  public fun ruleVariables(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.ruleVariables(builder.map)
  }

  public fun ruleVariables(ruleVariables: Map<String, Any>) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  public fun ruleVariables(ruleVariables: IResolvable) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  public fun build(): CfnFirewallPolicy.PolicyVariablesProperty = cdkBuilder.build()
}
