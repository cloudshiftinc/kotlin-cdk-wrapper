@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.ArtifactMap
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.pipelines.CodePipeline
import software.amazon.awscdk.pipelines.ProduceActionOptions
import software.amazon.awscdk.pipelines.StackOutputsMap
import software.amazon.awscdk.services.codepipeline.Artifact
import software.constructs.Construct

@CdkDslMarker
public class ProduceActionOptionsDsl {
  private val cdkBuilder: ProduceActionOptions.Builder = ProduceActionOptions.builder()

  /**
   * @param actionName Name the action should get. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param artifacts Helper object to translate FileSets to CodePipeline Artifacts. 
   */
  public fun artifacts(artifacts: ArtifactMap) {
    cdkBuilder.artifacts(artifacts)
  }

  /**
   * @param beforeSelfMutation Whether or not this action is inserted before self mutation.
   * If it is, the action should take care to reflect some part of
   * its own definition in the pipeline action definition, to
   * trigger a restart after self-mutation (if necessary).
   */
  public fun beforeSelfMutation(beforeSelfMutation: Boolean) {
    cdkBuilder.beforeSelfMutation(beforeSelfMutation)
  }

  /**
   * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
   * inherit.
   */
  public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptionsDsl.() -> Unit = {}) {
    val builder = CodeBuildOptionsDsl()
    builder.apply(codeBuildDefaults)
    cdkBuilder.codeBuildDefaults(builder.build())
  }

  /**
   * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
   * inherit.
   */
  public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
    cdkBuilder.codeBuildDefaults(codeBuildDefaults)
  }

  /**
   * @param fallbackArtifact An input artifact that CodeBuild projects that don't actually need an
   * input artifact can use.
   * CodeBuild Projects MUST have an input artifact in order to be added to the Pipeline. If
   * the Project doesn't actually care about its input (it can be anything), it can use the
   * Artifact passed here.
   */
  public fun fallbackArtifact(fallbackArtifact: Artifact) {
    cdkBuilder.fallbackArtifact(fallbackArtifact)
  }

  /**
   * @param pipeline The pipeline the action is being generated for. 
   */
  public fun pipeline(pipeline: CodePipeline) {
    cdkBuilder.pipeline(pipeline)
  }

  /**
   * @param runOrder RunOrder the action should get. 
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param scope Scope in which to create constructs. 
   */
  public fun scope(scope: Construct) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param stackOutputsMap Helper object to produce variables exported from stack deployments. 
   * If your step references outputs from a stack deployment, use
   * this to map the output references to Codepipeline variable names.
   *
   * Note - Codepipeline variables can only be referenced in action
   * configurations.
   */
  public fun stackOutputsMap(stackOutputsMap: StackOutputsMap) {
    cdkBuilder.stackOutputsMap(stackOutputsMap)
  }

  /**
   * @param variablesNamespace If this step is producing outputs, the variables namespace assigned
   * to it.
   * Pass this on to the Action you are creating.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): ProduceActionOptions = cdkBuilder.build()
}
