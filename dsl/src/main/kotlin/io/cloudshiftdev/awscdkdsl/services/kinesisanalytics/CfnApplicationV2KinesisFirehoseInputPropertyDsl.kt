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
 * For a SQL-based Kinesis Data Analytics application, identifies a Kinesis Data Firehose delivery
 * stream as the streaming source.
 *
 * You provide the delivery stream's Amazon Resource Name (ARN).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * KinesisFirehoseInputProperty kinesisFirehoseInputProperty =
 * KinesisFirehoseInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html)
 */
@CdkDslMarker
public class CfnApplicationV2KinesisFirehoseInputPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.KinesisFirehoseInputProperty.Builder =
        CfnApplicationV2.KinesisFirehoseInputProperty.builder()

    /** @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationV2.KinesisFirehoseInputProperty = cdkBuilder.build()
}
