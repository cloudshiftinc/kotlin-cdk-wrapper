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
import kotlin.String

@CdkDslMarker
public class CfnDashboardPeriodOverPeriodComputationPropertyDsl {
    private val cdkBuilder: CfnDashboard.PeriodOverPeriodComputationProperty.Builder =
        CfnDashboard.PeriodOverPeriodComputationProperty.builder()

    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun time(time: IResolvable) {
        cdkBuilder.time(time)
    }

    public fun time(time: CfnDashboard.DimensionFieldProperty) {
        cdkBuilder.time(time)
    }

    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    public fun `value`(`value`: CfnDashboard.MeasureFieldProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDashboard.PeriodOverPeriodComputationProperty = cdkBuilder.build()
}
