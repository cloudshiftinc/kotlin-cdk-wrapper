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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackagev2.CfnChannel

/**
 * The input URL where the source stream should be sent.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * IngestEndpointProperty ingestEndpointProperty = IngestEndpointProperty.builder()
 * .id("id")
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-channel-ingestendpoint.html)
 */
@CdkDslMarker
public class CfnChannelIngestEndpointPropertyDsl {
    private val cdkBuilder: CfnChannel.IngestEndpointProperty.Builder =
        CfnChannel.IngestEndpointProperty.builder()

    /** @param id The identifier associated with the ingest endpoint of the channel. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param url The URL associated with the ingest endpoint of the channel. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnChannel.IngestEndpointProperty = cdkBuilder.build()
}
