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
 * The inline visualization of a specific type to display within a chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableInlineVisualizationProperty tableInlineVisualizationProperty =
 * TableInlineVisualizationProperty.builder()
 * .dataBars(DataBarsOptionsProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .negativeColor("negativeColor")
 * .positiveColor("positiveColor")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tableinlinevisualization.html)
 */
@CdkDslMarker
public class CfnDashboardTableInlineVisualizationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableInlineVisualizationProperty.Builder =
        CfnDashboard.TableInlineVisualizationProperty.builder()

    /**
     * @param dataBars The configuration of the inline visualization of the data bars within a
     *   chart.
     */
    public fun dataBars(dataBars: IResolvable) {
        cdkBuilder.dataBars(dataBars)
    }

    /**
     * @param dataBars The configuration of the inline visualization of the data bars within a
     *   chart.
     */
    public fun dataBars(dataBars: CfnDashboard.DataBarsOptionsProperty) {
        cdkBuilder.dataBars(dataBars)
    }

    public fun build(): CfnDashboard.TableInlineVisualizationProperty = cdkBuilder.build()
}
