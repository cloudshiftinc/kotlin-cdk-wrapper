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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAnalysisExcludePeriodConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ExcludePeriodConfigurationProperty.Builder =
        CfnAnalysis.ExcludePeriodConfigurationProperty.builder()

    public fun amount(amount: Number) {
        cdkBuilder.amount(amount)
    }

    public fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnAnalysis.ExcludePeriodConfigurationProperty = cdkBuilder.build()
}
