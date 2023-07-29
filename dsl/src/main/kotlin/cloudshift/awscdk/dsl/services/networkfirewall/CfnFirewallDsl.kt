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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import software.constructs.Construct

/**
 * Use the `Firewall` to provide stateful, managed, network firewall and intrusion detection and
 * prevention filtering for your VPCs in Amazon VPC .
 *
 * The firewall defines the configuration settings for an AWS Network Firewall firewall. The
 * settings include the firewall policy, the subnets in your VPC to use for the firewall endpoints,
 * and any tags that are attached to the firewall AWS resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnFirewall cfnFirewall = CfnFirewall.Builder.create(this, "MyCfnFirewall")
 * .firewallName("firewallName")
 * .firewallPolicyArn("firewallPolicyArn")
 * .subnetMappings(List.of(SubnetMappingProperty.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipAddressType("ipAddressType")
 * .build()))
 * .vpcId("vpcId")
 * // the properties below are optional
 * .deleteProtection(false)
 * .description("description")
 * .firewallPolicyChangeProtection(false)
 * .subnetChangeProtection(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html)
 */
@CdkDslMarker
public class CfnFirewallDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFirewall.Builder = CfnFirewall.Builder.create(scope, id)

    private val _subnetMappings: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A flag indicating whether it is possible to delete the firewall.
     *
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-deleteprotection)
     *
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
     */
    public fun deleteProtection(deleteProtection: Boolean) {
        cdkBuilder.deleteProtection(deleteProtection)
    }

    /**
     * A flag indicating whether it is possible to delete the firewall.
     *
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-deleteprotection)
     *
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
     */
    public fun deleteProtection(deleteProtection: IResolvable) {
        cdkBuilder.deleteProtection(deleteProtection)
    }

    /**
     * A description of the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-description)
     *
     * @param description A description of the firewall.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The descriptive name of the firewall.
     *
     * You can't change the name of a firewall after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallname)
     *
     * @param firewallName The descriptive name of the firewall.
     */
    public fun firewallName(firewallName: String) {
        cdkBuilder.firewallName(firewallName)
    }

    /**
     * The Amazon Resource Name (ARN) of the firewall policy.
     *
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one
     * firewall policy association, and you can use the same firewall policy for multiple firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicyarn)
     *
     * @param firewallPolicyArn The Amazon Resource Name (ARN) of the firewall policy.
     */
    public fun firewallPolicyArn(firewallPolicyArn: String) {
        cdkBuilder.firewallPolicyArn(firewallPolicyArn)
    }

    /**
     * A setting indicating whether the firewall is protected against a change to the firewall
     * policy association.
     *
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
     *
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     *   against a change to the firewall policy association.
     */
    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean) {
        cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
    }

    /**
     * A setting indicating whether the firewall is protected against a change to the firewall
     * policy association.
     *
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
     *
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     *   against a change to the firewall policy association.
     */
    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable) {
        cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
    }

    /**
     * A setting indicating whether the firewall is protected against changes to the subnet
     * associations.
     *
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting
     * to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
     *
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     *   changes to the subnet associations.
     */
    public fun subnetChangeProtection(subnetChangeProtection: Boolean) {
        cdkBuilder.subnetChangeProtection(subnetChangeProtection)
    }

    /**
     * A setting indicating whether the firewall is protected against changes to the subnet
     * associations.
     *
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting
     * to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
     *
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     *   changes to the subnet associations.
     */
    public fun subnetChangeProtection(subnetChangeProtection: IResolvable) {
        cdkBuilder.subnetChangeProtection(subnetChangeProtection)
    }

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     *
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall.
     */
    public fun subnetMappings(vararg subnetMappings: Any) {
        _subnetMappings.addAll(listOf(*subnetMappings))
    }

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     *
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall.
     */
    public fun subnetMappings(subnetMappings: Collection<Any>) {
        _subnetMappings.addAll(subnetMappings)
    }

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     *
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall.
     */
    public fun subnetMappings(subnetMappings: IResolvable) {
        cdkBuilder.subnetMappings(subnetMappings)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The unique identifier of the VPC where the firewall is in use.
     *
     * You can't change the VPC of a firewall after you create the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-vpcid)
     *
     * @param vpcId The unique identifier of the VPC where the firewall is in use.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnFirewall {
        if (_subnetMappings.isNotEmpty()) cdkBuilder.subnetMappings(_subnetMappings)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
