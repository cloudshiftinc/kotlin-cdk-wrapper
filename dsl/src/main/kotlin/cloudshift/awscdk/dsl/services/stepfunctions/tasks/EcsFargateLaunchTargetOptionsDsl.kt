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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions

/**
 * Properties to define an ECS service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * EcsFargateLaunchTargetOptions ecsFargateLaunchTargetOptions =
 * EcsFargateLaunchTargetOptions.builder()
 * .platformVersion(FargatePlatformVersion.LATEST)
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsFargateLaunchTargetOptionsDsl {
    private val cdkBuilder: EcsFargateLaunchTargetOptions.Builder =
        EcsFargateLaunchTargetOptions.builder()

    /**
     * @param platformVersion Refers to a specific runtime environment for Fargate task
     *   infrastructure. Fargate platform version is a combination of the kernel and container
     *   runtime versions.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion) {
        cdkBuilder.platformVersion(platformVersion)
    }

    public fun build(): EcsFargateLaunchTargetOptions = cdkBuilder.build()
}
