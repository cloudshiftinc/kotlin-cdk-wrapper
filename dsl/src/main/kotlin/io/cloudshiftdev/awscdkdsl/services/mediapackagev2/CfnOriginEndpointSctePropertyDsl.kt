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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * The SCTE-35 configuration associated with the origin endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * ScteProperty scteProperty = ScteProperty.builder()
 * .scteFilter(List.of("scteFilter"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-scte.html)
 */
@CdkDslMarker
public class CfnOriginEndpointSctePropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.ScteProperty.Builder =
        CfnOriginEndpoint.ScteProperty.builder()

    private val _scteFilter: MutableList<String> = mutableListOf()

    /** @param scteFilter The filter associated with the SCTE-35 configuration. */
    public fun scteFilter(vararg scteFilter: String) {
        _scteFilter.addAll(listOf(*scteFilter))
    }

    /** @param scteFilter The filter associated with the SCTE-35 configuration. */
    public fun scteFilter(scteFilter: Collection<String>) {
        _scteFilter.addAll(scteFilter)
    }

    public fun build(): CfnOriginEndpoint.ScteProperty {
        if (_scteFilter.isNotEmpty()) cdkBuilder.scteFilter(_scteFilter)
        return cdkBuilder.build()
    }
}
