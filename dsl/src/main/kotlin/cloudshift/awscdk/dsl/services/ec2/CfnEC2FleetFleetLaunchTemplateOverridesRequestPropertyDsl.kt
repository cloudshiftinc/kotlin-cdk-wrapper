@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetFleetLaunchTemplateOverridesRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.Builder =
      CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.builder()

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun instanceRequirements(instanceRequirements: IResolvable) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  public
      fun instanceRequirements(instanceRequirements: CfnEC2Fleet.InstanceRequirementsRequestProperty) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun maxPrice(maxPrice: String) {
    cdkBuilder.maxPrice(maxPrice)
  }

  public fun placement(placement: IResolvable) {
    cdkBuilder.placement(placement)
  }

  public fun placement(placement: CfnEC2Fleet.PlacementProperty) {
    cdkBuilder.placement(placement)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty = cdkBuilder.build()
}
