@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.athena.CfnCapacityReservation

@CdkDslMarker
public class CfnCapacityReservationCapacityAssignmentPropertyDsl {
  private val cdkBuilder: CfnCapacityReservation.CapacityAssignmentProperty.Builder =
      CfnCapacityReservation.CapacityAssignmentProperty.builder()

  private val _workgroupNames: MutableList<String> = mutableListOf()

  /**
   * @param workgroupNames The list of workgroup names for the capacity assignment. 
   */
  public fun workgroupNames(vararg workgroupNames: String) {
    _workgroupNames.addAll(listOf(*workgroupNames))
  }

  /**
   * @param workgroupNames The list of workgroup names for the capacity assignment. 
   */
  public fun workgroupNames(workgroupNames: Collection<String>) {
    _workgroupNames.addAll(workgroupNames)
  }

  public fun build(): CfnCapacityReservation.CapacityAssignmentProperty {
    if(_workgroupNames.isNotEmpty()) cdkBuilder.workgroupNames(_workgroupNames)
    return cdkBuilder.build()
  }
}
