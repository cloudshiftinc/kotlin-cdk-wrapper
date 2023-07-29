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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole

/**
 * The properties for a task definition run on an External cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.iam.*;
 * ProxyConfiguration proxyConfiguration;
 * Role role;
 * ExternalTaskDefinitionProps externalTaskDefinitionProps = ExternalTaskDefinitionProps.builder()
 * .executionRole(role)
 * .family("family")
 * .networkMode(NetworkMode.NONE)
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
public class ExternalTaskDefinitionPropsDsl {
    private val cdkBuilder: ExternalTaskDefinitionProps.Builder =
        ExternalTaskDefinitionProps.builder()

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

    /**
     * @param networkMode The networking mode to use for the containers in the task. With ECS
     *   Anywhere, supported modes are bridge, host and none.
     */
    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
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

    public fun build(): ExternalTaskDefinitionProps {
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
