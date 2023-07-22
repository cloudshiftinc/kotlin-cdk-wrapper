@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.managedblockchain.CfnNode

@CdkDslMarker
public class CfnNodeNodeConfigurationPropertyDsl {
  private val cdkBuilder: CfnNode.NodeConfigurationProperty.Builder =
      CfnNode.NodeConfigurationProperty.builder()

  /**
   * @param availabilityZone The Availability Zone in which the node exists. 
   * Required for Ethereum nodes.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param instanceType The Amazon Managed Blockchain instance type for the node. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun build(): CfnNode.NodeConfigurationProperty = cdkBuilder.build()
}
