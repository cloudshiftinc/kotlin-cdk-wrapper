@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateCapacityReservationSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.CapacityReservationSpecificationProperty.Builder =
      CfnLaunchTemplate.CapacityReservationSpecificationProperty.builder()

  /**
   * @param capacityReservationPreference Indicates the instance's Capacity Reservation preferences.
   * Possible preferences include:.
   * * `open` - The instance can run in any `open` Capacity Reservation that has matching attributes
   * (instance type, platform, Availability Zone).
   * * `none` - The instance avoids running in a Capacity Reservation even if one is available. The
   * instance runs in On-Demand capacity.
   */
  public fun capacityReservationPreference(capacityReservationPreference: String) {
    cdkBuilder.capacityReservationPreference(capacityReservationPreference)
  }

  /**
   * @param capacityReservationTarget Information about the target Capacity Reservation or Capacity
   * Reservation group.
   */
  public fun capacityReservationTarget(capacityReservationTarget: IResolvable) {
    cdkBuilder.capacityReservationTarget(capacityReservationTarget)
  }

  /**
   * @param capacityReservationTarget Information about the target Capacity Reservation or Capacity
   * Reservation group.
   */
  public
      fun capacityReservationTarget(capacityReservationTarget: CfnLaunchTemplate.CapacityReservationTargetProperty) {
    cdkBuilder.capacityReservationTarget(capacityReservationTarget)
  }

  public fun build(): CfnLaunchTemplate.CapacityReservationSpecificationProperty =
      cdkBuilder.build()
}
