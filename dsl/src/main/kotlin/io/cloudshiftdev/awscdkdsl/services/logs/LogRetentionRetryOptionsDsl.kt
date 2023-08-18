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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions

/**
 * Retry options for all AWS API calls.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.logs.*;
 * LogRetentionRetryOptions logRetentionRetryOptions = LogRetentionRetryOptions.builder()
 * .base(Duration.minutes(30))
 * .maxRetries(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class LogRetentionRetryOptionsDsl {
    private val cdkBuilder: LogRetentionRetryOptions.Builder = LogRetentionRetryOptions.builder()

    /**
     * @param base The base duration to use in the exponential backoff for operation retries.
     * @deprecated Unused since the upgrade to AWS SDK v3, which uses a different retry strategy
     */
    @Deprecated(message = "deprecated in CDK")
    public fun base(base: Duration) {
        cdkBuilder.base(base)
    }

    /** @param maxRetries The maximum amount of retries. */
    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun build(): LogRetentionRetryOptions = cdkBuilder.build()
}
