@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetCapacityReservationOptionsRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.CapacityReservationOptionsRequestProperty.Builder =
      CfnEC2Fleet.CapacityReservationOptionsRequestProperty.builder()

  /**
   * @param usageStrategy Indicates whether to use unused Capacity Reservations for fulfilling
   * On-Demand capacity.
   * If you specify `use-capacity-reservations-first` , the fleet uses unused Capacity Reservations
   * to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have
   * unused Capacity Reservations, the On-Demand allocation strategy ( `lowest-price` or `prioritized`
   * ) is applied. If the number of unused Capacity Reservations is less than the On-Demand target
   * capacity, the remaining On-Demand target capacity is launched according to the On-Demand
   * allocation strategy ( `lowest-price` or `prioritized` ).
   *
   * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen
   * On-Demand allocation strategy.
   */
  public fun usageStrategy(usageStrategy: String) {
    cdkBuilder.usageStrategy(usageStrategy)
  }

  public fun build(): CfnEC2Fleet.CapacityReservationOptionsRequestProperty = cdkBuilder.build()
}
