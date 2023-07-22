@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CodeCommitSourceOptionsDsl {
  private val cdkBuilder: CodeCommitSourceOptions.Builder = CodeCommitSourceOptions.builder()

  /**
   * @param actionName The action name used for this source in the CodePipeline.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param codeBuildCloneOutput If this is set, the next CodeBuild job clones the repository
   * (instead of CodePipeline downloading the files).
   * This provides access to repository history, and retains symlinks (symlinks would otherwise be
   * removed by CodePipeline).
   *
   * **Note**: if this option is true, only CodeBuild jobs can use the output artifact.
   */
  public fun codeBuildCloneOutput(codeBuildCloneOutput: Boolean) {
    cdkBuilder.codeBuildCloneOutput(codeBuildCloneOutput)
  }

  /**
   * @param eventRole Role to be used by on commit event rule.
   * Used only when trigger value is CodeCommitTrigger.EVENTS.
   */
  public fun eventRole(eventRole: IRole) {
    cdkBuilder.eventRole(eventRole)
  }

  /**
   * @param trigger How should CodePipeline detect source changes for this Action.
   */
  public fun trigger(trigger: CodeCommitTrigger) {
    cdkBuilder.trigger(trigger)
  }

  public fun build(): CodeCommitSourceOptions = cdkBuilder.build()
}
