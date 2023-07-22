@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionVolumePropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.VolumeProperty.Builder =
      CfnTaskDefinition.VolumeProperty.builder()

  /**
   * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
   * Windows containers only support the use of the `local` driver. To use bind mounts, specify the
   * `host` parameter instead.
   *
   *
   * Docker volumes aren't supported by tasks run on AWS Fargate .
   */
  public fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable) {
    cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
  }

  /**
   * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
   * Windows containers only support the use of the `local` driver. To use bind mounts, specify the
   * `host` parameter instead.
   *
   *
   * Docker volumes aren't supported by tasks run on AWS Fargate .
   */
  public
      fun dockerVolumeConfiguration(dockerVolumeConfiguration: CfnTaskDefinition.DockerVolumeConfigurationProperty) {
    cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
  }

  /**
   * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic File
   * System file system for task storage.
   */
  public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
    cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
  }

  /**
   * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic File
   * System file system for task storage.
   */
  public
      fun efsVolumeConfiguration(efsVolumeConfiguration: CfnTaskDefinition.EFSVolumeConfigurationProperty) {
    cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
  }

  /**
   * @param host This parameter is specified when you use bind mount host volumes.
   * The contents of the `host` parameter determine whether your bind mount host volume persists on
   * the host container instance and where it's stored. If the `host` parameter is empty, then the
   * Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed to
   * persist after the containers that are associated with it stop running.
   *
   * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
   * Windows containers can't mount directories on a different drive, and mount point can't be across
   * drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
   * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
   */
  public fun host(host: IResolvable) {
    cdkBuilder.host(host)
  }

  /**
   * @param host This parameter is specified when you use bind mount host volumes.
   * The contents of the `host` parameter determine whether your bind mount host volume persists on
   * the host container instance and where it's stored. If the `host` parameter is empty, then the
   * Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed to
   * persist after the containers that are associated with it stop running.
   *
   * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
   * Windows containers can't mount directories on a different drive, and mount point can't be across
   * drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
   * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
   */
  public fun host(host: CfnTaskDefinition.HostVolumePropertiesProperty) {
    cdkBuilder.host(host)
  }

  /**
   * @param name The name of the volume.
   * Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed.
   * This name is referenced in the `sourceVolume` parameter of container definition `mountPoints` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTaskDefinition.VolumeProperty = cdkBuilder.build()
}
