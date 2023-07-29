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
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.AmazonLinuxGeneration
import software.amazon.awscdk.services.ec2.AmazonLinuxImageProps
import software.amazon.awscdk.services.ec2.AmazonLinuxKernel
import software.amazon.awscdk.services.ec2.AmazonLinuxStorage
import software.amazon.awscdk.services.ec2.AmazonLinuxVirt
import software.amazon.awscdk.services.ec2.UserData

/**
 * Amazon Linux image properties.
 *
 * Example:
 * ```
 * IVpc vpc;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // instance to add as the target for load balancer.
 * Instance instance = Instance.Builder.create(this, "targetInstance")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
 * .build();
 * lb.addTarget(new InstanceTarget(instance));
 * ```
 */
@CdkDslMarker
public class AmazonLinuxImagePropsDsl {
    private val cdkBuilder: AmazonLinuxImageProps.Builder = AmazonLinuxImageProps.builder()

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

    /** @param generation What generation of Amazon Linux to use. */
    public fun generation(generation: AmazonLinuxGeneration) {
        cdkBuilder.generation(generation)
    }

    /** @param kernel What kernel version of Amazon Linux to use. */
    public fun kernel(kernel: AmazonLinuxKernel) {
        cdkBuilder.kernel(kernel)
    }

    /** @param storage What storage backed image to use. */
    public fun storage(storage: AmazonLinuxStorage) {
        cdkBuilder.storage(storage)
    }

    /** @param userData Initial user data. */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    /** @param virtualization Virtualization type. */
    public fun virtualization(virtualization: AmazonLinuxVirt) {
        cdkBuilder.virtualization(virtualization)
    }

    public fun build(): AmazonLinuxImageProps = cdkBuilder.build()
}
