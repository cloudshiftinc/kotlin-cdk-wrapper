@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps

@CdkDslMarker
public class CfnNetworkInterfacePermissionPropsDsl {
  private val cdkBuilder: CfnNetworkInterfacePermissionProps.Builder =
      CfnNetworkInterfacePermissionProps.builder()

  /**
   * @param awsAccountId The AWS account ID. 
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param networkInterfaceId The ID of the network interface. 
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * @param permission The type of permission to grant: `INSTANCE-ATTACH` or `EIP-ASSOCIATE` . 
   */
  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  public fun build(): CfnNetworkInterfacePermissionProps = cdkBuilder.build()
}
