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

@CdkDslMarker
public class CfnTransitGatewayVpcAttachmentPropsDsl {
  private val cdkBuilder: CfnTransitGatewayVpcAttachmentProps.Builder =
      CfnTransitGatewayVpcAttachmentProps.builder()

  private val _addSubnetIds: MutableList<String> = mutableListOf()

  private val _removeSubnetIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun addSubnetIds(vararg addSubnetIds: String) {
    _addSubnetIds.addAll(listOf(*addSubnetIds))
  }

  public fun addSubnetIds(addSubnetIds: Collection<String>) {
    _addSubnetIds.addAll(addSubnetIds)
  }

  public fun options(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.options(builder.map)
  }

  public fun options(options: Any) {
    cdkBuilder.options(options)
  }

  public fun removeSubnetIds(vararg removeSubnetIds: String) {
    _removeSubnetIds.addAll(listOf(*removeSubnetIds))
  }

  public fun removeSubnetIds(removeSubnetIds: Collection<String>) {
    _removeSubnetIds.addAll(removeSubnetIds)
  }

  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun transitGatewayId(transitGatewayId: String) {
    cdkBuilder.transitGatewayId(transitGatewayId)
  }

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
