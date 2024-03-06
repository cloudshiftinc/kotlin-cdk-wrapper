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

import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/** The segment associated with the origin endpoint. */
public inline fun CfnOriginEndpoint.setSegment(
    block: CfnOriginEndpointSegmentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginEndpointSegmentPropertyDsl()
    builder.apply(block)
    return setSegment(builder.build())
}
