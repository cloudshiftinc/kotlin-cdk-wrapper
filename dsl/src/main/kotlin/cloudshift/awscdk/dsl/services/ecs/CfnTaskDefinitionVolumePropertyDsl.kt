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

  public fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable) {
    cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
  }

  public
      fun dockerVolumeConfiguration(dockerVolumeConfiguration: CfnTaskDefinition.DockerVolumeConfigurationProperty) {
    cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration)
  }

  public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
    cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
  }

  public
      fun efsVolumeConfiguration(efsVolumeConfiguration: CfnTaskDefinition.EFSVolumeConfigurationProperty) {
    cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
  }

  public fun host(host: IResolvable) {
    cdkBuilder.host(host)
  }

  public fun host(host: CfnTaskDefinition.HostVolumePropertiesProperty) {
    cdkBuilder.host(host)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTaskDefinition.VolumeProperty = cdkBuilder.build()
}
