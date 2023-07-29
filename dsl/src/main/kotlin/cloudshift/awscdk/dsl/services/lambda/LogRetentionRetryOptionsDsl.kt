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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.LogRetentionRetryOptions

/**
 * Retry options for all AWS API calls.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * LogRetentionRetryOptions logRetentionRetryOptions = LogRetentionRetryOptions.builder()
 * .base(Duration.minutes(30))
 * .maxRetries(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class LogRetentionRetryOptionsDsl {
    private val cdkBuilder: LogRetentionRetryOptions.Builder = LogRetentionRetryOptions.builder()

    /** @param base The base duration to use in the exponential backoff for operation retries. */
    public fun base(base: Duration) {
        cdkBuilder.base(base)
    }

    /** @param maxRetries The maximum amount of retries. */
    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun build(): LogRetentionRetryOptions = cdkBuilder.build()
}
