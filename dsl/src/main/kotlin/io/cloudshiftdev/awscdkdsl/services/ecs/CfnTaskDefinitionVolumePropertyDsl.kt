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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The data volume configuration for tasks launched using this task definition.
 *
 * Specifying a volume configuration in a task definition is optional. The volume configuration may
 * contain multiple volumes but only one volume configured at launch is supported. Each volume
 * defined in the volume configuration may only specify a `name` and one of either
 * `configuredAtLaunch` , `dockerVolumeConfiguration` , `efsVolumeConfiguration` ,
 * `fsxWindowsFileServerVolumeConfiguration` , or `host` . If an empty volume configuration is
 * specified, by default Amazon ECS uses a host volume. For more information, see
 * [Using data volumes in tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * VolumeProperty volumeProperty = VolumeProperty.builder()
 * .configuredAtLaunch(false)
 * .dockerVolumeConfiguration(DockerVolumeConfigurationProperty.builder()
 * .autoprovision(false)
 * .driver("driver")
 * .driverOpts(Map.of(
 * "driverOptsKey", "driverOpts"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .scope("scope")
 * .build())
 * .efsVolumeConfiguration(EFSVolumeConfigurationProperty.builder()
 * .filesystemId("filesystemId")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfigProperty.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build())
 * .rootDirectory("rootDirectory")
 * .transitEncryption("transitEncryption")
 * .transitEncryptionPort(123)
 * .build())
 * .host(HostVolumePropertiesProperty.builder()
 * .sourcePath("sourcePath")
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionVolumePropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.VolumeProperty.Builder =
        CfnTaskDefinition.VolumeProperty.builder()

    /**
     * @param configuredAtLaunch Indicates whether the volume should be configured at launch time.
     *   This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of
     *   a service. Each task definition revision may only have one volume configured at launch in
     *   the volume configuration.
     *
     * To configure a volume at launch time, use this task definition revision and specify a
     * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask`
     * or `StartTask` APIs.
     */
    public fun configuredAtLaunch(configuredAtLaunch: Boolean) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch)
    }

    /**
     * @param configuredAtLaunch Indicates whether the volume should be configured at launch time.
     *   This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of
     *   a service. Each task definition revision may only have one volume configured at launch in
     *   the volume configuration.
     *
     * To configure a volume at launch time, use this task definition revision and specify a
     * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask`
     * or `StartTask` APIs.
     */
    public fun configuredAtLaunch(configuredAtLaunch: IResolvable) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch)
    }

    /**
     * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
     *   Windows containers only support the use of the `local` driver. To use bind mounts, specify
     *   the `host` parameter instead.
     *
     * Docker volumes aren't supported by tasks run on AWS Fargate .
     */
    public fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
    }

    /**
     * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
     *   Windows containers only support the use of the `local` driver. To use bind mounts, specify
     *   the `host` parameter instead.
     *
     * Docker volumes aren't supported by tasks run on AWS Fargate .
     */
    public fun dockerVolumeConfiguration(
        dockerVolumeConfiguration: CfnTaskDefinition.DockerVolumeConfigurationProperty
    ) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
    }

    /**
     * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic File
     *   System file system for task storage.
     */
    public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
    }

    /**
     * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic File
     *   System file system for task storage.
     */
    public fun efsVolumeConfiguration(
        efsVolumeConfiguration: CfnTaskDefinition.EFSVolumeConfigurationProperty
    ) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
    }

    /**
     * @param host This parameter is specified when you use bind mount host volumes. The contents of
     *   the `host` parameter determine whether your bind mount host volume persists on the host
     *   container instance and where it's stored. If the `host` parameter is empty, then the Docker
     *   daemon assigns a host path for your data volume. However, the data isn't guaranteed to
     *   persist after the containers that are associated with it stop running.
     *
     * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
     * Windows containers can't mount directories on a different drive, and mount point can't be
     * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
     * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
     */
    public fun host(host: IResolvable) {
        cdkBuilder.host(host)
    }

    /**
     * @param host This parameter is specified when you use bind mount host volumes. The contents of
     *   the `host` parameter determine whether your bind mount host volume persists on the host
     *   container instance and where it's stored. If the `host` parameter is empty, then the Docker
     *   daemon assigns a host path for your data volume. However, the data isn't guaranteed to
     *   persist after the containers that are associated with it stop running.
     *
     * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
     * Windows containers can't mount directories on a different drive, and mount point can't be
     * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
     * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
     */
    public fun host(host: CfnTaskDefinition.HostVolumePropertiesProperty) {
        cdkBuilder.host(host)
    }

    /**
     * @param name The name of the volume. Up to 255 letters (uppercase and lowercase), numbers,
     *   underscores, and hyphens are allowed. When using a volume configured at launch, the `name`
     *   is required and must also be specified as the volume name in the
     *   `ServiceVolumeConfiguration` or `TaskVolumeConfiguration` parameter when creating your
     *   service or standalone task.
     *
     * For all other types of volumes, this name is referenced in the `sourceVolume` parameter of
     * the `mountPoints` object in the container definition.
     *
     * When a volume is using the `efsVolumeConfiguration` , the name is required.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTaskDefinition.VolumeProperty = cdkBuilder.build()
}
