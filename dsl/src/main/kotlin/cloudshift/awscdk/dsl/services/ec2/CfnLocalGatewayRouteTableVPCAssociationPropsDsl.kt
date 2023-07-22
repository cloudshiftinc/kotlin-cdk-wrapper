@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps

/**
 * Properties for defining a `CfnLocalGatewayRouteTableVPCAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteTableVPCAssociationProps cfnLocalGatewayRouteTableVPCAssociationProps =
 * CfnLocalGatewayRouteTableVPCAssociationProps.builder()
 * .localGatewayRouteTableId("localGatewayRouteTableId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html)
 */
@CdkDslMarker
public class CfnLocalGatewayRouteTableVPCAssociationPropsDsl {
  private val cdkBuilder: CfnLocalGatewayRouteTableVPCAssociationProps.Builder =
      CfnLocalGatewayRouteTableVPCAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param localGatewayRouteTableId The ID of the local gateway route table. 
   */
  public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
    cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
  }

  /**
   * @param tags The tags assigned to the association.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags assigned to the association.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnLocalGatewayRouteTableVPCAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
