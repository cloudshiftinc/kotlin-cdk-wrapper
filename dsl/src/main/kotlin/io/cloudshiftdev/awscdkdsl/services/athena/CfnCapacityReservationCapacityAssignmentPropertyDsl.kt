@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.athena

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.athena.CfnCapacityReservation

/**
 * A mapping between one or more workgroups and a capacity reservation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CapacityAssignmentProperty capacityAssignmentProperty = CapacityAssignmentProperty.builder()
 * .workgroupNames(List.of("workgroupNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-capacityreservation-capacityassignment.html)
 */
@CdkDslMarker
public class CfnCapacityReservationCapacityAssignmentPropertyDsl {
    private val cdkBuilder: CfnCapacityReservation.CapacityAssignmentProperty.Builder =
        CfnCapacityReservation.CapacityAssignmentProperty.builder()

    private val _workgroupNames: MutableList<String> = mutableListOf()

    /** @param workgroupNames The list of workgroup names for the capacity assignment. */
    public fun workgroupNames(vararg workgroupNames: String) {
        _workgroupNames.addAll(listOf(*workgroupNames))
    }

    /** @param workgroupNames The list of workgroup names for the capacity assignment. */
    public fun workgroupNames(workgroupNames: Collection<String>) {
        _workgroupNames.addAll(workgroupNames)
    }

    public fun build(): CfnCapacityReservation.CapacityAssignmentProperty {
        if (_workgroupNames.isNotEmpty()) cdkBuilder.workgroupNames(_workgroupNames)
        return cdkBuilder.build()
    }
}
