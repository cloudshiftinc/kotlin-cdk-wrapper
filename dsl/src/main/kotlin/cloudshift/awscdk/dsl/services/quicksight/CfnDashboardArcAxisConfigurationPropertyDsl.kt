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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Number

@CdkDslMarker
public class CfnDashboardArcAxisConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ArcAxisConfigurationProperty.Builder =
        CfnDashboard.ArcAxisConfigurationProperty.builder()

    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    public fun range(range: CfnDashboard.ArcAxisDisplayRangeProperty) {
        cdkBuilder.range(range)
    }

    public fun reserveRange(reserveRange: Number) {
        cdkBuilder.reserveRange(reserveRange)
    }

    public fun build(): CfnDashboard.ArcAxisConfigurationProperty = cdkBuilder.build()
}
