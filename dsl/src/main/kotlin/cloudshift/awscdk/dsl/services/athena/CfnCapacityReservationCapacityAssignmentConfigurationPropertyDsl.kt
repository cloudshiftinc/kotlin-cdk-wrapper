@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnCapacityReservation

/**
 * Assigns Athena workgroups (and hence their queries) to capacity reservations.
 *
 * A capacity reservation can have only one capacity assignment configuration, but the capacity
 * assignment configuration can be made up of multiple individual assignments. Each assignment
 * specifies how Athena queries can consume capacity from the capacity reservation that their workgroup
 * is mapped to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CapacityAssignmentConfigurationProperty capacityAssignmentConfigurationProperty =
 * CapacityAssignmentConfigurationProperty.builder()
 * .capacityAssignments(List.of(CapacityAssignmentProperty.builder()
 * .workgroupNames(List.of("workgroupNames"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignmentconfiguration.html)
 */
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
