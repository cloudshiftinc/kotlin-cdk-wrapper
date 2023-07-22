@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codepipeline.ActionArtifactBounds

@CdkDslMarker
public class ActionArtifactBoundsDsl {
  private val cdkBuilder: ActionArtifactBounds.Builder = ActionArtifactBounds.builder()

  /**
   * @param maxInputs the value to be set. 
   */
  public fun maxInputs(maxInputs: Number) {
    cdkBuilder.maxInputs(maxInputs)
  }

  /**
   * @param maxOutputs the value to be set. 
   */
  public fun maxOutputs(maxOutputs: Number) {
    cdkBuilder.maxOutputs(maxOutputs)
  }

  /**
   * @param minInputs the value to be set. 
   */
  public fun minInputs(minInputs: Number) {
    cdkBuilder.minInputs(minInputs)
  }

  /**
   * @param minOutputs the value to be set. 
   */
  public fun minOutputs(minOutputs: Number) {
    cdkBuilder.minOutputs(minOutputs)
  }

  public fun build(): ActionArtifactBounds = cdkBuilder.build()
}
