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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

/**
 * Options for CloudWatch Logs as a logging destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CloudWatchLogsProperty cloudWatchLogsProperty = CloudWatchLogsProperty.builder()
 * .enabled(false)
 * .logGroup("logGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-cloudwatchlogs.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessInstanceCloudWatchLogsPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessInstance.CloudWatchLogsProperty.Builder =
        CfnVerifiedAccessInstance.CloudWatchLogsProperty.builder()

    /** @param enabled Indicates whether logging is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Indicates whether logging is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param logGroup The ID of the CloudWatch Logs log group. */
    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnVerifiedAccessInstance.CloudWatchLogsProperty = cdkBuilder.build()
}
