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

  /**
   * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
   * `HOME_NET` variable.
   * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
   * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
   * Network Firewall by default uses the CIDR of your inspection VPC.
   */
  public fun ruleVariables(ruleVariables: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(ruleVariables)
    cdkBuilder.ruleVariables(builder.map)
  }

  /**
   * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
   * `HOME_NET` variable.
   * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
   * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
   * Network Firewall by default uses the CIDR of your inspection VPC.
   */
  public fun ruleVariables(ruleVariables: Map<String, Any>) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  /**
   * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
   * `HOME_NET` variable.
   * If your firewall uses an inspection VPC, you might want to override the `HOME_NET` variable
   * with the CIDRs of your home networks. If you don't override `HOME_NET` with your own CIDRs,
   * Network Firewall by default uses the CIDR of your inspection VPC.
   */
  public fun ruleVariables(ruleVariables: IResolvable) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  public fun build(): CfnFirewallPolicy.PolicyVariablesProperty = cdkBuilder.build()
}
