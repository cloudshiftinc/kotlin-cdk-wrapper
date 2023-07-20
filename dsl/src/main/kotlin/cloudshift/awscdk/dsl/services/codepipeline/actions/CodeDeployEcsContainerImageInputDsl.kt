@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput

@CdkDslMarker
public class CodeDeployEcsContainerImageInputDsl {
  private val cdkBuilder: CodeDeployEcsContainerImageInput.Builder =
      CodeDeployEcsContainerImageInput.builder()

  public fun input(input: Artifact) {
    cdkBuilder.input(input)
  }

  public fun taskDefinitionPlaceholder(taskDefinitionPlaceholder: String) {
    cdkBuilder.taskDefinitionPlaceholder(taskDefinitionPlaceholder)
  }

  public fun build(): CodeDeployEcsContainerImageInput = cdkBuilder.build()
}
