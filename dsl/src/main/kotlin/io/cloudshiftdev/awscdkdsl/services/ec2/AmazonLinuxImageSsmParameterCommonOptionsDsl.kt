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
import software.amazon.awscdk.services.ec2.AmazonLinuxCpuType
import software.amazon.awscdk.services.ec2.AmazonLinuxEdition
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions
import software.amazon.awscdk.services.ec2.UserData

/**
 * Common options across all generations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * UserData userData;
 * AmazonLinuxImageSsmParameterCommonOptions amazonLinuxImageSsmParameterCommonOptions =
 * AmazonLinuxImageSsmParameterCommonOptions.builder()
 * .cachedInContext(false)
 * .cpuType(AmazonLinuxCpuType.ARM_64)
 * .edition(AmazonLinuxEdition.STANDARD)
 * .userData(userData)
 * .build();
 * ```
 */
@CdkDslMarker
public class AmazonLinuxImageSsmParameterCommonOptionsDsl {
    private val cdkBuilder: AmazonLinuxImageSsmParameterCommonOptions.Builder =
        AmazonLinuxImageSsmParameterCommonOptions.builder()

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

    /** @param userData Initial user data. */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AmazonLinuxImageSsmParameterCommonOptions = cdkBuilder.build()
}
