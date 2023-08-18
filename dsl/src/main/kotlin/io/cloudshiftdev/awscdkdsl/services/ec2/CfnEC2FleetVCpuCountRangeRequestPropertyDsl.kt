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
 * The minimum and maximum number of vCPUs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VCpuCountRangeRequestProperty vCpuCountRangeRequestProperty =
 * VCpuCountRangeRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-vcpucountrangerequest.html)
 */
@CdkDslMarker
public class CfnEC2FleetVCpuCountRangeRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.VCpuCountRangeRequestProperty.Builder =
        CfnEC2Fleet.VCpuCountRangeRequestProperty.builder()

    /** @param max The maximum number of vCPUs. To specify no maximum limit, omit this parameter. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min The minimum number of vCPUs. To specify no minimum limit, specify `0` . */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnEC2Fleet.VCpuCountRangeRequestProperty = cdkBuilder.build()
}
