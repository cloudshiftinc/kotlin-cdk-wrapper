@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.apigateway.Period
import software.amazon.awscdk.services.apigateway.QuotaSettings

/**
 * Specifies the maximum number of requests that clients can make to API Gateway APIs.
 *
 * Example:
 * ```
 * RestApi api;
 * RateLimitedApiKey key = RateLimitedApiKey.Builder.create(this, "rate-limited-api-key")
 * .customerId("hello-customer")
 * .stages(List.of(api.getDeploymentStage()))
 * .quota(QuotaSettings.builder()
 * .limit(10000)
 * .period(Period.MONTH)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class QuotaSettingsDsl {
    private val cdkBuilder: QuotaSettings.Builder = QuotaSettings.builder()

    /**
     * @param limit The maximum number of requests that users can make within the specified time
     *   period.
     */
    public fun limit(limit: Number) {
        cdkBuilder.limit(limit)
    }

    /**
     * @param offset For the initial time period, the number of requests to subtract from the
     *   specified limit.
     */
    public fun offset(offset: Number) {
        cdkBuilder.offset(offset)
    }

    /** @param period The time period for which the maximum limit of requests applies. */
    public fun period(period: Period) {
        cdkBuilder.period(period)
    }

    public fun build(): QuotaSettings = cdkBuilder.build()
}
