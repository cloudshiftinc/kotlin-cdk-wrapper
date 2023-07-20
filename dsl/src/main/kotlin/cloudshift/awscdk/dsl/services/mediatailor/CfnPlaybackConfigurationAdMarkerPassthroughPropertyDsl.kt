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

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import kotlin.Boolean

@CdkDslMarker
public class CfnPlaybackConfigurationAdMarkerPassthroughPropertyDsl {
    private val cdkBuilder: CfnPlaybackConfiguration.AdMarkerPassthroughProperty.Builder =
        CfnPlaybackConfiguration.AdMarkerPassthroughProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnPlaybackConfiguration.AdMarkerPassthroughProperty = cdkBuilder.build()
}
