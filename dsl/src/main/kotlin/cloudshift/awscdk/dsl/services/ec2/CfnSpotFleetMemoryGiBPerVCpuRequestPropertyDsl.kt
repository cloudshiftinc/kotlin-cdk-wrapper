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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * The minimum and maximum amount of memory per vCPU, in GiB.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * MemoryGiBPerVCpuRequestProperty memoryGiBPerVCpuRequestProperty =
 * MemoryGiBPerVCpuRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-memorygibpervcpurequest.html)
 */
@CdkDslMarker
public class CfnSpotFleetMemoryGiBPerVCpuRequestPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.Builder =
        CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.builder()

    /**
     * @param max The maximum amount of memory per vCPU, in GiB. To specify no maximum limit, omit
     *   this parameter.
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum amount of memory per vCPU, in GiB. To specify no minimum limit, omit
     *   this parameter.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnSpotFleet.MemoryGiBPerVCpuRequestProperty = cdkBuilder.build()
}
