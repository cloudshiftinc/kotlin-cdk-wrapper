@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplatePlacementPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.PlacementProperty.Builder =
      CfnLaunchTemplate.PlacementProperty.builder()

  public fun affinity(affinity: String) {
    cdkBuilder.affinity(affinity)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun hostId(hostId: String) {
    cdkBuilder.hostId(hostId)
  }

  public fun hostResourceGroupArn(hostResourceGroupArn: String) {
    cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
  }

  public fun partitionNumber(partitionNumber: Number) {
    cdkBuilder.partitionNumber(partitionNumber)
  }

  public fun spreadDomain(spreadDomain: String) {
    cdkBuilder.spreadDomain(spreadDomain)
  }

  public fun tenancy(tenancy: String) {
    cdkBuilder.tenancy(tenancy)
  }

  public fun build(): CfnLaunchTemplate.PlacementProperty = cdkBuilder.build()
}
