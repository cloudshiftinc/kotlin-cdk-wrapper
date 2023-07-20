@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCapacityReservationCapacityAssignmentPropertyDsl {
    private val cdkBuilder: CfnCapacityReservation.CapacityAssignmentProperty.Builder =
        CfnCapacityReservation.CapacityAssignmentProperty.builder()

    private val _workgroupNames: MutableList<String> = mutableListOf()

    public fun workgroupNames(vararg workgroupNames: String) {
        _workgroupNames.addAll(listOf(*workgroupNames))
    }

    public fun workgroupNames(workgroupNames: Collection<String>) {
        _workgroupNames.addAll(workgroupNames)
    }

    public fun build(): CfnCapacityReservation.CapacityAssignmentProperty {
        if (_workgroupNames.isNotEmpty()) cdkBuilder.workgroupNames(_workgroupNames)
        return cdkBuilder.build()
    }
}
