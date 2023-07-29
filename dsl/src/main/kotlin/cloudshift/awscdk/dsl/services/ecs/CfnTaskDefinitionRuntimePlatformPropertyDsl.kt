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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * Information about the platform for the Amazon ECS service or task.
 *
 * For more information about `RuntimePlatform` , see
 * [RuntimePlatform](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * RuntimePlatformProperty runtimePlatformProperty = RuntimePlatformProperty.builder()
 * .cpuArchitecture("cpuArchitecture")
 * .operatingSystemFamily("operatingSystemFamily")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-runtimeplatform.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionRuntimePlatformPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.RuntimePlatformProperty.Builder =
        CfnTaskDefinition.RuntimePlatformProperty.builder()

    /**
     * @param cpuArchitecture The CPU architecture. You can run your Linux tasks on an ARM-based
     *   platform by setting the value to `ARM64` . This option is available for tasks that run on
     *   Linux Amazon EC2 instance or Linux containers on Fargate.
     */
    public fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
    }

    /** @param operatingSystemFamily The operating system. */
    public fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
    }

    public fun build(): CfnTaskDefinition.RuntimePlatformProperty = cdkBuilder.build()
}
