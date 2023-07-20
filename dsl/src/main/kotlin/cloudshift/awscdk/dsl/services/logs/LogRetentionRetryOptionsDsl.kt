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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import kotlin.Number

@CdkDslMarker
public class LogRetentionRetryOptionsDsl {
    private val cdkBuilder: LogRetentionRetryOptions.Builder = LogRetentionRetryOptions.builder()

    public fun base(base: Duration) {
        cdkBuilder.base(base)
    }

    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun build(): LogRetentionRetryOptions = cdkBuilder.build()
}
