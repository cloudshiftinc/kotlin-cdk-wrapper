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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnChannel

/**
 * HLS ingest configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * HlsIngestProperty hlsIngestProperty = HlsIngestProperty.builder()
 * .ingestEndpoints(List.of(IngestEndpointProperty.builder()
 * .id("id")
 * .password("password")
 * .url("url")
 * .username("username")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-hlsingest.html)
 */
@CdkDslMarker
public class CfnChannelHlsIngestPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsIngestProperty.Builder =
        CfnChannel.HlsIngestProperty.builder()

    private val _ingestEndpoints: MutableList<Any> = mutableListOf()

    /** @param ingestEndpoints The input URL where the source stream should be sent. */
    public fun ingestEndpoints(vararg ingestEndpoints: Any) {
        _ingestEndpoints.addAll(listOf(*ingestEndpoints))
    }

    /** @param ingestEndpoints The input URL where the source stream should be sent. */
    public fun ingestEndpoints(ingestEndpoints: Collection<Any>) {
        _ingestEndpoints.addAll(ingestEndpoints)
    }

    /** @param ingestEndpoints The input URL where the source stream should be sent. */
    public fun ingestEndpoints(ingestEndpoints: IResolvable) {
        cdkBuilder.ingestEndpoints(ingestEndpoints)
    }

    public fun build(): CfnChannel.HlsIngestProperty {
        if (_ingestEndpoints.isNotEmpty()) cdkBuilder.ingestEndpoints(_ingestEndpoints)
        return cdkBuilder.build()
    }
}
