@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineInputArtifactPropertyDsl {
  private val cdkBuilder: CfnPipeline.InputArtifactProperty.Builder =
      CfnPipeline.InputArtifactProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPipeline.InputArtifactProperty = cdkBuilder.build()
}
