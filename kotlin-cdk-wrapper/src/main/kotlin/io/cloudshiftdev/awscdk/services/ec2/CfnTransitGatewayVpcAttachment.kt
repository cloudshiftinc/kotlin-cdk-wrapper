@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a VPC attachment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayVpcAttachment cfnTransitGatewayVpcAttachment =
 * CfnTransitGatewayVpcAttachment.Builder.create(this, "MyCfnTransitGatewayVpcAttachment")
 * .subnetIds(List.of("subnetIds"))
 * .transitGatewayId("transitGatewayId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .addSubnetIds(List.of("addSubnetIds"))
 * .options(options)
 * .removeSubnetIds(List.of("removeSubnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html)
 */
public open class CfnTransitGatewayVpcAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The IDs of one or more subnets to add.
   */
  public open fun addSubnetIds(): List<String> = unwrap(this).getAddSubnetIds() ?: emptyList()

  /**
   * The IDs of one or more subnets to add.
   */
  public open fun addSubnetIds(`value`: List<String>) {
    unwrap(this).setAddSubnetIds(`value`)
  }

  /**
   * The IDs of one or more subnets to add.
   */
  public open fun addSubnetIds(vararg `value`: String): Unit = addSubnetIds(`value`.toList())

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
   * The IDs of one or more subnets to remove.
   */
  public open fun removeSubnetIds(): List<String> = unwrap(this).getRemoveSubnetIds() ?: emptyList()

  /**
   * The IDs of one or more subnets to remove.
   */
  public open fun removeSubnetIds(`value`: List<String>) {
    unwrap(this).setRemoveSubnetIds(`value`)
  }

  /**
   * The IDs of one or more subnets to remove.
   */
  public open fun removeSubnetIds(vararg `value`: String): Unit = removeSubnetIds(`value`.toList())

  /**
   * The IDs of the subnets.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The IDs of the subnets.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The IDs of the subnets.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the VPC attachment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the VPC attachment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the VPC attachment.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayVpcAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IDs of one or more subnets to add.
     *
     * You can specify at most one subnet per Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
     * @param addSubnetIds The IDs of one or more subnets to add. 
     */
    public fun addSubnetIds(addSubnetIds: List<String>)

    /**
     * The IDs of one or more subnets to add.
     *
     * You can specify at most one subnet per Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
     * @param addSubnetIds The IDs of one or more subnets to add. 
     */
    public fun addSubnetIds(vararg addSubnetIds: String)

    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-options)
     * @param options The VPC attachment options. 
     */
    public fun options(options: Any)

    /**
     * The IDs of one or more subnets to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
     * @param removeSubnetIds The IDs of one or more subnets to remove. 
     */
    public fun removeSubnetIds(removeSubnetIds: List<String>)

    /**
     * The IDs of one or more subnets to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
     * @param removeSubnetIds The IDs of one or more subnets to remove. 
     */
    public fun removeSubnetIds(vararg removeSubnetIds: String)

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
     * @param subnetIds The IDs of the subnets. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
     * @param subnetIds The IDs of the subnets. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags for the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
     * @param tags The tags for the VPC attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
     * @param tags The tags for the VPC attachment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.Builder.create(scope, id)

    /**
     * The IDs of one or more subnets to add.
     *
     * You can specify at most one subnet per Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
     * @param addSubnetIds The IDs of one or more subnets to add. 
     */
    override fun addSubnetIds(addSubnetIds: List<String>) {
      cdkBuilder.addSubnetIds(addSubnetIds)
    }

    /**
     * The IDs of one or more subnets to add.
     *
     * You can specify at most one subnet per Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
     * @param addSubnetIds The IDs of one or more subnets to add. 
     */
    override fun addSubnetIds(vararg addSubnetIds: String): Unit =
        addSubnetIds(addSubnetIds.toList())

    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-options)
     * @param options The VPC attachment options. 
     */
    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    /**
     * The IDs of one or more subnets to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
     * @param removeSubnetIds The IDs of one or more subnets to remove. 
     */
    override fun removeSubnetIds(removeSubnetIds: List<String>) {
      cdkBuilder.removeSubnetIds(removeSubnetIds)
    }

    /**
     * The IDs of one or more subnets to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
     * @param removeSubnetIds The IDs of one or more subnets to remove. 
     */
    override fun removeSubnetIds(vararg removeSubnetIds: String): Unit =
        removeSubnetIds(removeSubnetIds.toList())

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
     * @param subnetIds The IDs of the subnets. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
     * @param subnetIds The IDs of the subnets. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags for the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
     * @param tags The tags for the VPC attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
     * @param tags The tags for the VPC attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-transitgatewayid)
     * @param transitGatewayId The ID of the transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayVpcAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayVpcAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment):
        CfnTransitGatewayVpcAttachment = CfnTransitGatewayVpcAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayVpcAttachment):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment = wrapped.cdkObject
  }

  /**
   * Describes the VPC attachment options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * OptionsProperty optionsProperty = OptionsProperty.builder()
   * .applianceModeSupport("applianceModeSupport")
   * .dnsSupport("dnsSupport")
   * .ipv6Support("ipv6Support")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html)
   */
  public interface OptionsProperty {
    /**
     * Enable or disable appliance mode support.
     *
     * The default is `disable` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html#cfn-ec2-transitgatewayvpcattachment-options-appliancemodesupport)
     */
    public fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

    /**
     * Enable or disable DNS support.
     *
     * The default is `disable` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html#cfn-ec2-transitgatewayvpcattachment-options-dnssupport)
     */
    public fun dnsSupport(): String? = unwrap(this).getDnsSupport()

    /**
     * Enable or disable IPv6 support.
     *
     * The default is `disable` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html#cfn-ec2-transitgatewayvpcattachment-options-ipv6support)
     */
    public fun ipv6Support(): String? = unwrap(this).getIpv6Support()

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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty,
    ) : CdkObject(cdkObject), OptionsProperty {
      /**
       * Enable or disable appliance mode support.
       *
       * The default is `disable` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html#cfn-ec2-transitgatewayvpcattachment-options-appliancemodesupport)
       */
      override fun applianceModeSupport(): String? = unwrap(this).getApplianceModeSupport()

      /**
       * Enable or disable DNS support.
       *
       * The default is `disable` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html#cfn-ec2-transitgatewayvpcattachment-options-dnssupport)
       */
      override fun dnsSupport(): String? = unwrap(this).getDnsSupport()

      /**
       * Enable or disable IPv6 support.
       *
       * The default is `disable` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayvpcattachment-options.html#cfn-ec2-transitgatewayvpcattachment-options-ipv6support)
       */
      override fun ipv6Support(): String? = unwrap(this).getIpv6Support()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty):
          OptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? OptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.OptionsProperty
    }
  }
}
