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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry

/**
 * Describes a range of ports.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html)
 */
@CdkDslMarker
public class CfnNetworkAclEntryPortRangePropertyDsl {
    private val cdkBuilder: CfnNetworkAclEntry.PortRangeProperty.Builder =
        CfnNetworkAclEntry.PortRangeProperty.builder()

    /**
     * @param from The first port in the range. Required if you specify 6 (TCP) or 17 (UDP) for the
     *   protocol parameter.
     */
    public fun from(from: Number) {
        cdkBuilder.from(from)
    }

    /**
     * @param to The last port in the range. Required if you specify 6 (TCP) or 17 (UDP) for the
     *   protocol parameter.
     */
    public fun to(to: Number) {
        cdkBuilder.to(to)
    }

    public fun build(): CfnNetworkAclEntry.PortRangeProperty = cdkBuilder.build()
}
