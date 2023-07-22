@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.IAction
import software.amazon.awscdk.services.codepipeline.StageProps

@CdkDslMarker
public class StagePropsDsl {
  private val cdkBuilder: StageProps.Builder = StageProps.builder()

  private val _actions: MutableList<IAction> = mutableListOf()

  /**
   * @param actions The list of Actions to create this Stage with.
   * You can always add more Actions later by calling `IStage#addAction`.
   */
  public fun actions(vararg actions: IAction) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The list of Actions to create this Stage with.
   * You can always add more Actions later by calling `IStage#addAction`.
   */
  public fun actions(actions: Collection<IAction>) {
    _actions.addAll(actions)
  }

  /**
   * @param stageName The physical, human-readable name to assign to this Pipeline Stage. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * @param transitionDisabledReason The reason for disabling transition to this stage.
   * Only applicable
   * if `transitionToEnabled` is set to `false`.
   */
  public fun transitionDisabledReason(transitionDisabledReason: String) {
    cdkBuilder.transitionDisabledReason(transitionDisabledReason)
  }

  /**
   * @param transitionToEnabled Whether to enable transition to this stage.
   */
  public fun transitionToEnabled(transitionToEnabled: Boolean) {
    cdkBuilder.transitionToEnabled(transitionToEnabled)
  }

  public fun build(): StageProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
