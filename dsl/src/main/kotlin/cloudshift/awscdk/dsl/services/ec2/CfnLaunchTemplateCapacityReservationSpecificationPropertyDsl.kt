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

  public fun capacityReservationPreference(capacityReservationPreference: String) {
    cdkBuilder.capacityReservationPreference(capacityReservationPreference)
  }

  public fun capacityReservationTarget(capacityReservationTarget: IResolvable) {
    cdkBuilder.capacityReservationTarget(capacityReservationTarget)
  }

  public
      fun capacityReservationTarget(capacityReservationTarget: CfnLaunchTemplate.CapacityReservationTargetProperty) {
    cdkBuilder.capacityReservationTarget(capacityReservationTarget)
  }

  public fun build(): CfnLaunchTemplate.CapacityReservationSpecificationProperty =
      cdkBuilder.build()
}
