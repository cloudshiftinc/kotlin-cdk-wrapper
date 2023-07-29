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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The target of a pivot table field collapse state.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableFieldCollapseStateTargetProperty pivotTableFieldCollapseStateTargetProperty =
 * PivotTableFieldCollapseStateTargetProperty.builder()
 * .fieldDataPathValues(List.of(DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build()))
 * .fieldId("fieldId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablefieldcollapsestatetarget.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableFieldCollapseStateTargetPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableFieldCollapseStateTargetProperty.Builder =
        CfnDashboard.PivotTableFieldCollapseStateTargetProperty.builder()

    private val _fieldDataPathValues: MutableList<Any> = mutableListOf()

    /**
     * @param fieldDataPathValues The data path of the pivot table's header. Used to set the
     *   collapse state.
     */
    public fun fieldDataPathValues(vararg fieldDataPathValues: Any) {
        _fieldDataPathValues.addAll(listOf(*fieldDataPathValues))
    }

    /**
     * @param fieldDataPathValues The data path of the pivot table's header. Used to set the
     *   collapse state.
     */
    public fun fieldDataPathValues(fieldDataPathValues: Collection<Any>) {
        _fieldDataPathValues.addAll(fieldDataPathValues)
    }

    /**
     * @param fieldDataPathValues The data path of the pivot table's header. Used to set the
     *   collapse state.
     */
    public fun fieldDataPathValues(fieldDataPathValues: IResolvable) {
        cdkBuilder.fieldDataPathValues(fieldDataPathValues)
    }

    /**
     * @param fieldId The field ID of the pivot table that the collapse state needs to be set to.
     */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnDashboard.PivotTableFieldCollapseStateTargetProperty {
        if (_fieldDataPathValues.isNotEmpty()) cdkBuilder.fieldDataPathValues(_fieldDataPathValues)
        return cdkBuilder.build()
    }
}
