@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.route53resolver

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53resolver.CfnResolverRule
import software.constructs.Construct

/**
 * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass
 * through, one domain name that you want to forward to your network, and the IP addresses of the
 * DNS resolvers in your network.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverRule cfnResolverRule = CfnResolverRule.Builder.create(this, "MyCfnResolverRule")
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
 * .protocol("protocol")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html)
 */
@CdkDslMarker
public class CfnResolverRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverRule.Builder = CfnResolverRule.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _targetIps: MutableList<Any> = mutableListOf()

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in
     * `TargetIps` .
     *
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
     * routed using the Resolver rule that contains the most specific domain name (www.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-domainname)
     *
     * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are
     *   specified in `TargetIps` .
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-name)
     *
     * @param name The name for the Resolver rule, which you specified when you created the Resolver
     *   rule.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ID of the endpoint that the rule is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-resolverendpointid)
     *
     * @param resolverEndpointId The ID of the endpoint that the rule is associated with.
     */
    public fun resolverEndpointId(resolverEndpointId: String) {
        cdkBuilder.resolverEndpointId(resolverEndpointId)
    }

    /**
     * When you want to forward DNS queries for specified domain name to resolvers on your network,
     * specify `FORWARD` .
     *
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you
     * want Resolver to process queries for a subdomain of that domain, specify `SYSTEM` .
     *
     * For example, to forward DNS queries for example.com to resolvers on your network, you create
     * a rule and specify `FORWARD` for `RuleType` . To then have Resolver process queries for
     * apex.example.com, you create a rule and specify `SYSTEM` for `RuleType` .
     *
     * Currently, only Resolver can create rules that have a value of `RECURSIVE` for `RuleType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-ruletype)
     *
     * @param ruleType When you want to forward DNS queries for specified domain name to resolvers
     *   on your network, specify `FORWARD` .
     */
    public fun ruleType(ruleType: String) {
        cdkBuilder.ruleType(ruleType)
    }

    /**
     * Tags help organize and categorize your Resolver rules.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
     *
     * @param tags Tags help organize and categorize your Resolver rules.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags help organize and categorize your Resolver rules.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
     *
     * @param tags Tags help organize and categorize your Resolver rules.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     *
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     *   forwards DNS queries to.
     */
    public fun targetIps(vararg targetIps: Any) {
        _targetIps.addAll(listOf(*targetIps))
    }

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     *
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     *   forwards DNS queries to.
     */
    public fun targetIps(targetIps: Collection<Any>) {
        _targetIps.addAll(targetIps)
    }

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     *
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     *   forwards DNS queries to.
     */
    public fun targetIps(targetIps: IResolvable) {
        cdkBuilder.targetIps(targetIps)
    }

    public fun build(): CfnResolverRule {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targetIps.isNotEmpty()) cdkBuilder.targetIps(_targetIps)
        return cdkBuilder.build()
    }
}
