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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * The Amazon CloudWatch Logs log group where the text and metadata logs are delivered.
 *
 * The log group must exist before you enable logging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * CloudWatchLogGroupLogDestinationProperty cloudWatchLogGroupLogDestinationProperty =
 * CloudWatchLogGroupLogDestinationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .logPrefix("logPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-cloudwatchloggrouplogdestination.html)
 */
@CdkDslMarker
public class CfnBotCloudWatchLogGroupLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBot.CloudWatchLogGroupLogDestinationProperty.Builder =
        CfnBot.CloudWatchLogGroupLogDestinationProperty.builder()

    /**
     * @param cloudWatchLogGroupArn The Amazon Resource Name (ARN) of the log group where text and
     *   metadata logs are delivered.
     */
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    /**
     * @param logPrefix The prefix of the log stream name within the log group that you specified.
     */
    public fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
    }

    public fun build(): CfnBot.CloudWatchLogGroupLogDestinationProperty = cdkBuilder.build()
}
