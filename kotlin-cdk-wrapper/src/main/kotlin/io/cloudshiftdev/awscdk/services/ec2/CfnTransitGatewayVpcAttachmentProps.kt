@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTransitGatewayVpcAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayVpcAttachmentProps cfnTransitGatewayVpcAttachmentProps =
 * CfnTransitGatewayVpcAttachmentProps.builder()
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
public interface CfnTransitGatewayVpcAttachmentProps {
  /**
   * The IDs of one or more subnets to add.
   *
   * You can specify at most one subnet per Availability Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
   */
  public fun addSubnetIds(): List<String> = unwrap(this).getAddSubnetIds() ?: emptyList()

  /**
   * The VPC attachment options.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-options)
   */
  public fun options(): Any? = unwrap(this).getOptions()

  /**
   * The IDs of one or more subnets to remove.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
   */
  public fun removeSubnetIds(): List<String> = unwrap(this).getRemoveSubnetIds() ?: emptyList()

  /**
   * The IDs of the subnets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The tags for the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-transitgatewayid)
   */
  public fun transitGatewayId(): String

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnTransitGatewayVpcAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addSubnetIds The IDs of one or more subnets to add.
     * You can specify at most one subnet per Availability Zone.
     */
    public fun addSubnetIds(addSubnetIds: List<String>)

    /**
     * @param addSubnetIds The IDs of one or more subnets to add.
     * You can specify at most one subnet per Availability Zone.
     */
    public fun addSubnetIds(vararg addSubnetIds: String)

    /**
     * @param options The VPC attachment options.
     */
    public fun options(options: Any)

    /**
     * @param removeSubnetIds The IDs of one or more subnets to remove.
     */
    public fun removeSubnetIds(removeSubnetIds: List<String>)

    /**
     * @param removeSubnetIds The IDs of one or more subnets to remove.
     */
    public fun removeSubnetIds(vararg removeSubnetIds: String)

    /**
     * @param subnetIds The IDs of the subnets. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The IDs of the subnets. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The tags for the VPC attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the VPC attachment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayId The ID of the transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps.builder()

    /**
     * @param addSubnetIds The IDs of one or more subnets to add.
     * You can specify at most one subnet per Availability Zone.
     */
    override fun addSubnetIds(addSubnetIds: List<String>) {
      cdkBuilder.addSubnetIds(addSubnetIds)
    }

    /**
     * @param addSubnetIds The IDs of one or more subnets to add.
     * You can specify at most one subnet per Availability Zone.
     */
    override fun addSubnetIds(vararg addSubnetIds: String): Unit =
        addSubnetIds(addSubnetIds.toList())

    /**
     * @param options The VPC attachment options.
     */
    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    /**
     * @param removeSubnetIds The IDs of one or more subnets to remove.
     */
    override fun removeSubnetIds(removeSubnetIds: List<String>) {
      cdkBuilder.removeSubnetIds(removeSubnetIds)
    }

    /**
     * @param removeSubnetIds The IDs of one or more subnets to remove.
     */
    override fun removeSubnetIds(vararg removeSubnetIds: String): Unit =
        removeSubnetIds(removeSubnetIds.toList())

    /**
     * @param subnetIds The IDs of the subnets. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The IDs of the subnets. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The tags for the VPC attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the VPC attachment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayId The ID of the transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnTransitGatewayVpcAttachmentProps {
    /**
     * The IDs of one or more subnets to add.
     *
     * You can specify at most one subnet per Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-addsubnetids)
     */
    override fun addSubnetIds(): List<String> = unwrap(this).getAddSubnetIds() ?: emptyList()

    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-options)
     */
    override fun options(): Any? = unwrap(this).getOptions()

    /**
     * The IDs of one or more subnets to remove.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-removesubnetids)
     */
    override fun removeSubnetIds(): List<String> = unwrap(this).getRemoveSubnetIds() ?: emptyList()

    /**
     * The IDs of the subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The tags for the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-transitgatewayid)
     */
    override fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayvpcattachment.html#cfn-ec2-transitgatewayvpcattachment-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayVpcAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps):
        CfnTransitGatewayVpcAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransitGatewayVpcAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayVpcAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps
  }
}
