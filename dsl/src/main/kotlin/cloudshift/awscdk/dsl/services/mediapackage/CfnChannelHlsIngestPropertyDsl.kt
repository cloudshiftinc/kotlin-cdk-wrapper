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
import software.amazon.awscdk.services.mediapackage.CfnChannel
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnChannelHlsIngestPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsIngestProperty.Builder =
        CfnChannel.HlsIngestProperty.builder()

    private val _ingestEndpoints: MutableList<Any> = mutableListOf()

    public fun ingestEndpoints(vararg ingestEndpoints: Any) {
        _ingestEndpoints.addAll(listOf(*ingestEndpoints))
    }

    public fun ingestEndpoints(ingestEndpoints: Collection<Any>) {
        _ingestEndpoints.addAll(ingestEndpoints)
    }

    public fun ingestEndpoints(ingestEndpoints: IResolvable) {
        cdkBuilder.ingestEndpoints(ingestEndpoints)
    }

    public fun build(): CfnChannel.HlsIngestProperty {
        if (_ingestEndpoints.isNotEmpty()) cdkBuilder.ingestEndpoints(_ingestEndpoints)
        return cdkBuilder.build()
    }
}
