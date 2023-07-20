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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.Period
import software.amazon.awscdk.services.apigateway.QuotaSettings
import kotlin.Number

@CdkDslMarker
public class QuotaSettingsDsl {
    private val cdkBuilder: QuotaSettings.Builder = QuotaSettings.builder()

    public fun limit(limit: Number) {
        cdkBuilder.limit(limit)
    }

    public fun offset(offset: Number) {
        cdkBuilder.offset(offset)
    }

    public fun period(period: Period) {
        cdkBuilder.period(period)
    }

    public fun build(): QuotaSettings = cdkBuilder.build()
}
