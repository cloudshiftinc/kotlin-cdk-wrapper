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

package io.cloudshiftdev.awscdkdsl.services.resiliencehub

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resiliencehub.CfnApp

/**
 * Indicates an event you would like to subscribe and get notification for.
 *
 * Currently, AWS Resilience Hub supports notifications only for *Drift detected* and *Scheduled
 * assessment failure* events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * EventSubscriptionProperty eventSubscriptionProperty = EventSubscriptionProperty.builder()
 * .eventType("eventType")
 * .name("name")
 * // the properties below are optional
 * .snsTopicArn("snsTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-eventsubscription.html)
 */
@CdkDslMarker
public class CfnAppEventSubscriptionPropertyDsl {
    private val cdkBuilder: CfnApp.EventSubscriptionProperty.Builder =
        CfnApp.EventSubscriptionProperty.builder()

    /**
     * @param eventType The type of event you would like to subscribe and get notification for.
     *   Currently, AWS Resilience Hub supports notifications only for *Drift detected* (
     *   `DriftDetected` ) and *Scheduled assessment failure* ( `ScheduledAssessmentFailure` )
     *   events.
     */
    public fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
    }

    /** @param name Unique name to identify an event subscription. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param snsTopicArn Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     *   topic. The format for this ARN is: `arn:partition:sns:region:account:topic-name` . For more
     *   information about ARNs, see
     *   [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     *   in the *AWS General Reference* guide.
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnApp.EventSubscriptionProperty = cdkBuilder.build()
}
