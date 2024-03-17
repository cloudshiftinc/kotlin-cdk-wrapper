@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFirewall`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
 * CfnFirewallProps cfnFirewallProps = CfnFirewallProps.builder()
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
public interface CfnFirewallProps {
  /**
   * A flag indicating whether it is possible to delete the firewall.
   *
   * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this setting
   * to protect against accidentally deleting a firewall that is in use. When you create a firewall,
   * the operation initializes this flag to `TRUE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-deleteprotection)
   */
  public fun deleteProtection(): Any? = unwrap(this).getDeleteProtection()

  /**
   * A description of the firewall.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The descriptive name of the firewall.
   *
   * You can't change the name of a firewall after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallname)
   */
  public fun firewallName(): String

  /**
   * The Amazon Resource Name (ARN) of the firewall policy.
   *
   * The relationship of firewall to firewall policy is many to one. Each firewall requires one
   * firewall policy association, and you can use the same firewall policy for multiple firewalls.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicyarn)
   */
  public fun firewallPolicyArn(): String

  /**
   * A setting indicating whether the firewall is protected against a change to the firewall policy
   * association.
   *
   * Use this setting to protect against accidentally modifying the firewall policy for a firewall
   * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
   */
  public fun firewallPolicyChangeProtection(): Any? =
      unwrap(this).getFirewallPolicyChangeProtection()

  /**
   * A setting indicating whether the firewall is protected against changes to the subnet
   * associations.
   *
   * Use this setting to protect against accidentally modifying the subnet associations for a
   * firewall that is in use. When you create a firewall, the operation initializes this setting to
   * `TRUE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
   */
  public fun subnetChangeProtection(): Any? = unwrap(this).getSubnetChangeProtection()

  /**
   * The public subnets that Network Firewall is using for the firewall.
   *
   * Each subnet must belong to a different Availability Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
   */
  public fun subnetMappings(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The unique identifier of the VPC where the firewall is in use.
   *
   * You can't change the VPC of a firewall after you create the firewall.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnFirewallProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     */
    public fun deleteProtection(deleteProtection: Boolean)

    /**
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     */
    public fun deleteProtection(deleteProtection: IResolvable)

    /**
     * @param description A description of the firewall.
     */
    public fun description(description: String)

    /**
     * @param firewallName The descriptive name of the firewall. 
     * You can't change the name of a firewall after you create it.
     */
    public fun firewallName(firewallName: String)

    /**
     * @param firewallPolicyArn The Amazon Resource Name (ARN) of the firewall policy. 
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one
     * firewall policy association, and you can use the same firewall policy for multiple firewalls.
     */
    public fun firewallPolicyArn(firewallPolicyArn: String)

    /**
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association.
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     */
    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean)

    /**
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association.
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     */
    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable)

    /**
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations.
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     */
    public fun subnetChangeProtection(subnetChangeProtection: Boolean)

    /**
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations.
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     */
    public fun subnetChangeProtection(subnetChangeProtection: IResolvable)

    /**
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     * Each subnet must belong to a different Availability Zone.
     */
    public fun subnetMappings(subnetMappings: IResolvable)

    /**
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     * Each subnet must belong to a different Availability Zone.
     */
    public fun subnetMappings(subnetMappings: List<Any>)

    /**
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     * Each subnet must belong to a different Availability Zone.
     */
    public fun subnetMappings(vararg subnetMappings: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The unique identifier of the VPC where the firewall is in use. 
     * You can't change the VPC of a firewall after you create the firewall.
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkfirewall.CfnFirewallProps.Builder
        = software.amazon.awscdk.services.networkfirewall.CfnFirewallProps.builder()

    /**
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     */
    override fun deleteProtection(deleteProtection: Boolean) {
      cdkBuilder.deleteProtection(deleteProtection)
    }

    /**
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall.
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     */
    override fun deleteProtection(deleteProtection: IResolvable) {
      cdkBuilder.deleteProtection(deleteProtection.let(IResolvable::unwrap))
    }

    /**
     * @param description A description of the firewall.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param firewallName The descriptive name of the firewall. 
     * You can't change the name of a firewall after you create it.
     */
    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    /**
     * @param firewallPolicyArn The Amazon Resource Name (ARN) of the firewall policy. 
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one
     * firewall policy association, and you can use the same firewall policy for multiple firewalls.
     */
    override fun firewallPolicyArn(firewallPolicyArn: String) {
      cdkBuilder.firewallPolicyArn(firewallPolicyArn)
    }

    /**
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association.
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     */
    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
    }

    /**
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association.
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     */
    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection.let(IResolvable::unwrap))
    }

    /**
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations.
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     */
    override fun subnetChangeProtection(subnetChangeProtection: Boolean) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection)
    }

    /**
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations.
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     */
    override fun subnetChangeProtection(subnetChangeProtection: IResolvable) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection.let(IResolvable::unwrap))
    }

    /**
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     * Each subnet must belong to a different Availability Zone.
     */
    override fun subnetMappings(subnetMappings: IResolvable) {
      cdkBuilder.subnetMappings(subnetMappings.let(IResolvable::unwrap))
    }

    /**
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     * Each subnet must belong to a different Availability Zone.
     */
    override fun subnetMappings(subnetMappings: List<Any>) {
      cdkBuilder.subnetMappings(subnetMappings)
    }

    /**
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     * Each subnet must belong to a different Availability Zone.
     */
    override fun subnetMappings(vararg subnetMappings: Any): Unit =
        subnetMappings(subnetMappings.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The unique identifier of the VPC where the firewall is in use. 
     * You can't change the VPC of a firewall after you create the firewall.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewallProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallProps,
  ) : CdkObject(cdkObject), CfnFirewallProps {
    /**
     * A flag indicating whether it is possible to delete the firewall.
     *
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-deleteprotection)
     */
    override fun deleteProtection(): Any? = unwrap(this).getDeleteProtection()

    /**
     * A description of the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The descriptive name of the firewall.
     *
     * You can't change the name of a firewall after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallname)
     */
    override fun firewallName(): String = unwrap(this).getFirewallName()

    /**
     * The Amazon Resource Name (ARN) of the firewall policy.
     *
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one
     * firewall policy association, and you can use the same firewall policy for multiple firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicyarn)
     */
    override fun firewallPolicyArn(): String = unwrap(this).getFirewallPolicyArn()

    /**
     * A setting indicating whether the firewall is protected against a change to the firewall
     * policy association.
     *
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
     */
    override fun firewallPolicyChangeProtection(): Any? =
        unwrap(this).getFirewallPolicyChangeProtection()

    /**
     * A setting indicating whether the firewall is protected against changes to the subnet
     * associations.
     *
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
     */
    override fun subnetChangeProtection(): Any? = unwrap(this).getSubnetChangeProtection()

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     */
    override fun subnetMappings(): Any = unwrap(this).getSubnetMappings()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The unique identifier of the VPC where the firewall is in use.
     *
     * You can't change the VPC of a firewall after you create the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallProps):
        CfnFirewallProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFirewallProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallProps):
        software.amazon.awscdk.services.networkfirewall.CfnFirewallProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkfirewall.CfnFirewallProps
  }
}
