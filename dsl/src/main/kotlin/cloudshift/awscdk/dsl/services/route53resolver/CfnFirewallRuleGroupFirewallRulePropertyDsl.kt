@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup

@CdkDslMarker
public class CfnFirewallRuleGroupFirewallRulePropertyDsl {
  private val cdkBuilder: CfnFirewallRuleGroup.FirewallRuleProperty.Builder =
      CfnFirewallRuleGroup.FirewallRuleProperty.builder()

  /**
   * @param action The action that DNS Firewall should take on a DNS query when it matches one of
   * the domains in the rule's domain list:  - `ALLOW` - Permit the request to go through. 
   * * `ALERT` - Permit the request to go through but send an alert to the logs.
   * * `BLOCK` - Disallow the request. If this is specified,then `BlockResponse` must also be
   * specified.
   *
   * if `BlockResponse` is `OVERRIDE` , then all of the following `OVERRIDE` attributes must be
   * specified:
   *
   * * `BlockOverrideDnsType`
   * * `BlockOverrideDomain`
   * * `BlockOverrideTtl`
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param blockOverrideDnsType The DNS record's type.
   * This determines the format of the record value that you provided in `BlockOverrideDomain` .
   * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
   */
  public fun blockOverrideDnsType(blockOverrideDnsType: String) {
    cdkBuilder.blockOverrideDnsType(blockOverrideDnsType)
  }

  /**
   * @param blockOverrideDomain The custom DNS record to send back in response to the query.
   * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
   */
  public fun blockOverrideDomain(blockOverrideDomain: String) {
    cdkBuilder.blockOverrideDomain(blockOverrideDomain)
  }

  /**
   * @param blockOverrideTtl The recommended amount of time, in seconds, for the DNS resolver or web
   * browser to cache the provided override record.
   * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
   */
  public fun blockOverrideTtl(blockOverrideTtl: Number) {
    cdkBuilder.blockOverrideTtl(blockOverrideTtl)
  }

  /**
   * @param blockResponse The way that you want DNS Firewall to block the request. Used for the rule
   * action setting `BLOCK` .
   * * `NODATA` - Respond indicating that the query was successful, but no response is available for
   * it.
   * * `NXDOMAIN` - Respond indicating that the domain name that's in the query doesn't exist.
   * * `OVERRIDE` - Provide a custom override in the response. This option requires custom handling
   * details in the rule's `BlockOverride*` settings.
   */
  public fun blockResponse(blockResponse: String) {
    cdkBuilder.blockResponse(blockResponse)
  }

  /**
   * @param firewallDomainListId The ID of the domain list that's used in the rule. 
   */
  public fun firewallDomainListId(firewallDomainListId: String) {
    cdkBuilder.firewallDomainListId(firewallDomainListId)
  }

  /**
   * @param priority The priority of the rule in the rule group. 
   * This value must be unique within the rule group. DNS Firewall processes the rules in a rule
   * group by order of priority, starting from the lowest setting.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnFirewallRuleGroup.FirewallRuleProperty = cdkBuilder.build()
}
