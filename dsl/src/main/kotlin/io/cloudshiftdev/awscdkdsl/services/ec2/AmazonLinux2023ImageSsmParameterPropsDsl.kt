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
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps
import software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.UserData

/**
 * Properties specific to al2023 images.
 *
 * Example:
 * ```
 * Vpc vpc;
 * Instance.Builder.create(this, "LatestAl2023")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
 * .machineImage(MachineImage.latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps.builder()
 * .cachedInContext(true)
 * .build()))
 * .build();
 * // or
 * // or
 * Instance.Builder.create(this, "LatestAl2023")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
 * // context cache is turned on by default
 * .machineImage(new AmazonLinux2023ImageSsmParameter())
 * .build();
 * ```
 */
@CdkDslMarker
public class AmazonLinux2023ImageSsmParameterPropsDsl {
    private val cdkBuilder: AmazonLinux2023ImageSsmParameterProps.Builder =
        AmazonLinux2023ImageSsmParameterProps.builder()

    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. By
     *   default, the newest image is used on each deployment. This will cause instances to be
     *   replaced whenever a new version is released, and may cause downtime if there aren't enough
     *   running instances in the AutoScalingGroup to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the same value will be
     * used on future runs. Your instances will not be replaced but your AMI version will grow old
     * over time. To refresh the AMI lookup, you will have to evict the value from the cache using
     * the `cdk context` command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    /** @param cpuType CPU Type. */
    public fun cpuType(cpuType: AmazonLinuxCpuType) {
        cdkBuilder.cpuType(cpuType)
    }

    /** @param edition What edition of Amazon Linux to use. */
    public fun edition(edition: AmazonLinuxEdition) {
        cdkBuilder.edition(edition)
    }

    /** @param kernel What kernel version of Amazon Linux to use. */
    public fun kernel(kernel: AmazonLinux2023Kernel) {
        cdkBuilder.kernel(kernel)
    }

    /** @param userData Initial user data. */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AmazonLinux2023ImageSsmParameterProps = cdkBuilder.build()
}
