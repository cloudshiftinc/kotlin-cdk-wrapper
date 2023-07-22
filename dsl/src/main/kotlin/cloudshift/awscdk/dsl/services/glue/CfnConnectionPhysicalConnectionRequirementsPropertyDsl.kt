@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnConnection

@CdkDslMarker
public class CfnConnectionPhysicalConnectionRequirementsPropertyDsl {
  private val cdkBuilder: CfnConnection.PhysicalConnectionRequirementsProperty.Builder =
      CfnConnection.PhysicalConnectionRequirementsProperty.builder()

  private val _securityGroupIdList: MutableList<String> = mutableListOf()

  /**
   * @param availabilityZone The connection's Availability Zone.
   * This field is redundant because the specified subnet implies the Availability Zone to be used.
   * Currently the field must be populated, but it will be deprecated in the future.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param securityGroupIdList The security group ID list used by the connection.
   */
  public fun securityGroupIdList(vararg securityGroupIdList: String) {
    _securityGroupIdList.addAll(listOf(*securityGroupIdList))
  }

  /**
   * @param securityGroupIdList The security group ID list used by the connection.
   */
  public fun securityGroupIdList(securityGroupIdList: Collection<String>) {
    _securityGroupIdList.addAll(securityGroupIdList)
  }

  /**
   * @param subnetId The subnet ID used by the connection.
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnConnection.PhysicalConnectionRequirementsProperty {
    if(_securityGroupIdList.isNotEmpty()) cdkBuilder.securityGroupIdList(_securityGroupIdList)
    return cdkBuilder.build()
  }
}
