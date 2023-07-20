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

@CdkDslMarker
public class CfnDashboardDecimalPlacesConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DecimalPlacesConfigurationProperty.Builder =
        CfnDashboard.DecimalPlacesConfigurationProperty.builder()

    public fun decimalPlaces(decimalPlaces: Number) {
        cdkBuilder.decimalPlaces(decimalPlaces)
    }

    public fun build(): CfnDashboard.DecimalPlacesConfigurationProperty = cdkBuilder.build()
}
