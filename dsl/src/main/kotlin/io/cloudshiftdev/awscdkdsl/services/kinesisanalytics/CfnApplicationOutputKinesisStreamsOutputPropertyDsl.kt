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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

/**
 * When configuring application output, identifies an Amazon Kinesis stream as the destination.
 *
 * You provide the stream Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis
 * Analytics can use to write to the stream on your behalf.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * KinesisStreamsOutputProperty kinesisStreamsOutputProperty =
 * KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputKinesisStreamsOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.KinesisStreamsOutputProperty.Builder =
        CfnApplicationOutput.KinesisStreamsOutputProperty.builder()

    /** @param resourceArn ARN of the destination Amazon Kinesis stream to write to. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
     *   destination stream on your behalf. You need to grant the necessary permissions to this
     *   role.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnApplicationOutput.KinesisStreamsOutputProperty = cdkBuilder.build()
}
