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
 * Properties for defining a `CfnTransitGatewayAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object options;
 * CfnTransitGatewayAttachmentProps cfnTransitGatewayAttachmentProps =
 * CfnTransitGatewayAttachmentProps.builder()
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
public interface CfnTransitGatewayAttachmentProps {
  /**
   * The VPC attachment options.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-options)
   */
  public fun options(): Any? = unwrap(this).getOptions()

  /**
   * The IDs of one or more subnets.
   *
   * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
   * but we recommend that you specify two subnets for better availability. The transit gateway uses
   * one IP address from each specified subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-transitgatewayid)
   */
  public fun transitGatewayId(): String

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnTransitGatewayAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param options The VPC attachment options.
     */
    public fun options(options: Any)

    /**
     * @param subnetIds The IDs of one or more subnets. 
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The IDs of one or more subnets. 
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The tags for the attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the attachment.
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
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps.builder()

    /**
     * @param options The VPC attachment options.
     */
    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    /**
     * @param subnetIds The IDs of one or more subnets. 
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The IDs of one or more subnets. 
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The tags for the attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the attachment.
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

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayAttachmentProps {
    /**
     * The VPC attachment options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-options)
     */
    override fun options(): Any? = unwrap(this).getOptions()

    /**
     * The IDs of one or more subnets.
     *
     * You can specify only one subnet per Availability Zone. You must specify at least one subnet,
     * but we recommend that you specify two subnets for better availability. The transit gateway uses
     * one IP address from each specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-transitgatewayid)
     */
    override fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps):
        CfnTransitGatewayAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransitGatewayAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps
  }
}
