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

package io.cloudshiftdev.awscdkdsl.services.ce

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ce.CfnAnomalySubscription

/**
 * The recipient of `AnomalySubscription` notifications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ce.*;
 * SubscriberProperty subscriberProperty = SubscriberProperty.builder()
 * .address("address")
 * .type("type")
 * // the properties below are optional
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html)
 */
@CdkDslMarker
public class CfnAnomalySubscriptionSubscriberPropertyDsl {
    private val cdkBuilder: CfnAnomalySubscription.SubscriberProperty.Builder =
        CfnAnomalySubscription.SubscriberProperty.builder()

    /**
     * @param address The email address or SNS Topic Amazon Resource Name (ARN), depending on the
     *   `Type` .
     */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /** @param status Indicates if the subscriber accepts the notifications. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param type The notification delivery channel. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAnomalySubscription.SubscriberProperty = cdkBuilder.build()
}
