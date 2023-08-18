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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ses.VdmAttributesProps

/**
 * Properties for the Virtual Deliverablity Manager (VDM) attributes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * VdmAttributesProps vdmAttributesProps = VdmAttributesProps.builder()
 * .engagementMetrics(false)
 * .optimizedSharedDelivery(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class VdmAttributesPropsDsl {
    private val cdkBuilder: VdmAttributesProps.Builder = VdmAttributesProps.builder()

    /** @param engagementMetrics Whether engagement metrics are enabled for your account. */
    public fun engagementMetrics(engagementMetrics: Boolean) {
        cdkBuilder.engagementMetrics(engagementMetrics)
    }

    /**
     * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account.
     */
    public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
        cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): VdmAttributesProps = cdkBuilder.build()
}
