@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudwatch.CfnDashboardProps
import kotlin.String

@CdkDslMarker
public class CfnDashboardPropsDsl {
    private val cdkBuilder: CfnDashboardProps.Builder = CfnDashboardProps.builder()

    public fun dashboardBody(dashboardBody: String) {
        cdkBuilder.dashboardBody(dashboardBody)
    }

    public fun dashboardName(dashboardName: String) {
        cdkBuilder.dashboardName(dashboardName)
    }

    public fun build(): CfnDashboardProps = cdkBuilder.build()
}
