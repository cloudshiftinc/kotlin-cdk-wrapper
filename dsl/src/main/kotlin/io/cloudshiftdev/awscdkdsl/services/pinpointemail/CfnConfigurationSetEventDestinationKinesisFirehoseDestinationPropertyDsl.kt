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

package io.cloudshiftdev.awscdkdsl.services.pinpointemail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

/**
 * An object that defines an Amazon Kinesis Data Firehose destination for email events.
 *
 * You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and
 * Amazon Redshift.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * KinesisFirehoseDestinationProperty kinesisFirehoseDestinationProperty =
 * KinesisFirehoseDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .iamRoleArn("iamRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl {
    private val cdkBuilder:
        CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

    /**
     * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose
     *   stream that Amazon Pinpoint sends email events to.
     */
    public fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    /**
     * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses
     *   when sending email events to the Amazon Kinesis Data Firehose stream.
     */
    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    public fun build(): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
        cdkBuilder.build()
}
