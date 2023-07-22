@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.managedblockchain.CfnNode

/**
 * Configuration properties of a peer node within a membership.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * NodeConfigurationProperty nodeConfigurationProperty = NodeConfigurationProperty.builder()
 * .availabilityZone("availabilityZone")
 * .instanceType("instanceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html)
 */
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
