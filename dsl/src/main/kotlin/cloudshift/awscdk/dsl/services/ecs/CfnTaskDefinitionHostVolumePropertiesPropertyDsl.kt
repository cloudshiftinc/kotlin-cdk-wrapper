@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionHostVolumePropertiesPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.HostVolumePropertiesProperty.Builder =
      CfnTaskDefinition.HostVolumePropertiesProperty.builder()

  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnTaskDefinition.HostVolumePropertiesProperty = cdkBuilder.build()
}
