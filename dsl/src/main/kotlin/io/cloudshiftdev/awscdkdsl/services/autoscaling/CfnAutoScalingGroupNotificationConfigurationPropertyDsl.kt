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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * A structure that specifies an Amazon SNS notification configuration for the
 * `NotificationConfigurations` property of the
 * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
 * resource.
 *
 * For an example template snippet, see
 * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
 * .
 *
 * For more information, see
 * [Get Amazon SNS notifications when your Auto Scaling group scales](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * NotificationConfigurationProperty notificationConfigurationProperty =
 * NotificationConfigurationProperty.builder()
 * .topicArn("topicArn")
 * // the properties below are optional
 * .notificationTypes(List.of("notificationTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-notificationconfiguration.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupNotificationConfigurationPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.NotificationConfigurationProperty.Builder =
        CfnAutoScalingGroup.NotificationConfigurationProperty.builder()

    private val _notificationTypes: MutableList<String> = mutableListOf()

    /**
     * @param notificationTypes A list of event types that send a notification. Event types can
     *   include any of the following types. *Allowed values* :
     * * `autoscaling:EC2_INSTANCE_LAUNCH`
     * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
     * * `autoscaling:EC2_INSTANCE_TERMINATE`
     * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
     * * `autoscaling:TEST_NOTIFICATION`
     */
    public fun notificationTypes(vararg notificationTypes: String) {
        _notificationTypes.addAll(listOf(*notificationTypes))
    }

    /**
     * @param notificationTypes A list of event types that send a notification. Event types can
     *   include any of the following types. *Allowed values* :
     * * `autoscaling:EC2_INSTANCE_LAUNCH`
     * * `autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
     * * `autoscaling:EC2_INSTANCE_TERMINATE`
     * * `autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
     * * `autoscaling:TEST_NOTIFICATION`
     */
    public fun notificationTypes(notificationTypes: Collection<String>) {
        _notificationTypes.addAll(notificationTypes)
    }

    /** @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic. */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnAutoScalingGroup.NotificationConfigurationProperty {
        if (_notificationTypes.isNotEmpty()) cdkBuilder.notificationTypes(_notificationTypes)
        return cdkBuilder.build()
    }
}
