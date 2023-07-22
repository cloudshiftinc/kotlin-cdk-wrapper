@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codepipeline.ActionArtifactBounds

/**
 * Specifies the constraints on the number of input and output artifacts an action can have.
 *
 * The constraints for each action type are documented on the
 * [Pipeline Structure
 * Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
 * page.
 *
 * Example:
 *
 * ```
 * // MyAction is some action type that produces variables, like EcrSourceAction
 * MyAction myAction = new MyAction(new MyActionProps()
 * // ...
 * .actionName("myAction")
 * );
 * new OtherAction(new OtherActionProps()
 * // ...
 * .config(myAction.getVariables().getMyVariable())
 * .actionName("otherAction")
 * );
 * ```
 */
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
