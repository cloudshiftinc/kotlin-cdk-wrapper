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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Dataset reference.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSetReferenceProperty dataSetReferenceProperty = DataSetReferenceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .dataSetPlaceholder("dataSetPlaceholder")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datasetreference.html)
 */
@CdkDslMarker
public class CfnDashboardDataSetReferencePropertyDsl {
    private val cdkBuilder: CfnDashboard.DataSetReferenceProperty.Builder =
        CfnDashboard.DataSetReferenceProperty.builder()

    /** @param dataSetArn Dataset Amazon Resource Name (ARN). */
    public fun dataSetArn(dataSetArn: String) {
        cdkBuilder.dataSetArn(dataSetArn)
    }

    /** @param dataSetPlaceholder Dataset placeholder. */
    public fun dataSetPlaceholder(dataSetPlaceholder: String) {
        cdkBuilder.dataSetPlaceholder(dataSetPlaceholder)
    }

    public fun build(): CfnDashboard.DataSetReferenceProperty = cdkBuilder.build()
}
