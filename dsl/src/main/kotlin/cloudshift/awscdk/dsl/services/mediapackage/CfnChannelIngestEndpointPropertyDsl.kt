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
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnChannel

/**
 * An endpoint for ingesting source content for a channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * IngestEndpointProperty ingestEndpointProperty = IngestEndpointProperty.builder()
 * .id("id")
 * .password("password")
 * .url("url")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html)
 */
@CdkDslMarker
public class CfnChannelIngestEndpointPropertyDsl {
    private val cdkBuilder: CfnChannel.IngestEndpointProperty.Builder =
        CfnChannel.IngestEndpointProperty.builder()

    /** @param id The endpoint identifier. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param password The system-generated password for WebDAV input authentication. */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param url The input URL where the source stream should be sent. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    /** @param username The system-generated username for WebDAV input authentication. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnChannel.IngestEndpointProperty = cdkBuilder.build()
}
