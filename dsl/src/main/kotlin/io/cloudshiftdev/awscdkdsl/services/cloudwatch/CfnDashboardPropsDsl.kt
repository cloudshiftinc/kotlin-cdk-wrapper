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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnDashboardProps

/**
 * Properties for defining a `CfnDashboard`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * CfnDashboardProps cfnDashboardProps = CfnDashboardProps.builder()
 * .dashboardBody("dashboardBody")
 * // the properties below are optional
 * .dashboardName("dashboardName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html)
 */
@CdkDslMarker
public class CfnDashboardPropsDsl {
    private val cdkBuilder: CfnDashboardProps.Builder = CfnDashboardProps.builder()

    /**
     * @param dashboardBody The detailed information about the dashboard in JSON format, including
     *   the widgets to include and their location on the dashboard.
     *
     * For more information about the syntax, see
     * [Dashboard Body Structure and Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
     * .
     */
    public fun dashboardBody(dashboardBody: String) {
        cdkBuilder.dashboardBody(dashboardBody)
    }

    /**
     * @param dashboardName The name of the dashboard. The name must be between 1 and 255
     *   characters. If you do not specify a name, one will be generated automatically.
     */
    public fun dashboardName(dashboardName: String) {
        cdkBuilder.dashboardName(dashboardName)
    }

    public fun build(): CfnDashboardProps = cdkBuilder.build()
}
