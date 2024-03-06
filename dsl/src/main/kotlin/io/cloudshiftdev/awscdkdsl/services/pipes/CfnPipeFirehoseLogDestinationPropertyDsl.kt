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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * Represents the Amazon Data Firehose logging configuration settings for the pipe.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * FirehoseLogDestinationProperty firehoseLogDestinationProperty =
 * FirehoseLogDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-firehoselogdestination.html)
 */
@CdkDslMarker
public class CfnPipeFirehoseLogDestinationPropertyDsl {
    private val cdkBuilder: CfnPipe.FirehoseLogDestinationProperty.Builder =
        CfnPipe.FirehoseLogDestinationProperty.builder()

    /**
     * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Firehose delivery stream to
     *   which EventBridge delivers the pipe log records.
     */
    public fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    public fun build(): CfnPipe.FirehoseLogDestinationProperty = cdkBuilder.build()
}
