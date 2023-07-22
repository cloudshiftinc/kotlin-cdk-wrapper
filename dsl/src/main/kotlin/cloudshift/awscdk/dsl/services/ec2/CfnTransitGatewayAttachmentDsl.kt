@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnTransitGatewayAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayAttachment.Builder =
      CfnTransitGatewayAttachment.Builder.create(scope, id)

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The VPC attachment options.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-options)
   * @param options The VPC attachment options. 
   */
  public fun options(options: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(options)
    cdkBuilder.options(builder.map)
  }

  /**
   * The VPC attachment options.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-options)
   * @param options The VPC attachment options. 
   */
  public fun options(options: Any) {
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
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
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
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * The tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
   * @param tags The tags for the attachment. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-tags)
   * @param tags The tags for the attachment. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-transitgatewayid)
   * @param transitGatewayId The ID of the transit gateway. 
   */
  public fun transitGatewayId(transitGatewayId: String) {
    cdkBuilder.transitGatewayId(transitGatewayId)
  }

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayattachment.html#cfn-ec2-transitgatewayattachment-vpcid)
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnTransitGatewayAttachment {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
