@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A transform operation that projects columns.
 *
 * Operations that come after a projection can only refer to projected columns.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ProjectOperationProperty projectOperationProperty = ProjectOperationProperty.builder()
 * .projectedColumns(List.of("projectedColumns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-projectoperation.html)
 */
@CdkDslMarker
public class CfnDataSetProjectOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.ProjectOperationProperty.Builder =
        CfnDataSet.ProjectOperationProperty.builder()

    private val _projectedColumns: MutableList<String> = mutableListOf()

    /**
     * @param projectedColumns Projected columns.
     */
    public fun projectedColumns(vararg projectedColumns: String) {
        _projectedColumns.addAll(listOf(*projectedColumns))
    }

    /**
     * @param projectedColumns Projected columns.
     */
    public fun projectedColumns(projectedColumns: Collection<String>) {
        _projectedColumns.addAll(projectedColumns)
    }

    public fun build(): CfnDataSet.ProjectOperationProperty {
        if (_projectedColumns.isNotEmpty()) cdkBuilder.projectedColumns(_projectedColumns)
        return cdkBuilder.build()
    }
}
