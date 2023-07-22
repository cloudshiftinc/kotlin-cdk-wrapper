@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateCapacityReservationTargetPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.CapacityReservationTargetProperty.Builder =
      CfnLaunchTemplate.CapacityReservationTargetProperty.builder()

  /**
   * @param capacityReservationId The ID of the Capacity Reservation in which to run the instance.
   */
  public fun capacityReservationId(capacityReservationId: String) {
    cdkBuilder.capacityReservationId(capacityReservationId)
  }

  /**
   * @param capacityReservationResourceGroupArn The ARN of the Capacity Reservation resource group
   * in which to run the instance.
   */
  public fun capacityReservationResourceGroupArn(capacityReservationResourceGroupArn: String) {
    cdkBuilder.capacityReservationResourceGroupArn(capacityReservationResourceGroupArn)
  }

  public fun build(): CfnLaunchTemplate.CapacityReservationTargetProperty = cdkBuilder.build()
}
