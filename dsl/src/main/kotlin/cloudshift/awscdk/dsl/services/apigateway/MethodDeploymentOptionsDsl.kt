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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
import software.amazon.awscdk.services.apigateway.MethodLoggingLevel
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class MethodDeploymentOptionsDsl {
    private val cdkBuilder: MethodDeploymentOptions.Builder = MethodDeploymentOptions.builder()

    public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
    }

    public fun cacheTtl(cacheTtl: Duration) {
        cdkBuilder.cacheTtl(cacheTtl)
    }

    public fun cachingEnabled(cachingEnabled: Boolean) {
        cdkBuilder.cachingEnabled(cachingEnabled)
    }

    public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
    }

    public fun loggingLevel(loggingLevel: MethodLoggingLevel) {
        cdkBuilder.loggingLevel(loggingLevel)
    }

    public fun metricsEnabled(metricsEnabled: Boolean) {
        cdkBuilder.metricsEnabled(metricsEnabled)
    }

    public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
    }

    public fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
    }

    public fun build(): MethodDeploymentOptions = cdkBuilder.build()
}
