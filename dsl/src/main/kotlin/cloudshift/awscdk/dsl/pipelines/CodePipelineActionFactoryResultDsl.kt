@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.services.codebuild.IProject

@CdkDslMarker
public class CodePipelineActionFactoryResultDsl {
  private val cdkBuilder: CodePipelineActionFactoryResult.Builder =
      CodePipelineActionFactoryResult.builder()

  /**
   * @param project If a CodeBuild project got created, the project.
   */
  public fun project(project: IProject) {
    cdkBuilder.project(project)
  }

  /**
   * @param runOrdersConsumed How many RunOrders were consumed. 
   * If you add 1 action, return the value 1 here.
   */
  public fun runOrdersConsumed(runOrdersConsumed: Number) {
    cdkBuilder.runOrdersConsumed(runOrdersConsumed)
  }

  public fun build(): CodePipelineActionFactoryResult = cdkBuilder.build()
}
