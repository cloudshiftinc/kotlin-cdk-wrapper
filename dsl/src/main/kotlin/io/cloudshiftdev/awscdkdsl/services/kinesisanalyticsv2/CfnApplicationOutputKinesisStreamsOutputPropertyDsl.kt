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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

/**
 * When you configure a SQL-based Managed Service for Apache Flink application's output, identifies
 * a Kinesis data stream as the destination.
 *
 * You provide the stream Amazon Resource Name (ARN).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * KinesisStreamsOutputProperty kinesisStreamsOutputProperty =
 * KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputKinesisStreamsOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.KinesisStreamsOutputProperty.Builder =
        CfnApplicationOutput.KinesisStreamsOutputProperty.builder()

    /** @param resourceArn The ARN of the destination Kinesis data stream to write to. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationOutput.KinesisStreamsOutputProperty = cdkBuilder.build()
}
