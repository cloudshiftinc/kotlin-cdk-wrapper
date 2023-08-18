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
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the CPU options for the instance.
 *
 * When you specify CPU options, you must specify both the number of CPU cores and threads per core.
 *
 * Modifying the CPU options for an instance results in instance
 * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
 * .
 *
 * For more information, see
 * [Optimize CPU options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html)
 * in the *Amazon Elastic Compute Cloud User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CpuOptionsProperty cpuOptionsProperty = CpuOptionsProperty.builder()
 * .coreCount(123)
 * .threadsPerCore(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html)
 */
@CdkDslMarker
public class CfnInstanceCpuOptionsPropertyDsl {
    private val cdkBuilder: CfnInstance.CpuOptionsProperty.Builder =
        CfnInstance.CpuOptionsProperty.builder()

    /** @param coreCount The number of CPU cores for the instance. */
    public fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
    }

    /** @param threadsPerCore The number of threads per CPU core. */
    public fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
    }

    public fun build(): CfnInstance.CpuOptionsProperty = cdkBuilder.build()
}
