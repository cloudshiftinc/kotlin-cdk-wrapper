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
 * The minimum and maximum amount of total accelerator memory, in MiB.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AcceleratorTotalMemoryMiBRequestProperty acceleratorTotalMemoryMiBRequestProperty =
 * AcceleratorTotalMemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratortotalmemorymibrequest.html)
 */
@CdkDslMarker
public class CfnSpotFleetAcceleratorTotalMemoryMiBRequestPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.Builder =
        CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.builder()

    /**
     * @param max The maximum amount of accelerator memory, in MiB. To specify no maximum limit,
     *   omit this parameter.
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum amount of accelerator memory, in MiB. To specify no minimum limit,
     *   omit this parameter.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty = cdkBuilder.build()
}
