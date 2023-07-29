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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action that updates a CloudWatch log.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CloudwatchLogsActionProperty cloudwatchLogsActionProperty =
 * CloudwatchLogsActionProperty.builder()
 * .logGroupName("logGroupName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleCloudwatchLogsActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.CloudwatchLogsActionProperty.Builder =
        CfnTopicRule.CloudwatchLogsActionProperty.builder()

    /**
     * @param batchMode Indicates whether batches of log records will be extracted and uploaded into
     *   CloudWatch.
     */
    public fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
    }

    /**
     * @param batchMode Indicates whether batches of log records will be extracted and uploaded into
     *   CloudWatch.
     */
    public fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode)
    }

    /** @param logGroupName The CloudWatch log name. */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /** @param roleArn The IAM role that allows access to the CloudWatch log. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.CloudwatchLogsActionProperty = cdkBuilder.build()
}
