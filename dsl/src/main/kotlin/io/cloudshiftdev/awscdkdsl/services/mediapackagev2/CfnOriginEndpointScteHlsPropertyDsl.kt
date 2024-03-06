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
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * The SCTE-35 HLS configuration associated with the origin endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * ScteHlsProperty scteHlsProperty = ScteHlsProperty.builder()
 * .adMarkerHls("adMarkerHls")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctehls.html)
 */
@CdkDslMarker
public class CfnOriginEndpointScteHlsPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.ScteHlsProperty.Builder =
        CfnOriginEndpoint.ScteHlsProperty.builder()

    /** @param adMarkerHls The SCTE-35 HLS ad-marker configuration. */
    public fun adMarkerHls(adMarkerHls: String) {
        cdkBuilder.adMarkerHls(adMarkerHls)
    }

    public fun build(): CfnOriginEndpoint.ScteHlsProperty = cdkBuilder.build()
}
