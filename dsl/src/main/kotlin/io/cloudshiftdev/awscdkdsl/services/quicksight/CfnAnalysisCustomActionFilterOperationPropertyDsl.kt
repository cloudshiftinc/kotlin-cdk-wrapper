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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The filter operation that filters data included in a visual or in an entire sheet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomActionFilterOperationProperty customActionFilterOperationProperty =
 * CustomActionFilterOperationProperty.builder()
 * .selectedFieldsConfiguration(FilterOperationSelectedFieldsConfigurationProperty.builder()
 * .selectedColumns(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .selectedFieldOptions("selectedFieldOptions")
 * .selectedFields(List.of("selectedFields"))
 * .build())
 * .targetVisualsConfiguration(FilterOperationTargetVisualsConfigurationProperty.builder()
 * .sameSheetTargetVisualConfiguration(SameSheetTargetVisualConfigurationProperty.builder()
 * .targetVisualOptions("targetVisualOptions")
 * .targetVisuals(List.of("targetVisuals"))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-customactionfilteroperation.html)
 */
@CdkDslMarker
public class CfnAnalysisCustomActionFilterOperationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CustomActionFilterOperationProperty.Builder =
        CfnAnalysis.CustomActionFilterOperationProperty.builder()

    /**
     * @param selectedFieldsConfiguration The configuration that chooses the fields to be filtered.
     */
    public fun selectedFieldsConfiguration(selectedFieldsConfiguration: IResolvable) {
        cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
    }

    /**
     * @param selectedFieldsConfiguration The configuration that chooses the fields to be filtered.
     */
    public fun selectedFieldsConfiguration(
        selectedFieldsConfiguration: CfnAnalysis.FilterOperationSelectedFieldsConfigurationProperty
    ) {
        cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
    }

    /**
     * @param targetVisualsConfiguration The configuration that chooses the target visuals to be
     *   filtered.
     */
    public fun targetVisualsConfiguration(targetVisualsConfiguration: IResolvable) {
        cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
    }

    /**
     * @param targetVisualsConfiguration The configuration that chooses the target visuals to be
     *   filtered.
     */
    public fun targetVisualsConfiguration(
        targetVisualsConfiguration: CfnAnalysis.FilterOperationTargetVisualsConfigurationProperty
    ) {
        cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
    }

    public fun build(): CfnAnalysis.CustomActionFilterOperationProperty = cdkBuilder.build()
}
