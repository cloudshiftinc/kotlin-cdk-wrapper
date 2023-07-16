@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps

@CdkDslMarker
public class CfnVPCPeeringConnectionPropsDsl {
  private val cdkBuilder: CfnVPCPeeringConnectionProps.Builder =
      CfnVPCPeeringConnectionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun peerOwnerId(peerOwnerId: String) {
    cdkBuilder.peerOwnerId(peerOwnerId)
  }

  public fun peerRegion(peerRegion: String) {
    cdkBuilder.peerRegion(peerRegion)
  }

  public fun peerRoleArn(peerRoleArn: String) {
    cdkBuilder.peerRoleArn(peerRoleArn)
  }

  public fun peerVpcId(peerVpcId: String) {
    cdkBuilder.peerVpcId(peerVpcId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVPCPeeringConnectionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
