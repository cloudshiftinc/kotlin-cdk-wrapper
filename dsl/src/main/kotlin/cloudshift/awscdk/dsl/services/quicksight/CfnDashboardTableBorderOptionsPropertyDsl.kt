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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDashboardTableBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableBorderOptionsProperty.Builder =
        CfnDashboard.TableBorderOptionsProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun style(style: String) {
        cdkBuilder.style(style)
    }

    public fun thickness(thickness: Number) {
        cdkBuilder.thickness(thickness)
    }

    public fun build(): CfnDashboard.TableBorderOptionsProperty = cdkBuilder.build()
}
