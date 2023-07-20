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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate
import kotlin.Number

@CdkDslMarker
public class CfnJobTemplateExponentialRolloutRatePropertyDsl {
    private val cdkBuilder: CfnJobTemplate.ExponentialRolloutRateProperty.Builder =
        CfnJobTemplate.ExponentialRolloutRateProperty.builder()

    public fun baseRatePerMinute(baseRatePerMinute: Number) {
        cdkBuilder.baseRatePerMinute(baseRatePerMinute)
    }

    public fun incrementFactor(incrementFactor: Number) {
        cdkBuilder.incrementFactor(incrementFactor)
    }

    public fun rateIncreaseCriteria(rateIncreaseCriteria: IResolvable) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
    }

    public fun rateIncreaseCriteria(rateIncreaseCriteria: CfnJobTemplate.RateIncreaseCriteriaProperty) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
    }

    public fun build(): CfnJobTemplate.ExponentialRolloutRateProperty = cdkBuilder.build()
}
