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
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnOriginEndpointCmafPackagePropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.CmafPackageProperty.Builder =
        CfnOriginEndpoint.CmafPackageProperty.builder()

    private val _hlsManifests: MutableList<Any> = mutableListOf()

    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryption(encryption: CfnOriginEndpoint.CmafEncryptionProperty) {
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

    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    public fun segmentPrefix(segmentPrefix: String) {
        cdkBuilder.segmentPrefix(segmentPrefix)
    }

    public fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun streamSelection(streamSelection: CfnOriginEndpoint.StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun build(): CfnOriginEndpoint.CmafPackageProperty {
        if (_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
        return cdkBuilder.build()
    }
}
