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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

/**
 * A complex type that contains information about a configuration for DNS query logging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * QueryLoggingConfigProperty queryLoggingConfigProperty = QueryLoggingConfigProperty.builder()
 * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html)
 */
@CdkDslMarker
public class CfnHostedZoneQueryLoggingConfigPropertyDsl {
    private val cdkBuilder: CfnHostedZone.QueryLoggingConfigProperty.Builder =
        CfnHostedZone.QueryLoggingConfigProperty.builder()

    /**
     * @param cloudWatchLogsLogGroupArn The Amazon Resource Name (ARN) of the CloudWatch Logs log
     *   group that Amazon Route 53 is publishing logs to.
     */
    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    public fun build(): CfnHostedZone.QueryLoggingConfigProperty = cdkBuilder.build()
}
