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
import kotlin.String

@CdkDslMarker
public class CfnDashboardCalculatedFieldPropertyDsl {
    private val cdkBuilder: CfnDashboard.CalculatedFieldProperty.Builder =
        CfnDashboard.CalculatedFieldProperty.builder()

    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnDashboard.CalculatedFieldProperty = cdkBuilder.build()
}
