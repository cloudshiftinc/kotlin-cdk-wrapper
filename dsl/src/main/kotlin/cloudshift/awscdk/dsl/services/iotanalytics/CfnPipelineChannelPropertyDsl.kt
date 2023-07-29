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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

/**
 * Determines the source of the messages to be processed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * ChannelProperty channelProperty = ChannelProperty.builder()
 * .channelName("channelName")
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-channel.html)
 */
@CdkDslMarker
public class CfnPipelineChannelPropertyDsl {
    private val cdkBuilder: CfnPipeline.ChannelProperty.Builder =
        CfnPipeline.ChannelProperty.builder()

    /** @param channelName The name of the channel from which the messages are processed. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /** @param name The name of the 'channel' activity. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param next The next activity in the pipeline. */
    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun build(): CfnPipeline.ChannelProperty = cdkBuilder.build()
}
