@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionVolumeFromPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.VolumeFromProperty.Builder =
      CfnTaskDefinition.VolumeFromProperty.builder()

  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  public fun readOnly(readOnly: IResolvable) {
    cdkBuilder.readOnly(readOnly)
  }

  public fun sourceContainer(sourceContainer: String) {
    cdkBuilder.sourceContainer(sourceContainer)
  }

  public fun build(): CfnTaskDefinition.VolumeFromProperty = cdkBuilder.build()
}
