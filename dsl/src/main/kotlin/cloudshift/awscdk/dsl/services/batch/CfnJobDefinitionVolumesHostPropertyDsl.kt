@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionVolumesHostPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.VolumesHostProperty.Builder =
      CfnJobDefinition.VolumesHostProperty.builder()

  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnJobDefinition.VolumesHostProperty = cdkBuilder.build()
}
