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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole

/**
 * The common properties for all task definitions.
 *
 * For more information, see
 * [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.iam.*;
 * ProxyConfiguration proxyConfiguration;
 * Role role;
 * CommonTaskDefinitionProps commonTaskDefinitionProps = CommonTaskDefinitionProps.builder()
 * .executionRole(role)
 * .family("family")
 * .proxyConfiguration(proxyConfiguration)
 * .taskRole(role)
 * .volumes(List.of(Volume.builder()
 * .name("name")
 * // the properties below are optional
 * .dockerVolumeConfiguration(DockerVolumeConfiguration.builder()
 * .driver("driver")
 * .scope(Scope.TASK)
 * // the properties below are optional
 * .autoprovision(false)
 * .driverOpts(Map.of(
 * "driverOptsKey", "driverOpts"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .build())
 * .efsVolumeConfiguration(EfsVolumeConfiguration.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfig.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build())
 * .rootDirectory("rootDirectory")
 * .transitEncryption("transitEncryption")
 * .transitEncryptionPort(123)
 * .build())
 * .host(Host.builder()
 * .sourcePath("sourcePath")
 * .build())
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CommonTaskDefinitionPropsDsl {
    private val cdkBuilder: CommonTaskDefinitionProps.Builder = CommonTaskDefinitionProps.builder()

    private val _volumes: MutableList<Volume> = mutableListOf()

    /**
     * @param executionRole The name of the IAM task execution role that grants the ECS agent
     *   permission to call AWS APIs on your behalf. The role will be used to retrieve container
     *   images from ECR and create CloudWatch log groups.
     */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param family The name of a family that this task definition is registered to. A family
     *   groups multiple versions of a task definition.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /** @param proxyConfiguration The configuration details for the App Mesh proxy. */
    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     *   call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    /**
     * @param volumes The list of volume definitions for the task. For more information, see
     *   [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    public fun volumes(volumes: VolumeDsl.() -> Unit) {
        _volumes.add(VolumeDsl().apply(volumes).build())
    }

    /**
     * @param volumes The list of volume definitions for the task. For more information, see
     *   [Task Definition Parameter Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide//task_definition_parameters.html#volumes).
     */
    public fun volumes(volumes: Collection<Volume>) {
        _volumes.addAll(volumes)
    }

    public fun build(): CommonTaskDefinitionProps {
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
