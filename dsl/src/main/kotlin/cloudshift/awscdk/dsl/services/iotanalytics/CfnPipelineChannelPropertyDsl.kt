@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import kotlin.String

@CdkDslMarker
public class CfnPipelineChannelPropertyDsl {
    private val cdkBuilder: CfnPipeline.ChannelProperty.Builder =
        CfnPipeline.ChannelProperty.builder()

    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun build(): CfnPipeline.ChannelProperty = cdkBuilder.build()
}
