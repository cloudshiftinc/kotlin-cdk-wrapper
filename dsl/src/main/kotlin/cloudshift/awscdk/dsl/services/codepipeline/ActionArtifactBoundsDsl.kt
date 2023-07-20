@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codepipeline.ActionArtifactBounds

@CdkDslMarker
public class ActionArtifactBoundsDsl {
  private val cdkBuilder: ActionArtifactBounds.Builder = ActionArtifactBounds.builder()

  public fun maxInputs(maxInputs: Number) {
    cdkBuilder.maxInputs(maxInputs)
  }

  public fun maxOutputs(maxOutputs: Number) {
    cdkBuilder.maxOutputs(maxOutputs)
  }

  public fun minInputs(minInputs: Number) {
    cdkBuilder.minInputs(minInputs)
  }

  public fun minOutputs(minOutputs: Number) {
    cdkBuilder.minOutputs(minOutputs)
  }

  public fun build(): ActionArtifactBounds = cdkBuilder.build()
}
