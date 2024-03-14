package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFirewall internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewall,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique IDs of the firewall endpoints for all of the subnets that you attached to the
   * firewall.
   *
   * The subnets are not listed in any particular order. For example:
   * `["us-west-2c:vpce-111122223333", "us-west-2a:vpce-987654321098", "us-west-2b:vpce-012345678901"]`
   * .
   */
  public open fun attrEndpointIds(): List<String> = unwrap(this).getAttrEndpointIds()

  /**
   * The Amazon Resource Name (ARN) of the `Firewall` .
   */
  public open fun attrFirewallArn(): String = unwrap(this).getAttrFirewallArn()

  /**
   * The name of the `Firewall` resource.
   */
  public open fun attrFirewallId(): String = unwrap(this).getAttrFirewallId()

  /**
   * A flag indicating whether it is possible to delete the firewall.
   */
  public open fun deleteProtection(): Any? = unwrap(this).getDeleteProtection()

  /**
   * A flag indicating whether it is possible to delete the firewall.
   */
  public open fun deleteProtection(`value`: Boolean) {
    unwrap(this).setDeleteProtection(`value`)
  }

  /**
   * A flag indicating whether it is possible to delete the firewall.
   */
  public open fun deleteProtection(`value`: IResolvable) {
    unwrap(this).setDeleteProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * A description of the firewall.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the firewall.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The descriptive name of the firewall.
   */
  public open fun firewallName(): String = unwrap(this).getFirewallName()

  /**
   * The descriptive name of the firewall.
   */
  public open fun firewallName(`value`: String) {
    unwrap(this).setFirewallName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the firewall policy.
   */
  public open fun firewallPolicyArn(): String = unwrap(this).getFirewallPolicyArn()

  /**
   * The Amazon Resource Name (ARN) of the firewall policy.
   */
  public open fun firewallPolicyArn(`value`: String) {
    unwrap(this).setFirewallPolicyArn(`value`)
  }

  /**
   * A setting indicating whether the firewall is protected against a change to the firewall policy
   * association.
   */
  public open fun firewallPolicyChangeProtection(): Any? =
      unwrap(this).getFirewallPolicyChangeProtection()

  /**
   * A setting indicating whether the firewall is protected against a change to the firewall policy
   * association.
   */
  public open fun firewallPolicyChangeProtection(`value`: Boolean) {
    unwrap(this).setFirewallPolicyChangeProtection(`value`)
  }

  /**
   * A setting indicating whether the firewall is protected against a change to the firewall policy
   * association.
   */
  public open fun firewallPolicyChangeProtection(`value`: IResolvable) {
    unwrap(this).setFirewallPolicyChangeProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A setting indicating whether the firewall is protected against changes to the subnet
   * associations.
   */
  public open fun subnetChangeProtection(): Any? = unwrap(this).getSubnetChangeProtection()

  /**
   * A setting indicating whether the firewall is protected against changes to the subnet
   * associations.
   */
  public open fun subnetChangeProtection(`value`: Boolean) {
    unwrap(this).setSubnetChangeProtection(`value`)
  }

  /**
   * A setting indicating whether the firewall is protected against changes to the subnet
   * associations.
   */
  public open fun subnetChangeProtection(`value`: IResolvable) {
    unwrap(this).setSubnetChangeProtection(`value`.let(IResolvable::unwrap))
  }

  /**
   * The public subnets that Network Firewall is using for the firewall.
   */
  public open fun subnetMappings(): Any = unwrap(this).getSubnetMappings()

  /**
   * The public subnets that Network Firewall is using for the firewall.
   */
  public open fun subnetMappings(`value`: IResolvable) {
    unwrap(this).setSubnetMappings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The public subnets that Network Firewall is using for the firewall.
   */
  public open fun subnetMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubnetMappings(__idx_ac66f0)
  }

  /**
   * The public subnets that Network Firewall is using for the firewall.
   */
  public open fun subnetMappings(vararg __idx_ac66f0: Any): Unit =
      subnetMappings(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The unique identifier of the VPC where the firewall is in use.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The unique identifier of the VPC where the firewall is in use.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkfirewall.CfnFirewall].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A flag indicating whether it is possible to delete the firewall.
     *
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-deleteprotection)
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall. 
     */
    public fun deleteProtection(deleteProtection: Boolean)

    /**
     * A flag indicating whether it is possible to delete the firewall.
     *
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-deleteprotection)
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall. 
     */
    public fun deleteProtection(deleteProtection: IResolvable)

    /**
     * A description of the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-description)
     * @param description A description of the firewall. 
     */
    public fun description(description: String)

    /**
     * The descriptive name of the firewall.
     *
     * You can't change the name of a firewall after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallname)
     * @param firewallName The descriptive name of the firewall. 
     */
    public fun firewallName(firewallName: String)

    /**
     * The Amazon Resource Name (ARN) of the firewall policy.
     *
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one
     * firewall policy association, and you can use the same firewall policy for multiple firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicyarn)
     * @param firewallPolicyArn The Amazon Resource Name (ARN) of the firewall policy. 
     */
    public fun firewallPolicyArn(firewallPolicyArn: String)

    /**
     * A setting indicating whether the firewall is protected against a change to the firewall
     * policy association.
     *
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association. 
     */
    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean)

    /**
     * A setting indicating whether the firewall is protected against a change to the firewall
     * policy association.
     *
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association. 
     */
    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable)

    /**
     * A setting indicating whether the firewall is protected against changes to the subnet
     * associations.
     *
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations. 
     */
    public fun subnetChangeProtection(subnetChangeProtection: Boolean)

    /**
     * A setting indicating whether the firewall is protected against changes to the subnet
     * associations.
     *
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations. 
     */
    public fun subnetChangeProtection(subnetChangeProtection: IResolvable)

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     */
    public fun subnetMappings(subnetMappings: IResolvable)

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     */
    public fun subnetMappings(subnetMappings: List<Any>)

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     */
    public fun subnetMappings(vararg subnetMappings: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The unique identifier of the VPC where the firewall is in use.
     *
     * You can't change the VPC of a firewall after you create the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-vpcid)
     * @param vpcId The unique identifier of the VPC where the firewall is in use. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkfirewall.CfnFirewall.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnFirewall.Builder.create(scope, id)

    /**
     * A flag indicating whether it is possible to delete the firewall.
     *
     * A setting of `TRUE` indicates that the firewall is protected against deletion. Use this
     * setting to protect against accidentally deleting a firewall that is in use. When you create a
     * firewall, the operation initializes this flag to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-deleteprotection)
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall. 
     */
    override fun deleteProtection(deleteProtection: Boolean) {
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
     * @param deleteProtection A flag indicating whether it is possible to delete the firewall. 
     */
    override fun deleteProtection(deleteProtection: IResolvable) {
      cdkBuilder.deleteProtection(deleteProtection.let(IResolvable::unwrap))
    }

    /**
     * A description of the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-description)
     * @param description A description of the firewall. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The descriptive name of the firewall.
     *
     * You can't change the name of a firewall after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallname)
     * @param firewallName The descriptive name of the firewall. 
     */
    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    /**
     * The Amazon Resource Name (ARN) of the firewall policy.
     *
     * The relationship of firewall to firewall policy is many to one. Each firewall requires one
     * firewall policy association, and you can use the same firewall policy for multiple firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicyarn)
     * @param firewallPolicyArn The Amazon Resource Name (ARN) of the firewall policy. 
     */
    override fun firewallPolicyArn(firewallPolicyArn: String) {
      cdkBuilder.firewallPolicyArn(firewallPolicyArn)
    }

    /**
     * A setting indicating whether the firewall is protected against a change to the firewall
     * policy association.
     *
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association. 
     */
    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
    }

    /**
     * A setting indicating whether the firewall is protected against a change to the firewall
     * policy association.
     *
     * Use this setting to protect against accidentally modifying the firewall policy for a firewall
     * that is in use. When you create a firewall, the operation initializes this setting to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-firewallpolicychangeprotection)
     * @param firewallPolicyChangeProtection A setting indicating whether the firewall is protected
     * against a change to the firewall policy association. 
     */
    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection.let(IResolvable::unwrap))
    }

    /**
     * A setting indicating whether the firewall is protected against changes to the subnet
     * associations.
     *
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations. 
     */
    override fun subnetChangeProtection(subnetChangeProtection: Boolean) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection)
    }

    /**
     * A setting indicating whether the firewall is protected against changes to the subnet
     * associations.
     *
     * Use this setting to protect against accidentally modifying the subnet associations for a
     * firewall that is in use. When you create a firewall, the operation initializes this setting to
     * `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetchangeprotection)
     * @param subnetChangeProtection A setting indicating whether the firewall is protected against
     * changes to the subnet associations. 
     */
    override fun subnetChangeProtection(subnetChangeProtection: IResolvable) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection.let(IResolvable::unwrap))
    }

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     */
    override fun subnetMappings(subnetMappings: IResolvable) {
      cdkBuilder.subnetMappings(subnetMappings.let(IResolvable::unwrap))
    }

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     */
    override fun subnetMappings(subnetMappings: List<Any>) {
      cdkBuilder.subnetMappings(subnetMappings)
    }

    /**
     * The public subnets that Network Firewall is using for the firewall.
     *
     * Each subnet must belong to a different Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-subnetmappings)
     * @param subnetMappings The public subnets that Network Firewall is using for the firewall. 
     */
    override fun subnetMappings(vararg subnetMappings: Any): Unit =
        subnetMappings(subnetMappings.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The unique identifier of the VPC where the firewall is in use.
     *
     * You can't change the VPC of a firewall after you create the firewall.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html#cfn-networkfirewall-firewall-vpcid)
     * @param vpcId The unique identifier of the VPC where the firewall is in use. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewall =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewall {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewall(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewall):
        CfnFirewall = CfnFirewall(cdkObject)

    internal fun unwrap(wrapped: CfnFirewall):
        software.amazon.awscdk.services.networkfirewall.CfnFirewall = wrapped.cdkObject
  }

  public interface SubnetMappingProperty {
    /**
     * The subnet's IP address type.
     *
     * You can't change the IP address type after you create the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewall-subnetmapping.html#cfn-networkfirewall-firewall-subnetmapping-ipaddresstype)
     */
    public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * The unique identifier for the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewall-subnetmapping.html#cfn-networkfirewall-firewall-subnetmapping-subnetid)
     */
    public fun subnetId(): String

    /**
     * A builder for [SubnetMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipAddressType The subnet's IP address type.
       * You can't change the IP address type after you create the subnet.
       */
      public fun ipAddressType(ipAddressType: String)

      /**
       * @param subnetId The unique identifier for the subnet. 
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty.builder()

      /**
       * @param ipAddressType The subnet's IP address type.
       * You can't change the IP address type after you create the subnet.
       */
      override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      /**
       * @param subnetId The unique identifier for the subnet. 
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty,
    ) : SubnetMappingProperty {
      /**
       * The subnet's IP address type.
       *
       * You can't change the IP address type after you create the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewall-subnetmapping.html#cfn-networkfirewall-firewall-subnetmapping-ipaddresstype)
       */
      override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

      /**
       * The unique identifier for the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewall-subnetmapping.html#cfn-networkfirewall-firewall-subnetmapping-subnetid)
       */
      override fun subnetId(): String = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubnetMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty):
          SubnetMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubnetMappingProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
