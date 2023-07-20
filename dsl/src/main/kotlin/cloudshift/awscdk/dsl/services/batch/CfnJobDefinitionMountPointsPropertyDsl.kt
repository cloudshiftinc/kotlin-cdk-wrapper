@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionMountPointsPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.MountPointsProperty.Builder =
      CfnJobDefinition.MountPointsProperty.builder()

  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  public fun readOnly(readOnly: IResolvable) {
    cdkBuilder.readOnly(readOnly)
  }

  public fun sourceVolume(sourceVolume: String) {
    cdkBuilder.sourceVolume(sourceVolume)
  }

  public fun build(): CfnJobDefinition.MountPointsProperty = cdkBuilder.build()
}
