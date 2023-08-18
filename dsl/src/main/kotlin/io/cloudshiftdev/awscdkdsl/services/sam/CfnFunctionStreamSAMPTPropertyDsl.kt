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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * StreamSAMPTProperty streamSAMPTProperty = StreamSAMPTProperty.builder()
 * .streamName("streamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-streamsampt.html)
 */
@CdkDslMarker
public class CfnFunctionStreamSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.StreamSAMPTProperty.Builder =
        CfnFunction.StreamSAMPTProperty.builder()

    /** @param streamName the value to be set. */
    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): CfnFunction.StreamSAMPTProperty = cdkBuilder.build()
}
