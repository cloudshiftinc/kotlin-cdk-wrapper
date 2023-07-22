@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.pipelines.ConnectionSourceOptions

@CdkDslMarker
public class ConnectionSourceOptionsDsl {
  private val cdkBuilder: ConnectionSourceOptions.Builder = ConnectionSourceOptions.builder()

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
   * @param connectionArn The ARN of the CodeStar Connection created in the AWS console that has
   * permissions to access this GitHub or BitBucket repository. 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * @param triggerOnPush Controls automatically starting your pipeline when a new commit is made on
   * the configured repository and branch.
   * If unspecified,
   * the default value is true, and the field does not display by default.
   */
  public fun triggerOnPush(triggerOnPush: Boolean) {
    cdkBuilder.triggerOnPush(triggerOnPush)
  }

  public fun build(): ConnectionSourceOptions = cdkBuilder.build()
}
