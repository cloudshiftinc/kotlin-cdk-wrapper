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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

/**
 * An object that defines an Amazon SNS destination for email events.
 *
 * You can use Amazon SNS to send notification when certain email events occur.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * SnsDestinationProperty snsDestinationProperty = SnsDestinationProperty.builder()
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.SnsDestinationProperty.builder()

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to
     *   publish email events to. For more information about Amazon SNS topics, see the
     *   [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnConfigurationSetEventDestination.SnsDestinationProperty =
        cdkBuilder.build()
}
