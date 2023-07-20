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
public class CfnDashboardExcludePeriodConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ExcludePeriodConfigurationProperty.Builder =
        CfnDashboard.ExcludePeriodConfigurationProperty.builder()

    public fun amount(amount: Number) {
        cdkBuilder.amount(amount)
    }

    public fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDashboard.ExcludePeriodConfigurationProperty = cdkBuilder.build()
}
