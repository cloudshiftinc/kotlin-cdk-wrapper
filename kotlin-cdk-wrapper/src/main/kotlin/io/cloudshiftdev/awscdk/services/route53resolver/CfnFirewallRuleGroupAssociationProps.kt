@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFirewallRuleGroupAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnFirewallRuleGroupAssociationProps cfnFirewallRuleGroupAssociationProps =
 * CfnFirewallRuleGroupAssociationProps.builder()
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
public interface CfnFirewallRuleGroupAssociationProps {
  /**
   * The unique identifier of the firewall rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-firewallrulegroupid)
   */
  public fun firewallRuleGroupId(): String

  /**
   * If enabled, this setting disallows modification or removal of the association, to help prevent
   * against accidentally altering DNS firewall protections.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-mutationprotection)
   */
  public fun mutationProtection(): String? = unwrap(this).getMutationProtection()

  /**
   * The name of the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The setting that determines the processing order of the rule group among the rule groups that
   * are associated with a single VPC.
   *
   * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
   * setting.
   *
   * You must specify a unique priority for each rule group that you associate with a single VPC. To
   * make it easier to insert rule groups later, leave space between the numbers, for example, use 101,
   * 200, and so on. You can change the priority setting for a rule group association after you create
   * it.
   *
   * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-priority)
   */
  public fun priority(): Number

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The unique identifier of the VPC that is associated with the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnFirewallRuleGroupAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param firewallRuleGroupId The unique identifier of the firewall rule group. 
     */
    public fun firewallRuleGroupId(firewallRuleGroupId: String)

    /**
     * @param mutationProtection If enabled, this setting disallows modification or removal of the
     * association, to help prevent against accidentally altering DNS firewall protections.
     */
    public fun mutationProtection(mutationProtection: String)

    /**
     * @param name The name of the association.
     */
    public fun name(name: String)

    /**
     * @param priority The setting that determines the processing order of the rule group among the
     * rule groups that are associated with a single VPC. 
     * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
     * setting.
     *
     * You must specify a unique priority for each rule group that you associate with a single VPC.
     * To make it easier to insert rule groups later, leave space between the numbers, for example, use
     * 101, 200, and so on. You can change the priority setting for a rule group association after you
     * create it.
     *
     * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
     */
    public fun priority(priority: Number)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The unique identifier of the VPC that is associated with the rule group. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps.Builder
        =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps.builder()

    /**
     * @param firewallRuleGroupId The unique identifier of the firewall rule group. 
     */
    override fun firewallRuleGroupId(firewallRuleGroupId: String) {
      cdkBuilder.firewallRuleGroupId(firewallRuleGroupId)
    }

    /**
     * @param mutationProtection If enabled, this setting disallows modification or removal of the
     * association, to help prevent against accidentally altering DNS firewall protections.
     */
    override fun mutationProtection(mutationProtection: String) {
      cdkBuilder.mutationProtection(mutationProtection)
    }

    /**
     * @param name The name of the association.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param priority The setting that determines the processing order of the rule group among the
     * rule groups that are associated with a single VPC. 
     * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
     * setting.
     *
     * You must specify a unique priority for each rule group that you associate with a single VPC.
     * To make it easier to insert rule groups later, leave space between the numbers, for example, use
     * 101, 200, and so on. You can change the priority setting for a rule group association after you
     * create it.
     *
     * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The unique identifier of the VPC that is associated with the rule group. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps,
  ) : CdkObject(cdkObject),
      CfnFirewallRuleGroupAssociationProps {
    /**
     * The unique identifier of the firewall rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-firewallrulegroupid)
     */
    override fun firewallRuleGroupId(): String = unwrap(this).getFirewallRuleGroupId()

    /**
     * If enabled, this setting disallows modification or removal of the association, to help
     * prevent against accidentally altering DNS firewall protections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-mutationprotection)
     */
    override fun mutationProtection(): String? = unwrap(this).getMutationProtection()

    /**
     * The name of the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The setting that determines the processing order of the rule group among the rule groups that
     * are associated with a single VPC.
     *
     * DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority
     * setting.
     *
     * You must specify a unique priority for each rule group that you associate with a single VPC.
     * To make it easier to insert rule groups later, leave space between the numbers, for example, use
     * 101, 200, and so on. You can change the priority setting for a rule group association after you
     * create it.
     *
     * The allowed values for `Priority` are between 100 and 9900 (excluding 100 and 9900).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-priority)
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The unique identifier of the VPC that is associated with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroupassociation.html#cfn-route53resolver-firewallrulegroupassociation-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnFirewallRuleGroupAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps):
        CfnFirewallRuleGroupAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnFirewallRuleGroupAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallRuleGroupAssociationProps):
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps
  }
}
