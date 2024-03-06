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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The collapse state options for the pivot table field options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableFieldCollapseStateOptionProperty pivotTableFieldCollapseStateOptionProperty =
 * PivotTableFieldCollapseStateOptionProperty.builder()
 * .target(PivotTableFieldCollapseStateTargetProperty.builder()
 * .fieldDataPathValues(List.of(DataPathValueProperty.builder()
 * .dataPathType(DataPathTypeProperty.builder()
 * .pivotTableDataPathType("pivotTableDataPathType")
 * .build())
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build()))
 * .fieldId("fieldId")
 * .build())
 * // the properties below are optional
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablefieldcollapsestateoption.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableFieldCollapseStateOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableFieldCollapseStateOptionProperty.Builder =
        CfnDashboard.PivotTableFieldCollapseStateOptionProperty.builder()

    /**
     * @param state The state of the field target of a pivot table. Choose one of the following
     *   options:.
     * * `COLLAPSED`
     * * `EXPANDED`
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /** @param target A tagged-union object that sets the collapse state. */
    public fun target(target: IResolvable) {
        cdkBuilder.target(target)
    }

    /** @param target A tagged-union object that sets the collapse state. */
    public fun target(target: CfnDashboard.PivotTableFieldCollapseStateTargetProperty) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnDashboard.PivotTableFieldCollapseStateOptionProperty = cdkBuilder.build()
}
