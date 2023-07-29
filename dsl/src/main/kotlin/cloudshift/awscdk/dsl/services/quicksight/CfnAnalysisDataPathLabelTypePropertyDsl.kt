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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The option that specifies individual data values for labels.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPathLabelTypeProperty dataPathLabelTypeProperty = DataPathLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-datapathlabeltype.html)
 */
@CdkDslMarker
public class CfnAnalysisDataPathLabelTypePropertyDsl {
    private val cdkBuilder: CfnAnalysis.DataPathLabelTypeProperty.Builder =
        CfnAnalysis.DataPathLabelTypeProperty.builder()

    /** @param fieldId The field ID of the field that the data label needs to be applied to. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /** @param fieldValue The actual value of the field that is labeled. */
    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    /** @param visibility The visibility of the data label. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.DataPathLabelTypeProperty = cdkBuilder.build()
}
