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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps

/**
 * Properties for a dedicated IP pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DedicatedIpPoolProps dedicatedIpPoolProps = DedicatedIpPoolProps.builder()
 * .dedicatedIpPoolName("dedicatedIpPoolName")
 * .build();
 * ```
 */
@CdkDslMarker
public class DedicatedIpPoolPropsDsl {
    private val cdkBuilder: DedicatedIpPoolProps.Builder = DedicatedIpPoolProps.builder()

    /** @param dedicatedIpPoolName A name for the dedicated IP pool. */
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
        cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    public fun build(): DedicatedIpPoolProps = cdkBuilder.build()
}
