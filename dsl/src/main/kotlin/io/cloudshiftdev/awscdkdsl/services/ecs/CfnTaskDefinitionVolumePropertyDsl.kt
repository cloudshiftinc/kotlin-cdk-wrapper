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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The `Volume` property specifies a data volume used in a task definition.
 *
 * For tasks that use a Docker volume, specify a `DockerVolumeConfiguration` . For tasks that use a
 * bind mount host volume, specify a `host` and optional `sourcePath` . For more information about
 * `host` and optional `sourcePath` , see
 * [Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#volumes)
 * and
 * [Using Data Volumes in Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * VolumeProperty volumeProperty = VolumeProperty.builder()
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
     *   underscores, and hyphens are allowed. This name is referenced in the `sourceVolume`
     *   parameter of container definition `mountPoints` .
     *
     * This is required wwhen you use an Amazon EFS volume.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnTaskDefinition.VolumeProperty = cdkBuilder.build()
}
