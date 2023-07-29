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
 * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
 * instance.
 *
 * To exclude accelerator-enabled instance types, set `Max` to `0` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AcceleratorCountRequestProperty acceleratorCountRequestProperty =
 * AcceleratorCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-acceleratorcountrequest.html)
 */
@CdkDslMarker
public class CfnSpotFleetAcceleratorCountRequestPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.AcceleratorCountRequestProperty.Builder =
        CfnSpotFleet.AcceleratorCountRequestProperty.builder()

    /**
     * @param max The maximum number of accelerators. To specify no maximum limit, omit this
     *   parameter. To exclude accelerator-enabled instance types, set `Max` to `0` .
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum number of accelerators. To specify no minimum limit, omit this
     *   parameter.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnSpotFleet.AcceleratorCountRequestProperty = cdkBuilder.build()
}
