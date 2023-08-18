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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action that updates a CloudWatch alarm.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CloudwatchAlarmActionProperty cloudwatchAlarmActionProperty =
 * CloudwatchAlarmActionProperty.builder()
 * .alarmName("alarmName")
 * .roleArn("roleArn")
 * .stateReason("stateReason")
 * .stateValue("stateValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleCloudwatchAlarmActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.CloudwatchAlarmActionProperty.Builder =
        CfnTopicRule.CloudwatchAlarmActionProperty.builder()

    /** @param alarmName The CloudWatch alarm name. */
    public fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
    }

    /** @param roleArn The IAM role that allows access to the CloudWatch alarm. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param stateReason The reason for the alarm change. */
    public fun stateReason(stateReason: String) {
        cdkBuilder.stateReason(stateReason)
    }

    /**
     * @param stateValue The value of the alarm state. Acceptable values are: OK, ALARM,
     *   INSUFFICIENT_DATA.
     */
    public fun stateValue(stateValue: String) {
        cdkBuilder.stateValue(stateValue)
    }

    public fun build(): CfnTopicRule.CloudwatchAlarmActionProperty = cdkBuilder.build()
}
