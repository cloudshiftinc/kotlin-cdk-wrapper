package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayAttachment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the attachment.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The VPC attachment options.
   */
  public open fun options(): Any? = unwrap(this).getOptions()

  /**
   * The VPC attachment options.
   */
  public open fun options(`value`: Any) {
    unwrap(this).setOptions(`value`)
  }

  /**
   * The IDs of one or more subnets.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The IDs of one or more subnets.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The IDs of one or more subnets.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the attachment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the attachment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the attachment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the transit gateway.
   */
  public open fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

  /**
   * The ID of the transit gateway.
   */
  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-options)
     * @param options The VPC attachment options. 
     */
    public fun options(options: Any)

    /**
     * The IDs of one or more subnets.
     *
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-subnetids)
     * @param subnetIds The IDs of one or more subnets. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The IDs of one or more subnets.
     *
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-subnetids)
     * @param subnetIds The IDs of one or more subnets. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
     * @param tags The tags for the attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
     * @param tags The tags for the attachment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.Builder
        = software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.Builder.create(scope, id)

    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-options)
     * @param options The VPC attachment options. 
     */
    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    /**
     * The IDs of one or more subnets.
     *
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-subnetids)
     * @param subnetIds The IDs of one or more subnets. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The IDs of one or more subnets.
     *
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-subnetids)
     * @param subnetIds The IDs of one or more subnets. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
     * @param tags The tags for the attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
     * @param tags The tags for the attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment):
        CfnTransitGatewayAttachment = CfnTransitGatewayAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayAttachment):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment = wrapped.cdkObject
  }

  public interface OptionsProperty {
    /**
     * Enable or disable appliance mode support.
     *
     * The default is `disable` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-appliancemodesupport)
     */
    public fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

    /**
     * Enable or disable DNS support.
     *
     * The default is `disable` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-dnssupport)
     */
    public fun dnsSupport(): String? = unwrap(this).getDnsSupport()

    /**
     * Enable or disable IPv6 support.
     *
     * The default is `disable` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-ipv6support)
     */
    public fun ipv6Support(): String? = unwrap(this).getIpv6Support()

    /**
     * Enables you to reference a security group across VPCs attached to a transit gateway (TGW).
     *
     * Use this option to simplify security group management and control of instance-to-instance
     * traffic across VPCs that are connected by transit gateway. You can also use this option to
     * migrate from VPC peering (which was the only option that supported security group referencing)
     * to transit gateways (which now also support security group referencing). This option is disabled
     * by default and there are no additional costs to use this feature.
     *
     * For important information about this feature, see [Create a transit
     * gateway](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-transit-gateways.html#create-tgw) in the
     * *AWS Transit Gateway Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-securitygroupreferencingsupport)
     */
    public fun securityGroupReferencingSupport(): String? =
        unwrap(this).getSecurityGroupReferencingSupport()

    /**
     * A builder for [OptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applianceModeSupport Enable or disable appliance mode support.
       * The default is `disable` .
       */
      public fun applianceModeSupport(applianceModeSupport: String)

      /**
       * @param dnsSupport Enable or disable DNS support.
       * The default is `disable` .
       */
      public fun dnsSupport(dnsSupport: String)

      /**
       * @param ipv6Support Enable or disable IPv6 support.
       * The default is `disable` .
       */
      public fun ipv6Support(ipv6Support: String)

      /**
       * @param securityGroupReferencingSupport Enables you to reference a security group across
       * VPCs attached to a transit gateway (TGW).
       * Use this option to simplify security group management and control of instance-to-instance
       * traffic across VPCs that are connected by transit gateway. You can also use this option to
       * migrate from VPC peering (which was the only option that supported security group referencing)
       * to transit gateways (which now also support security group referencing). This option is
       * disabled by default and there are no additional costs to use this feature.
       *
       * For important information about this feature, see [Create a transit
       * gateway](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-transit-gateways.html#create-tgw) in
       * the *AWS Transit Gateway Guide* .
       */
      public fun securityGroupReferencingSupport(securityGroupReferencingSupport: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty.builder()

      /**
       * @param applianceModeSupport Enable or disable appliance mode support.
       * The default is `disable` .
       */
      override fun applianceModeSupport(applianceModeSupport: String) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
      }

      /**
       * @param dnsSupport Enable or disable DNS support.
       * The default is `disable` .
       */
      override fun dnsSupport(dnsSupport: String) {
        cdkBuilder.dnsSupport(dnsSupport)
      }

      /**
       * @param ipv6Support Enable or disable IPv6 support.
       * The default is `disable` .
       */
      override fun ipv6Support(ipv6Support: String) {
        cdkBuilder.ipv6Support(ipv6Support)
      }

      /**
       * @param securityGroupReferencingSupport Enables you to reference a security group across
       * VPCs attached to a transit gateway (TGW).
       * Use this option to simplify security group management and control of instance-to-instance
       * traffic across VPCs that are connected by transit gateway. You can also use this option to
       * migrate from VPC peering (which was the only option that supported security group referencing)
       * to transit gateways (which now also support security group referencing). This option is
       * disabled by default and there are no additional costs to use this feature.
       *
       * For important information about this feature, see [Create a transit
       * gateway](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-transit-gateways.html#create-tgw) in
       * the *AWS Transit Gateway Guide* .
       */
      override fun securityGroupReferencingSupport(securityGroupReferencingSupport: String) {
        cdkBuilder.securityGroupReferencingSupport(securityGroupReferencingSupport)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty,
    ) : CdkObject(cdkObject), OptionsProperty {
      /**
       * Enable or disable appliance mode support.
       *
       * The default is `disable` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-appliancemodesupport)
       */
      override fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

      /**
       * Enable or disable DNS support.
       *
       * The default is `disable` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-dnssupport)
       */
      override fun dnsSupport(): String? = unwrap(this).getDnsSupport()

      /**
       * Enable or disable IPv6 support.
       *
       * The default is `disable` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-ipv6support)
       */
      override fun ipv6Support(): String? = unwrap(this).getIpv6Support()

      /**
       * Enables you to reference a security group across VPCs attached to a transit gateway (TGW).
       *
       * Use this option to simplify security group management and control of instance-to-instance
       * traffic across VPCs that are connected by transit gateway. You can also use this option to
       * migrate from VPC peering (which was the only option that supported security group referencing)
       * to transit gateways (which now also support security group referencing). This option is
       * disabled by default and there are no additional costs to use this feature.
       *
       * For important information about this feature, see [Create a transit
       * gateway](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-transit-gateways.html#create-tgw) in
       * the *AWS Transit Gateway Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html#cfn-ec2-transitgatewayattachment-options-securitygroupreferencingsupport)
       */
      override fun securityGroupReferencingSupport(): String? =
          unwrap(this).getSecurityGroupReferencingSupport()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty):
          OptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty
    }
  }
}
