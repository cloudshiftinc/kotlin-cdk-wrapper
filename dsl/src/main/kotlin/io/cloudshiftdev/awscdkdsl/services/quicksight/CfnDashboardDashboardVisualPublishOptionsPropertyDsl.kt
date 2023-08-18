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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The visual publish options of a visual in a dashboard.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DashboardVisualPublishOptionsProperty dashboardVisualPublishOptionsProperty =
 * DashboardVisualPublishOptionsProperty.builder()
 * .exportHiddenFieldsOption(ExportHiddenFieldsOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-dashboardvisualpublishoptions.html)
 */
@CdkDslMarker
public class CfnDashboardDashboardVisualPublishOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.DashboardVisualPublishOptionsProperty.Builder =
        CfnDashboard.DashboardVisualPublishOptionsProperty.builder()

    /**
     * @param exportHiddenFieldsOption Determines if hidden fields are included in an exported
     *   dashboard.
     */
    public fun exportHiddenFieldsOption(exportHiddenFieldsOption: IResolvable) {
        cdkBuilder.exportHiddenFieldsOption(exportHiddenFieldsOption)
    }

    /**
     * @param exportHiddenFieldsOption Determines if hidden fields are included in an exported
     *   dashboard.
     */
    public fun exportHiddenFieldsOption(
        exportHiddenFieldsOption: CfnDashboard.ExportHiddenFieldsOptionProperty
    ) {
        cdkBuilder.exportHiddenFieldsOption(exportHiddenFieldsOption)
    }

    public fun build(): CfnDashboard.DashboardVisualPublishOptionsProperty = cdkBuilder.build()
}
