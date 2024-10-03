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
 * Attaches a VPC to a transit gateway.
 *
 * If you attach a VPC with a CIDR range that overlaps the CIDR range of a VPC that is already
 * attached, the new VPC CIDR range is not propagated to the default propagation route table.
 *
 * To send VPC traffic to an attached transit gateway, add a route to the VPC route table using
 * [AWS::EC2::Route](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
 * .
 *
 * To update tags for a VPC attachment after creation without replacing the attachment, use
 * [AWS::EC2::TransitGatewayVpcAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html)
 * instead.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayAttachment cfnTransitGatewayAttachment =
 * CfnTransitGatewayAttachment.Builder.create(this, "MyCfnTransitGatewayAttachment")
 * .subnetIds(List.of("subnetIds"))
 * .transitGatewayId("transitGatewayId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .options(options)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html)
 */
public open class CfnTransitGatewayAttachment(
  cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTransitGatewayAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayAttachmentProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html)
   */
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

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty,
    ) : CdkObject(cdkObject),
        OptionsProperty {
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
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty):
          OptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? OptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.OptionsProperty
    }
  }
}
