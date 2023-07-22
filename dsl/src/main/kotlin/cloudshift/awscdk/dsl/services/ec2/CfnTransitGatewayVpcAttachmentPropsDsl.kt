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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps

/**
 * Properties for defining a `CfnTransitGatewayVpcAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnTransitGatewayVpcAttachmentPropsDsl {
  private val cdkBuilder: CfnTransitGatewayVpcAttachmentProps.Builder =
      CfnTransitGatewayVpcAttachmentProps.builder()

  private val _addSubnetIds: MutableList<String> = mutableListOf()

  private val _removeSubnetIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param addSubnetIds The IDs of one or more subnets to add.
   * You can specify at most one subnet per Availability Zone.
   */
  public fun addSubnetIds(vararg addSubnetIds: String) {
    _addSubnetIds.addAll(listOf(*addSubnetIds))
  }

  /**
   * @param addSubnetIds The IDs of one or more subnets to add.
   * You can specify at most one subnet per Availability Zone.
   */
  public fun addSubnetIds(addSubnetIds: Collection<String>) {
    _addSubnetIds.addAll(addSubnetIds)
  }

  /**
   * @param options The VPC attachment options.
   */
  public fun options(options: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(options)
    cdkBuilder.options(builder.map)
  }

  /**
   * @param options The VPC attachment options.
   */
  public fun options(options: Any) {
    cdkBuilder.options(options)
  }

  /**
   * @param removeSubnetIds The IDs of one or more subnets to remove.
   */
  public fun removeSubnetIds(vararg removeSubnetIds: String) {
    _removeSubnetIds.addAll(listOf(*removeSubnetIds))
  }

  /**
   * @param removeSubnetIds The IDs of one or more subnets to remove.
   */
  public fun removeSubnetIds(removeSubnetIds: Collection<String>) {
    _removeSubnetIds.addAll(removeSubnetIds)
  }

  /**
   * @param subnetIds The IDs of the subnets. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The IDs of the subnets. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param tags The tags for the VPC attachment.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags for the VPC attachment.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param transitGatewayId The ID of the transit gateway. 
   */
  public fun transitGatewayId(transitGatewayId: String) {
    cdkBuilder.transitGatewayId(transitGatewayId)
  }

  /**
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnTransitGatewayVpcAttachmentProps {
    if(_addSubnetIds.isNotEmpty()) cdkBuilder.addSubnetIds(_addSubnetIds)
    if(_removeSubnetIds.isNotEmpty()) cdkBuilder.removeSubnetIds(_removeSubnetIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
