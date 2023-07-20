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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number

@CdkDslMarker
public class CfnChannelVideoSelectorPidPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoSelectorPidProperty.Builder =
        CfnChannel.VideoSelectorPidProperty.builder()

    public fun pid(pid: Number) {
        cdkBuilder.pid(pid)
    }

    public fun build(): CfnChannel.VideoSelectorPidProperty = cdkBuilder.build()
}
