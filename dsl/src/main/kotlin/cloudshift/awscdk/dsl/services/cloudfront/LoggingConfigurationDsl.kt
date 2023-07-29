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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration
import software.amazon.awscdk.services.s3.IBucket

/**
 * Logging configuration for incoming requests.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * LoggingConfiguration loggingConfiguration = LoggingConfiguration.builder()
 * .bucket(bucket)
 * .includeCookies(false)
 * .prefix("prefix")
 * .build();
 * ```
 */
@CdkDslMarker
public class LoggingConfigurationDsl {
    private val cdkBuilder: LoggingConfiguration.Builder = LoggingConfiguration.builder()

    /** @param bucket Bucket to log requests to. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param includeCookies Whether to include the cookies in the logs. */
    public fun includeCookies(includeCookies: Boolean) {
        cdkBuilder.includeCookies(includeCookies)
    }

    /** @param prefix Where in the bucket to store logs. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): LoggingConfiguration = cdkBuilder.build()
}
