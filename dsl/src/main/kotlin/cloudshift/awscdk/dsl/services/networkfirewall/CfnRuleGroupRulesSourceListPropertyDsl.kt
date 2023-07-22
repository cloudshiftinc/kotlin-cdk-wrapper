@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * Stateful inspection criteria for a domain list rule group.
 *
 * For HTTPS traffic, domain filtering is SNI-based. It uses the server name indicator extension of
 * the TLS handshake.
 *
 * By default, Network Firewall domain list inspection only includes traffic coming from the VPC
 * where you deploy the firewall. To inspect traffic from IP addresses outside of the deployment VPC,
 * you set the `HOME_NET` rule variable to include the CIDR range of the deployment VPC plus the other
 * CIDR ranges. For more information, see `RuleGroup.RuleVariables` in this guide and [Stateful domain
 * list rule groups in AWS Network
 * Firewall](https://docs.aws.amazon.com/network-firewall/latest/developerguide/stateful-rule-groups-domain-names.html)
 * in the *Network Firewall Developer Guide*
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * RulesSourceListProperty rulesSourceListProperty = RulesSourceListProperty.builder()
 * .generatedRulesType("generatedRulesType")
 * .targets(List.of("targets"))
 * .targetTypes(List.of("targetTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html)
 */
@CdkDslMarker
public class CfnRuleGroupRulesSourceListPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RulesSourceListProperty.Builder =
      CfnRuleGroup.RulesSourceListProperty.builder()

  private val _targetTypes: MutableList<String> = mutableListOf()

  private val _targets: MutableList<String> = mutableListOf()

  /**
   * @param generatedRulesType Whether you want to allow or deny access to the domains in your
   * target list. 
   */
  public fun generatedRulesType(generatedRulesType: String) {
    cdkBuilder.generatedRulesType(generatedRulesType)
  }

  /**
   * @param targetTypes The types of targets to inspect for. 
   * Valid values are `TLS_SNI` and `HTTP_HOST` .
   */
  public fun targetTypes(vararg targetTypes: String) {
    _targetTypes.addAll(listOf(*targetTypes))
  }

  /**
   * @param targetTypes The types of targets to inspect for. 
   * Valid values are `TLS_SNI` and `HTTP_HOST` .
   */
  public fun targetTypes(targetTypes: Collection<String>) {
    _targetTypes.addAll(targetTypes)
  }

  /**
   * @param targets The domains that you want to inspect for in your traffic flows. Valid domain
   * specifications are the following:. 
   * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com` .
   * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For example,
   * `.example.com` matches `example.com` and matches all subdomains of `example.com` , such as
   * `abc.example.com` and `www.example.com` .
   */
  public fun targets(vararg targets: String) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets The domains that you want to inspect for in your traffic flows. Valid domain
   * specifications are the following:. 
   * * Explicit names. For example, `abc.example.com` matches only the domain `abc.example.com` .
   * * Names that use a domain wildcard, which you indicate with an initial ' `.` '. For example,
   * `.example.com` matches `example.com` and matches all subdomains of `example.com` , such as
   * `abc.example.com` and `www.example.com` .
   */
  public fun targets(targets: Collection<String>) {
    _targets.addAll(targets)
  }

  public fun build(): CfnRuleGroup.RulesSourceListProperty {
    if(_targetTypes.isNotEmpty()) cdkBuilder.targetTypes(_targetTypes)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
