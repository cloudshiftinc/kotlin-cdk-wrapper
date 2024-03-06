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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The data path that needs to be sorted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPathValueProperty dataPathValueProperty = DataPathValueProperty.builder()
 * .dataPathType(DataPathTypeProperty.builder()
 * .pivotTableDataPathType("pivotTableDataPathType")
 * .build())
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-datapathvalue.html)
 */
@CdkDslMarker
public class CfnAnalysisDataPathValuePropertyDsl {
    private val cdkBuilder: CfnAnalysis.DataPathValueProperty.Builder =
        CfnAnalysis.DataPathValueProperty.builder()

    /** @param dataPathType The type configuration of the field. */
    public fun dataPathType(dataPathType: IResolvable) {
        cdkBuilder.dataPathType(dataPathType)
    }

    /** @param dataPathType The type configuration of the field. */
    public fun dataPathType(dataPathType: CfnAnalysis.DataPathTypeProperty) {
        cdkBuilder.dataPathType(dataPathType)
    }

    /** @param fieldId The field ID of the field that needs to be sorted. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /** @param fieldValue The actual value of the field that needs to be sorted. */
    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    public fun build(): CfnAnalysis.DataPathValueProperty = cdkBuilder.build()
}
