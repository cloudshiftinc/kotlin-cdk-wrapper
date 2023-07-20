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

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun artifacts(artifacts: ArtifactMap) {
    cdkBuilder.artifacts(artifacts)
  }

  public fun beforeSelfMutation(beforeSelfMutation: Boolean) {
    cdkBuilder.beforeSelfMutation(beforeSelfMutation)
  }

  public fun codeBuildDefaults(block: CodeBuildOptionsDsl.() -> Unit = {}) {
    val builder = CodeBuildOptionsDsl()
    builder.apply(block)
    cdkBuilder.codeBuildDefaults(builder.build())
  }

  public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
    cdkBuilder.codeBuildDefaults(codeBuildDefaults)
  }

  public fun fallbackArtifact(fallbackArtifact: Artifact) {
    cdkBuilder.fallbackArtifact(fallbackArtifact)
  }

  public fun pipeline(pipeline: CodePipeline) {
    cdkBuilder.pipeline(pipeline)
  }

  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  public fun scope(scope: Construct) {
    cdkBuilder.scope(scope)
  }

  public fun stackOutputsMap(stackOutputsMap: StackOutputsMap) {
    cdkBuilder.stackOutputsMap(stackOutputsMap)
  }

  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): ProduceActionOptions = cdkBuilder.build()
}
