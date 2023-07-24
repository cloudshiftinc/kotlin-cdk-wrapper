@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesis.CfnStream
import kotlin.String

/**
 * Specifies the capacity mode to which you want to set your data stream.
 *
 * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
 * *provisioned* capacity mode for your data streams.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesis.*;
 * StreamModeDetailsProperty streamModeDetailsProperty = StreamModeDetailsProperty.builder()
 * .streamMode("streamMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streammodedetails.html)
 */
@CdkDslMarker
public class CfnStreamStreamModeDetailsPropertyDsl {
    private val cdkBuilder: CfnStream.StreamModeDetailsProperty.Builder =
        CfnStream.StreamModeDetailsProperty.builder()

    /**
     * @param streamMode Specifies the capacity mode to which you want to set your data stream.
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     */
    public fun streamMode(streamMode: String) {
        cdkBuilder.streamMode(streamMode)
    }

    public fun build(): CfnStream.StreamModeDetailsProperty = cdkBuilder.build()
}
