@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.constructs.Construct

@CdkDslMarker
public class CfnNodeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNode.Builder = CfnNode.Builder.create(scope, id)

  public fun memberId(memberId: String) {
    cdkBuilder.memberId(memberId)
  }

  public fun networkId(networkId: String) {
    cdkBuilder.networkId(networkId)
  }

  public fun nodeConfiguration(nodeConfiguration: IResolvable) {
    cdkBuilder.nodeConfiguration(nodeConfiguration)
  }

  public fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty) {
    cdkBuilder.nodeConfiguration(nodeConfiguration)
  }

  public fun build(): CfnNode = cdkBuilder.build()
}
