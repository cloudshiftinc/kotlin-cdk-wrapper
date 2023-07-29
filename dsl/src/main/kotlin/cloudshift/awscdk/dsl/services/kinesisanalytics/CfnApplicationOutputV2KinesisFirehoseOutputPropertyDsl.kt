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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

/**
 * For a SQL-based Kinesis Data Analytics application, when configuring application output,
 * identifies a Kinesis Data Firehose delivery stream as the destination.
 *
 * You provide the stream Amazon Resource Name (ARN) of the delivery stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * KinesisFirehoseOutputProperty kinesisFirehoseOutputProperty =
 * KinesisFirehoseOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputV2KinesisFirehoseOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder =
        CfnApplicationOutputV2.KinesisFirehoseOutputProperty.builder()

    /** @param resourceArn The ARN of the destination delivery stream to write to. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationOutputV2.KinesisFirehoseOutputProperty = cdkBuilder.build()
}
