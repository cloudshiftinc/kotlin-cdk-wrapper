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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * The minimum and maximum number of accelerators (GPUs, FPGAs, or AWS Inferentia chips) on an
 * instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AcceleratorCountProperty acceleratorCountProperty = AcceleratorCountProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-acceleratorcount.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateAcceleratorCountPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.AcceleratorCountProperty.Builder =
        CfnLaunchTemplate.AcceleratorCountProperty.builder()

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

    public fun build(): CfnLaunchTemplate.AcceleratorCountProperty = cdkBuilder.build()
}
