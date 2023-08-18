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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation
import software.constructs.Construct

/**
 * An association between a firewall rule group and a VPC, which enables DNS filtering for the VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnFirewallRuleGroupAssociation cfnFirewallRuleGroupAssociation =
 * CfnFirewallRuleGroupAssociation.Builder.create(this, "MyCfnFirewallRuleGroupAssociation")
 * .firewallRuleGroupId("firewallRuleGroupId")
 * .priority(123)
 * .vpcId("vpcId")
 * // the properties below are optional
 * .mutationProtection("mutationProtection")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html)
 */
@CdkDslMarker
public class CfnFirewallRuleGroupAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFirewallRuleGroupAssociation.Builder =
        CfnFirewallRuleGroupAssociation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The unique identifier of the firewall rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-firewallrulegroupid)
     *
     * @param firewallRuleGroupId The unique identifier of the firewall rule group.
     */
    public fun firewallRuleGroupId(firewallRuleGroupId: String) {
        cdkBuilder.firewallRuleGroupId(firewallRuleGroupId)
    }

    /**
     * If enabled, this setting disallows modification or removal of the association, to help
     * prevent against accidentally altering DNS firewall protections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-mutationprotection)
     *
     * @param mutationProtection If enabled, this setting disallows modification or removal of the
     *   association, to help prevent against accidentally altering DNS firewall protections.
     */
    public fun mutationProtection(mutationProtection: String) {
        cdkBuilder.mutationProtection(mutationProtection)
    }

    /**
     * The name of the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-name)
     *
     * @param name The name of the association.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The setting that determines the processing order of the rule group among the rule groups that
     * are associated with a single VPC.
     *
     * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
     * setting.
     *
     * You must specify a unique priority for each rule group that you associate with a single VPC.
     * To make it easier to insert rule groups later, leave space between the numbers, for example,
     * use 101, 200, and so on. You can change the priority setting for a rule group association
     * after you create it.
     *
     * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-priority)
     *
     * @param priority The setting that determines the processing order of the rule group among the
     *   rule groups that are associated with a single VPC.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
     *
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
     *
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The unique identifier of the VPC that is associated with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-vpcid)
     *
     * @param vpcId The unique identifier of the VPC that is associated with the rule group.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnFirewallRuleGroupAssociation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
