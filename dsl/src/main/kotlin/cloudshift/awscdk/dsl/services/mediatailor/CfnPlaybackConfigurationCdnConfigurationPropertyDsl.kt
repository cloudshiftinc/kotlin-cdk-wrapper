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
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import kotlin.String

@CdkDslMarker
public class CfnPlaybackConfigurationCdnConfigurationPropertyDsl {
    private val cdkBuilder: CfnPlaybackConfiguration.CdnConfigurationProperty.Builder =
        CfnPlaybackConfiguration.CdnConfigurationProperty.builder()

    public fun adSegmentUrlPrefix(adSegmentUrlPrefix: String) {
        cdkBuilder.adSegmentUrlPrefix(adSegmentUrlPrefix)
    }

    public fun contentSegmentUrlPrefix(contentSegmentUrlPrefix: String) {
        cdkBuilder.contentSegmentUrlPrefix(contentSegmentUrlPrefix)
    }

    public fun build(): CfnPlaybackConfiguration.CdnConfigurationProperty = cdkBuilder.build()
}
