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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Identifies a Kinesis data stream as the streaming source.
 *
 * You provide the stream's Amazon Resource Name (ARN).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * KinesisStreamsInputProperty kinesisStreamsInputProperty = KinesisStreamsInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html)
 */
@CdkDslMarker
public class CfnApplicationV2KinesisStreamsInputPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.KinesisStreamsInputProperty.Builder =
        CfnApplicationV2.KinesisStreamsInputProperty.builder()

    /** @param resourceArn The ARN of the input Kinesis data stream to read. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationV2.KinesisStreamsInputProperty = cdkBuilder.build()
}
