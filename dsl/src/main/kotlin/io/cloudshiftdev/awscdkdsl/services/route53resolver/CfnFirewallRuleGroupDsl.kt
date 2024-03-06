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
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup
import software.constructs.Construct

/**
 * High-level information for a firewall rule group.
 *
 * A firewall rule group is a collection of rules that DNS Firewall uses to filter DNS network
 * traffic for a VPC. To retrieve the rules for the rule group, call
 * [ListFirewallRules](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListFirewallRules.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnFirewallRuleGroup cfnFirewallRuleGroup = CfnFirewallRuleGroup.Builder.create(this,
 * "MyCfnFirewallRuleGroup")
 * .firewallRules(List.of(FirewallRuleProperty.builder()
 * .action("action")
 * .firewallDomainListId("firewallDomainListId")
 * .priority(123)
 * // the properties below are optional
 * .blockOverrideDnsType("blockOverrideDnsType")
 * .blockOverrideDomain("blockOverrideDomain")
 * .blockOverrideTtl(123)
 * .blockResponse("blockResponse")
 * .qtype("qtype")
 * .build()))
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html)
 */
@CdkDslMarker
public class CfnFirewallRuleGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFirewallRuleGroup.Builder =
        CfnFirewallRuleGroup.Builder.create(scope, id)

    private val _firewallRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     *
     * @param firewallRules A list of the rules that you have defined.
     */
    public fun firewallRules(vararg firewallRules: Any) {
        _firewallRules.addAll(listOf(*firewallRules))
    }

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     *
     * @param firewallRules A list of the rules that you have defined.
     */
    public fun firewallRules(firewallRules: Collection<Any>) {
        _firewallRules.addAll(firewallRules)
    }

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     *
     * @param firewallRules A list of the rules that you have defined.
     */
    public fun firewallRules(firewallRules: IResolvable) {
        cdkBuilder.firewallRules(firewallRules)
    }

    /**
     * The name of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-name)
     *
     * @param name The name of the rule group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
     *
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
     *
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFirewallRuleGroup {
        if (_firewallRules.isNotEmpty()) cdkBuilder.firewallRules(_firewallRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
