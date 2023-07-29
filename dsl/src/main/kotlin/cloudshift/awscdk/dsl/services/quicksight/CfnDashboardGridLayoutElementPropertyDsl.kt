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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * An element within a grid layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GridLayoutElementProperty gridLayoutElementProperty = GridLayoutElementProperty.builder()
 * .columnSpan(123)
 * .elementId("elementId")
 * .elementType("elementType")
 * .rowSpan(123)
 * // the properties below are optional
 * .columnIndex(123)
 * .rowIndex(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-gridlayoutelement.html)
 */
@CdkDslMarker
public class CfnDashboardGridLayoutElementPropertyDsl {
    private val cdkBuilder: CfnDashboard.GridLayoutElementProperty.Builder =
        CfnDashboard.GridLayoutElementProperty.builder()

    /** @param columnIndex The column index for the upper left corner of an element. */
    public fun columnIndex(columnIndex: Number) {
        cdkBuilder.columnIndex(columnIndex)
    }

    /** @param columnSpan The width of a grid element expressed as a number of grid columns. */
    public fun columnSpan(columnSpan: Number) {
        cdkBuilder.columnSpan(columnSpan)
    }

    /** @param elementId A unique identifier for an element within a grid layout. */
    public fun elementId(elementId: String) {
        cdkBuilder.elementId(elementId)
    }

    /** @param elementType The type of element. */
    public fun elementType(elementType: String) {
        cdkBuilder.elementType(elementType)
    }

    /** @param rowIndex The row index for the upper left corner of an element. */
    public fun rowIndex(rowIndex: Number) {
        cdkBuilder.rowIndex(rowIndex)
    }

    /** @param rowSpan The height of a grid element expressed as a number of grid rows. */
    public fun rowSpan(rowSpan: Number) {
        cdkBuilder.rowSpan(rowSpan)
    }

    public fun build(): CfnDashboard.GridLayoutElementProperty = cdkBuilder.build()
}
