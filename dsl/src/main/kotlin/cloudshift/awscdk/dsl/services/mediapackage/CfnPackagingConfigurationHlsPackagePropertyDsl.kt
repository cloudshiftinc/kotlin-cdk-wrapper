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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPackagingConfigurationHlsPackagePropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.HlsPackageProperty.Builder =
        CfnPackagingConfiguration.HlsPackageProperty.builder()

    private val _hlsManifests: MutableList<Any> = mutableListOf()

    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryption(encryption: CfnPackagingConfiguration.HlsEncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    public fun hlsManifests(vararg hlsManifests: Any) {
        _hlsManifests.addAll(listOf(*hlsManifests))
    }

    public fun hlsManifests(hlsManifests: Collection<Any>) {
        _hlsManifests.addAll(hlsManifests)
    }

    public fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests)
    }

    public fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
    }

    public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
    }

    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
    }

    public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
    }

    public fun build(): CfnPackagingConfiguration.HlsPackageProperty {
        if (_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
        return cdkBuilder.build()
    }
}
