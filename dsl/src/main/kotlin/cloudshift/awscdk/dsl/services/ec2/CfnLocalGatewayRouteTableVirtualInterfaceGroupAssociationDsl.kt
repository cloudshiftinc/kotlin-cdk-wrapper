@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder =
      CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
    cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
  }

  public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
    cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
