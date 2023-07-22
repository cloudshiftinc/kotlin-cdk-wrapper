@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnCapacityReservation

@CdkDslMarker
public class CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl {
  private val cdkBuilder: CfnCapacityReservation.CapacityAssignmentConfigurationProperty.Builder =
      CfnCapacityReservation.CapacityAssignmentConfigurationProperty.builder()

  private val _capacityAssignments: MutableList<Any> = mutableListOf()

  /**
   * @param capacityAssignments The list of assignments that make up the capacity assignment
   * configuration. 
   */
  public fun capacityAssignments(vararg capacityAssignments: Any) {
    _capacityAssignments.addAll(listOf(*capacityAssignments))
  }

  /**
   * @param capacityAssignments The list of assignments that make up the capacity assignment
   * configuration. 
   */
  public fun capacityAssignments(capacityAssignments: Collection<Any>) {
    _capacityAssignments.addAll(capacityAssignments)
  }

  /**
   * @param capacityAssignments The list of assignments that make up the capacity assignment
   * configuration. 
   */
  public fun capacityAssignments(capacityAssignments: IResolvable) {
    cdkBuilder.capacityAssignments(capacityAssignments)
  }

  public fun build(): CfnCapacityReservation.CapacityAssignmentConfigurationProperty {
    if(_capacityAssignments.isNotEmpty()) cdkBuilder.capacityAssignments(_capacityAssignments)
    return cdkBuilder.build()
  }
}
