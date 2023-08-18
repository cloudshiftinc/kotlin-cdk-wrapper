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
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-memorygibpervcpurequest.html)
 */
@CdkDslMarker
public class CfnEC2FleetMemoryGiBPerVCpuRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.Builder =
        CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.builder()

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

    public fun build(): CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty = cdkBuilder.build()
}
