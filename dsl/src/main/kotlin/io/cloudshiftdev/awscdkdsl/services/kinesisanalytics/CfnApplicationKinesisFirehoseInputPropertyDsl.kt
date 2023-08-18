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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * Identifies an Amazon Kinesis Firehose delivery stream as the streaming source.
 *
 * You provide the delivery stream's Amazon Resource Name (ARN) and an IAM role ARN that enables
 * Amazon Kinesis Analytics to access the stream on your behalf.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * KinesisFirehoseInputProperty kinesisFirehoseInputProperty =
 * KinesisFirehoseInputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html)
 */
@CdkDslMarker
public class CfnApplicationKinesisFirehoseInputPropertyDsl {
    private val cdkBuilder: CfnApplication.KinesisFirehoseInputProperty.Builder =
        CfnApplication.KinesisFirehoseInputProperty.builder()

    /** @param resourceArn ARN of the input delivery stream. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to access the
     *   stream on your behalf. You need to make sure that the role has the necessary permissions to
     *   access the stream.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnApplication.KinesisFirehoseInputProperty = cdkBuilder.build()
}
