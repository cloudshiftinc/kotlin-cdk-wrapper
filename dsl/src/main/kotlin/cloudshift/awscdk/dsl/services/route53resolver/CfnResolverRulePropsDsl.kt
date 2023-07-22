@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps

/**
 * Properties for defining a `CfnResolverRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverRuleProps cfnResolverRuleProps = CfnResolverRuleProps.builder()
 * .domainName("domainName")
 * .ruleType("ruleType")
 * // the properties below are optional
 * .name("name")
 * .resolverEndpointId("resolverEndpointId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetIps(List.of(TargetAddressProperty.builder()
 * .ip("ip")
 * .ipv6("ipv6")
 * .port("port")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html)
 */
@CdkDslMarker
public class CfnResolverRulePropsDsl {
  private val cdkBuilder: CfnResolverRuleProps.Builder = CfnResolverRuleProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetIps: MutableList<Any> = mutableListOf()

  /**
   * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are
   * specified in `TargetIps` . 
   * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
   * routed using the Resolver rule that contains the most specific domain name (www.example.com).
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param name The name for the Resolver rule, which you specified when you created the Resolver
   * rule.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resolverEndpointId The ID of the endpoint that the rule is associated with.
   */
  public fun resolverEndpointId(resolverEndpointId: String) {
    cdkBuilder.resolverEndpointId(resolverEndpointId)
  }

  /**
   * @param ruleType When you want to forward DNS queries for specified domain name to resolvers on
   * your network, specify `FORWARD` . 
   * When you have a forwarding rule to forward DNS queries for a domain to your network and you
   * want Resolver to process queries for a subdomain of that domain, specify `SYSTEM` .
   *
   * For example, to forward DNS queries for example.com to resolvers on your network, you create a
   * rule and specify `FORWARD` for `RuleType` . To then have Resolver process queries for
   * apex.example.com, you create a rule and specify `SYSTEM` for `RuleType` .
   *
   * Currently, only Resolver can create rules that have a value of `RECURSIVE` for `RuleType` .
   */
  public fun ruleType(ruleType: String) {
    cdkBuilder.ruleType(ruleType)
  }

  /**
   * @param tags Tags help organize and categorize your Resolver rules.
   * Each tag consists of a key and an optional value, both of which you define.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Tags help organize and categorize your Resolver rules.
   * Each tag consists of a key and an optional value, both of which you define.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
   * forwards DNS queries to.
   * Typically, these are the IP addresses of DNS resolvers on your network.
   */
  public fun targetIps(vararg targetIps: Any) {
    _targetIps.addAll(listOf(*targetIps))
  }

  /**
   * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
   * forwards DNS queries to.
   * Typically, these are the IP addresses of DNS resolvers on your network.
   */
  public fun targetIps(targetIps: Collection<Any>) {
    _targetIps.addAll(targetIps)
  }

  /**
   * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
   * forwards DNS queries to.
   * Typically, these are the IP addresses of DNS resolvers on your network.
   */
  public fun targetIps(targetIps: IResolvable) {
    cdkBuilder.targetIps(targetIps)
  }

  public fun build(): CfnResolverRuleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetIps.isNotEmpty()) cdkBuilder.targetIps(_targetIps)
    return cdkBuilder.build()
  }
}
